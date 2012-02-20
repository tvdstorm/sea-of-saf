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
        int damage = 0;
        String attackName = attack.getName();

        if (attackName.equals("kick_high") ||
            attackName.equals("kick_low"))
        {
            damage = saf.data.Fighter.MAX_HEALTH / 6;
        }
        else if (attackName.equals("punch_high") ||
                 attackName.equals("punch_low"))
        {
            damage = saf.data.Fighter.MAX_HEALTH / 9;
        }

        return damage;
    }
}

