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

    /* Determine the possible conditions defined in saf.data.Condition from the
     * perspective of fighter1 (for example, much_stronger + near). */
    public static State getState(Fighter fighter1, Fighter fighter2)
    {
        return new State(getRelativeStrength(fighter1, fighter2),
                         getDistanceToOpponent(fighter1, fighter2));
    }

    private static saf.data.Condition getRelativeStrength(Fighter fighter, 
                                                      Fighter opponent)
    {
        int strengthDifference = fighter.getStrength() - 
                                 opponent.getStrength();

        if (strengthDifference < -2)
        {
            return new saf.data.Condition("much_weaker");
        }
        else if (strengthDifference < 0)
        {
            return new saf.data.Condition("weaker");
        }
        else if (strengthDifference == 0)
        {
            return new saf.data.Condition("even");
        }
        else if (strengthDifference > 2)
        {
            return new saf.data.Condition("much_stronger");
        }
        else /* if (strengthDifference > 0) */
        {
            return new saf.data.Condition("stronger");
        }
    }

    private static saf.data.Condition getDistanceToOpponent(Fighter fighter,
                                                            Fighter opponent)
    {
        int distanceToFighter2 = Math.abs(fighter.getPosition() -
                                          opponent.getPosition());

        if (distanceToFighter2 < 10)
        {
            return new saf.data.Condition("near");
        }
        else
        {
            return new saf.data.Condition("far");
        }
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

