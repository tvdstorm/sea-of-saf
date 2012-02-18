package saf.syntax;

import saf.data.*;

public abstract class Condition
{
    public static boolean hasCondition(data.Condition conditionData, 
                                       String condition)
    {
        String conditionName = conditionData.getName();

        return conditionName.equals(condition);
    }

    public static boolean isWellFormed(data.Condition conditionData,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> requiredConditions = data.Condition.REQUIRED;
        List<String> legalConditions = data.Condition.LEGAL;
        String conditionName = conditionData.getName();

        if (!(requiredConditions.contains(name) || 
              legalConditions.contains(name)))
        {
            errorMessages.add("Illegal condition: '" + name + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

