package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Attack
{
    public static boolean isWellFormed(saf.data.Attack attackData,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalAttacks = saf.data.Attack.LEGAL;
        String attackName = attackData.getName();

        if (!legalAttacks.contains(attackName))
        {
            errorMessages.add("Illegal attack: '" + attackName + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

