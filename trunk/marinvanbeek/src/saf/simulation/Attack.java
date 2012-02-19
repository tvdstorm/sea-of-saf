package saf.simulation;

import saf.data.*;

public abstract class Attack
{
    public static int determineDamage(saf.data.Attack attack, State state)
    {
        int damage;
        saf.data.Condition relativeStrength = state.getRelativeStrength();
        saf.data.Condition distance = state.getDistanceToOpponent();

        if (distance.getName().equals("near"))
        {
            double factor;
            String strengthName = relativeStrength.getName();

            if (strengthName.equals("much_weaker"))
            {
                factor = 0.8;
            }
            else if (strengthName.equals("weaker"))
            {
                factor = 0.9;
            }
            else if (strengthName.equals("even"))
            {
                factor = 1.0;
            }
            else if (strengthName.equals("stronger"))
            {
                factor = 1.1;
            }
            else /* if (strengthName.equals("much_weaker")) */
            {
                factor = 1.2;
            }

            damage = (int)(determineDamage(attack) * factor);
        }
        else
        {
            damage = 0;
        }

        return damage;
    }

    private static int determineDamage(saf.data.Attack attack)
    {
        int damage;
        String attackName = attack.getName();

        if (attackName.equals("high_kick") ||
            attackName.equals("low_kick"))
        {
            damage = saf.data.Fighter.MAX_HEALTH / 2;
        }
        else
        {
            damage = saf.data.Fighter.MAX_HEALTH / 3;
        }

        return damage;
    }
}

