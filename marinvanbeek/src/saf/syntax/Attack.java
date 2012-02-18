package saf.syntax;

import saf.data.*;

public abstract class Attack
{
    public boolean isWellFormed(data.Attack attackData,
                                List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalAttacks = data.Attack.LEGAL;
        String attackName = attackData.getName();

        if (!legalAttacks.contains(attackName))
        {
            errorMessages.add("Illegal attack: '" + attackName + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

