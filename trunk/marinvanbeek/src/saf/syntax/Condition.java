package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Condition
{
    public static boolean hasCondition(saf.data.Condition conditionData, 
                                       String condition)
    {
        String conditionName = conditionData.getName();

        return conditionName.equals(condition);
    }

    public static boolean isWellFormed(saf.data.Condition conditionData,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> requiredConditions = saf.data.Condition.REQUIRED;
        List<String> legalConditions = saf.data.Condition.LEGAL;
        String conditionName = conditionData.getName();

        if (!(requiredConditions.contains(conditionName) || 
              legalConditions.contains(conditionName)))
        {
            errorMessages.add("Illegal condition: '" + conditionName + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

