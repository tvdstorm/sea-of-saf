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
    private int movementDirection;
    private int fixDistance;
    private FighterSprites sprites;
    private JLabel label;
    private Queue<FighterAnimationStep> animationQueue = 
            new ArrayDeque<FighterAnimationStep>();

    public FighterAnimator(Position initialPosition, int movementDirection, 
                           String fighterName, Container contentPane)
    {
        this(initialPosition, new FighterSprites(fighterName), contentPane);

        this.movementDirection = movementDirection;
        this.fixDistance = 0;
    }

    public FighterAnimator(Position initialPosition, int movementDirection, 
                           String fighterName, Container contentPane, 
                           boolean flipped)
    {
        this(initialPosition, new FighterSprites(fighterName, flipped), 
             contentPane);

        this.movementDirection = movementDirection;
        this.fixDistance = ArenaAnimator.ARENA_WIDTH;
    }

    private FighterAnimator(Position initialPosition, FighterSprites sprites, 
                            Container contentPane)
    {
        this.sprites = sprites;

        ImageIcon startImage = sprites.getImageByName("start");
        this.label = new JLabel(startImage);
        contentPane.add(label);
        setPosition(initialPosition, startImage.getIconWidth(),
                    startImage.getIconHeight());

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.white);

        label.repaint();
    }

    private void setPosition(Position position, int width, int height)
    {
        int x = fixDistance + (movementDirection * position.getX());
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

