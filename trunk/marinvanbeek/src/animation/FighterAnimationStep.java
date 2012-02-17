package animation;

import simulation.*;

import javax.swing.ImageIcon;

public class FighterAnimationStep
{
    public int position;
    public ImageIcon image;

    public FighterAnimationStep(int position, ImageIcon image)
    {
        this.position = position;
        this.image = image;
    }

    public static FighterAnimationStep getAnimation(FighterSprites sprites,
                                                    Fighter fighter)
    {
        ImageIcon image = sprites.getActionImage(fighter.currentAction);

        return new FighterAnimationStep(fighter.position, image);
    }

    public int getPosition()
    {
        return position;
    }

    public ImageIcon getIcon()
    {
        return image;
    }
}

