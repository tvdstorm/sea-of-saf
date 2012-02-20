package saf.simulation;

import saf.data.*;

import java.lang.Math;

public class State {
    private saf.data.Condition relativeStrength;
    private saf.data.Condition distanceToOpponent;

    public State(saf.data.Condition relativeStrength, 
                 saf.data.Condition distanceToOpponent)
    {
        this.relativeStrength = relativeStrength;
        this.distanceToOpponent = distanceToOpponent;
    }

    /* Determine the true conditions (defined in saf.data.Condition) from the
     * perspective of fighter1 (for example, much_stronger + near). */
    public static State getState(Fighter fighter1, Fighter fighter2)
    {
        return new State(getRelativeStrength(fighter1, fighter2),
                         getDistanceToOpponent(fighter1, fighter2));
    }

    private static saf.data.Condition getRelativeStrength(Fighter fighter, 
                                                      Fighter opponent)
    {
        saf.data.Condition relativeStrength;
        int strengthThreshold = Fighter.MAX_STRENGTH / 2;
        int strengthDifference = fighter.getStrength() - 
                                 opponent.getStrength();

        if (strengthDifference < -1 * strengthThreshold)
        {
            relativeStrength = new saf.data.Condition("much_weaker");
        }
        else if (strengthDifference < 0)
        {
            relativeStrength = new saf.data.Condition("weaker");
        }
        else if (strengthDifference == 0)
        {
            relativeStrength = new saf.data.Condition("even");
        }
        else if (strengthDifference > strengthThreshold)
        {
            relativeStrength = new saf.data.Condition("much_stronger");
        }
        else /* if (strengthDifference > 0) */
        {
            relativeStrength = new saf.data.Condition("stronger");
        }

        return relativeStrength;
    }

    private static saf.data.Condition getDistanceToOpponent(Fighter fighter,
                                                            Fighter opponent)
    {
        saf.data.Condition distance;
        int fighterPosition = fighter.getPosition().getX();
        int opponentPosition = opponent.getPosition().getX();
        int distanceToOpponent = Math.abs(fighterPosition - opponentPosition);

        if (distanceToOpponent < saf.data.Move.RUN_DISTANCE * 2)
        {
            distance = new saf.data.Condition("near");
        }
        else
        {
            distance = new saf.data.Condition("far");
        }

        return distance;
    }

    public saf.data.Condition getRelativeStrength() 
    { 
        return relativeStrength;
    }
    public saf.data.Condition getDistanceToOpponent() 
    { 
        return distanceToOpponent;
    }
}

