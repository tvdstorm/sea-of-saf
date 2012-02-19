package saf.animation;

import saf.simulation.Fighter;
import saf.data.Position;

import java.lang.Integer;

import java.util.Queue;
import java.util.ArrayDeque;

import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FighterAnimator
{
    private FighterSprites sprites;
    private JLabel label;
    private ImageIcon startIcon;
    private int xOffset;
    private Queue<FighterAnimationStep> animationQueue = 
            new ArrayDeque<FighterAnimationStep>();

    public FighterAnimator(String fighterName, Container contentPane)
    {
        this(new FighterSprites(fighterName), contentPane);
        xOffset = 0;
    }

    public FighterAnimator(String fighterName, Container contentPane, 
                           boolean flipped)
    {
        this(new FighterSprites(fighterName, flipped), 
             contentPane);
        xOffset = 80;
    }

    private FighterAnimator(FighterSprites sprites, Container contentPane)
    {
        this.sprites = sprites;
        startIcon = sprites.getImageByName("start");

        this.label = new JLabel();
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.white);

        contentPane.add(label);
    }

    private void setPosition(Position position, int width, int height)
    {
        int x = position.getX() + xOffset;
        int y = position.getY();

        label.setBounds(x, y, width, height);
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

    public void animateFirst()
    {
        /* Use the first animation to determine the starting position and
         * health. */
        FighterAnimationStep assistAnimation = animationQueue.peek();

        label.setIcon(startIcon);
        label.setText(Integer.toString(assistAnimation.getHealth()));
        setPosition(assistAnimation.getPosition(), startIcon.getIconWidth(),
                    startIcon.getIconHeight());
        label.repaint();
    }

    public void animateNext()
    {
        FighterAnimationStep nextAnimation = animationQueue.remove();
        ImageIcon nextIcon = nextAnimation.getIcon();

        label.setIcon(nextIcon);
        label.setText(Integer.toString(nextAnimation.getHealth()));
        setPosition(nextAnimation.getPosition(), nextIcon.getIconWidth(),
                    nextIcon.getIconHeight());
        label.repaint();
    }
}
