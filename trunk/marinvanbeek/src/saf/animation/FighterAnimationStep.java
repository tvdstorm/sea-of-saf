package saf.animation;

import saf.data.Fighter;
import saf.data.Position;

import javax.swing.ImageIcon;

public class FighterAnimationStep
{
    private int health;
    private Position position;
    private ImageIcon image;

    public FighterAnimationStep(int health, Position position, ImageIcon image)
    {
        this.health = health;
        this.position = position;
        this.image = image;
    }

    public static FighterAnimationStep getAnimation(FighterSprites sprites,
                                                    Fighter fighter)
    {
        ImageIcon image = sprites.getActionImage(fighter.getAction());

        return new FighterAnimationStep(fighter.getHealth(),
                                        fighter.getPosition(), image);
    }

    public int getHealth() { return health; }
    public Position getPosition() { return position; }
    public ImageIcon getIcon() { return image; }
}

