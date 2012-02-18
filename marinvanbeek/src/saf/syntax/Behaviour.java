package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Behaviour
{
    public static boolean isWellFormed(data.Behaviour behaviourData, 
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<data.Tactic> tacticDatas = behaviourData.getTactics();

        boolean hasRequired = false;
        for (String requiredCondition : data.Condition.REQUIRED)
        {
            hasRequired = false;
            for (data.Tactic tacticData : tacticDatas)
            {
                if (Tactic.hasCondition(tacticData, requiredCondition))
                {
                    hasRequired = true;
                }
            }

            if (!hasRequired)
            {
                errorMessages.add("Missing required condition: '" +
                                  requiredCondition + "'.");
                wellFormed = false;
            }
        }

        for (dataTactic tacticData : tacticDatas)
        {
            wellFormed &= Tactic.isWellFormed(tacticData, errorMessages);
        }

        return wellFormed;
    }
}


