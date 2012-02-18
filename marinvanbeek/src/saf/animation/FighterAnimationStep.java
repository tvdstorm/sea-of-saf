package saf.animation;

import saf.simulation.Fighter;

import javax.swing.ImageIcon;

public class FighterAnimationStep
{
    private int position;
    private ImageIcon image;

    public FighterAnimationStep(int position, ImageIcon image)
    {
        this.position = position;
        this.image = image;
    }

    public static FighterAnimationStep getAnimation(FighterSprites sprites,
                                                    Fighter fighter)
    {
        ImageIcon image = sprites.getActionImage(fighter.getAction());

        return new FighterAnimationStep(fighter.getPosition(), image);
    }

    public int getPosition() { return position; }
    public ImageIcon getIcon() { return image; }
}

