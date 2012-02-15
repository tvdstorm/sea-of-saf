package simulation;

import data.*;

import java.lang.Math;

public class State {
    data.Condition relativeStrength;
    data.Condition distanceToOpponent;

    public State(data.Condition relativeStrength, 
                 data.Condition distanceToOpponent)
    {
        this.relativeStrength = relativeStrength;
        this.distanceToOpponent = distanceToOpponent;
    }

    /* Determine the possible conditions defined in data.Condition from the
     * perspective of fighter1 (for example, much_stronger + near). */
    public static State getState(Fighter fighter1, Fighter fighter2)
    {
        return new State(getRelativeStrength(fighter1, fighter2),
                         getDistanceToOpponent(fighter1, fighter2));
    }

    private static data.Condition getRelativeStrength(Fighter fighter1, 
                                                      Fighter fighter2)
    {
        int strengthDifference = fighter1.strength - fighter2.strength;

        if (strengthDifference < -2)
        {
            return new data.Condition("much_weaker");
        }
        else if (strengthDifference < 0)
        {
            return new data.Condition("weaker");
        }
        else if (strengthDifference == 0)
        {
            return new data.Condition("even");
        }
        else if (strengthDifference > 2)
        {
            return new data.Condition("much_stronger");
        }
        else /* if (strengthDifference > 0) */
        {
            return new data.Condition("stronger");
        }
    }

    private static data.Condition getDistanceToOpponent(Fighter fighter1,
                                                        Fighter fighter2)
    {
        int distanceToFighter2 = Math.abs(fighter1.position -
                                          fighter2.position);

        if (distanceToFighter2 < 10)
        {
            return new data.Condition("near");
        }
        else
        {
            return new data.Condition("far");
        }
    }
}

