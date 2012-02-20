package saf.visualization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

import saf.syntax.Simple;
import saf.simulation.Instance;
import saf.simulation.Coordinate;
import saf.simulation.event.*;

public class GraphicalVisualizer extends JFrame implements Visualizer, ImageSet
{
    private static final int GROUND_HEIGHT = 100;

    private final HashMap<Instance, Sprite> fighters = new HashMap<Instance, Sprite>();

    public GraphicalVisualizer()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Super Awesome Fighters");
        setSize(1050,300);
        setVisible(true);
    }

    @Override
    public void visualize(Event event)
    {
    }

    @Override
    public void visualize(Block block)
    {
    }

    @Override
    public void visualize(BlockHigh blockHigh)
    {
        Instance fighter = blockHigh.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_BLOCK_HIGH);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_BLOCK_HIGH);
        }
        else
        {
            sprite.setImage(STAND_BLOCK_HIGH);
        }
    }

    @Override
    public void visualize(BlockLow blockLow)
    {
        Instance fighter = blockLow.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_BLOCK_LOW);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_BLOCK_LOW);
        }
        else
        {
            sprite.setImage(STAND_BLOCK_LOW);
        }
    }

    @Override
    public void visualize(ChangeHealth changeHealth)
    {
    }

    @Override
    public void visualize(Crouch crouch)
    {
        Sprite sprite = fighters.get(crouch.getSubject());
        sprite.setImage(CROUCH);
    }

    @Override
    public void visualize(Draw draw)
    {
    }

    @Override
    public void visualize(Hit hit)
    {
    }

    @Override
    public void visualize(Init init)
    {
        Instance fighter;
        Sprite sprite;

        fighter = init.getLeft();
        sprite = new Sprite(STAND);
        sprite.setPosition(fighter.getPosition().getX(), GROUND_HEIGHT);
        getContentPane().add(sprite.getLabel());
        fighters.put(fighter, sprite);

        fighter = init.getRight();
        sprite = new Sprite(STAND, true);
        sprite.setPosition(fighter.getPosition().getX(), GROUND_HEIGHT);
        getContentPane().add(sprite.getLabel());
        fighters.put(fighter, sprite);

        setVisible(true);
    }

    @Override
    public void visualize(Jump jump)
    {
        Sprite sprite = fighters.get(jump.getSubject());
        sprite.setImage(JUMP);
    }

    @Override
    public void visualize(KickHigh kickHigh)
    {
        Instance fighter = kickHigh.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_KICK_HIGH);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_KICK_HIGH);
        }
        else
        {
            sprite.setImage(STAND_KICK_LOW);
        }
    }

    @Override
    public void visualize(KickLow kickLow)
    {
        Instance fighter = kickLow.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_KICK_LOW);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_KICK_LOW);
        }
        else
        {
            sprite.setImage(STAND_KICK_LOW);
        }
    }

    @Override
    public void visualize(Miss miss)
    {
    }

    @Override
    public void visualize(MoveTo moveTo)
    {
        Instance fighter = moveTo.getSubject();
        Sprite sprite = fighters.get(fighter);
        sprite.setPosition(fighter.getPosition().getX(), GROUND_HEIGHT);
    }

    @Override
    public void visualize(PunchHigh punchHigh)
    {
        Instance fighter = punchHigh.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_PUNCH_HIGH);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_PUNCH_HIGH);
        }
        else
        {
            sprite.setImage(STAND_PUNCH_HIGH);
        }
    }

    @Override
    public void visualize(PunchLow punchLow)
    {
        Instance fighter = punchLow.getSubject();
        Sprite sprite = fighters.get(fighter);
        if (fighter.isCrouching())
        {
            sprite.setImage(CROUCH_PUNCH_LOW);
        }
        else if (fighter.isJumping())
        {
            sprite.setImage(JUMP_PUNCH_LOW);
        }
        else
        {
            sprite.setImage(STAND_PUNCH_LOW);
        }
    }

    @Override
    public void visualize(Stand stand)
    {
        Sprite sprite = fighters.get(stand.getSubject());
        sprite.setImage(STAND);
    }

    @Override
    public void visualize(StopAttack stopAttack)
    {
    }

    @Override
    public void visualize(Win win)
    {
        Instance loser = win.getLoser();
        Sprite sprite = fighters.get(loser);
        sprite.setImage(DEAD);
    }
}