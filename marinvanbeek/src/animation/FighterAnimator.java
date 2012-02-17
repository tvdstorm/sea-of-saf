package animation;

import simulation.*;

import java.util.Queue;
import java.util.ArrayDeque;

import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FighterAnimator
{
    FighterSprites sprites;
    JLabel label;
    Queue<FighterAnimationStep> animationQueue = 
            new ArrayDeque<FighterAnimationStep>();

    public FighterAnimator(String fighterName, Container contentPane)
    {
        this(new FighterSprites(fighterName), contentPane);
    }

    public FighterAnimator(String fighterName, Container contentPane, 
                           boolean flipped)
    {
        this(new FighterSprites(fighterName, flipped), contentPane);
    }

    private FighterAnimator(FighterSprites sprites, Container contentPane)
    {
        this.sprites = sprites;

        this.label = new JLabel(sprites.getImageByName("start"));
        contentPane.add(label);
        label.repaint();
    }

    public void bufferAnimation(Fighter fighter)
    {
        animationQueue.add(FighterAnimationStep.getAnimation(sprites, 
                                                             fighter));
    }

    public boolean hasAnimations()
    {
        if (animationQueue.peek() == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void animateNext()
    {
        FighterAnimationStep nextAnimation = animationQueue.remove();
        ImageIcon nextIcon = nextAnimation.getIcon();

        label.setIcon(nextIcon);
        label.setBounds(nextAnimation.getPosition(), 0, 
                        nextIcon.getIconWidth(), nextIcon.getIconHeight());
        label.repaint();
    }
}

