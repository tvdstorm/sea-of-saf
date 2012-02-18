package saf.syntax;

import saf.data.*;

public abstract class Tactic
{
    public static boolean isWellFormed(data.Tactic tacticData,
                                       List<String> errorMessages)
    {
        data.Logic tacticCondition = tacticData.getCondition();
        data.Action tacticAction = tacticData.getAction();

        return Logic.isWellFormed(tacticCondition, errorMessages) &&
               Action.isWellFormed(tacticAction, errorMessages);
    }

    public static boolean hasCondition(data.Tactic tacticData,
                                       String condition)
    {
        data.Logic tacticCondition = tacticData.getCondition();

        return Logic.hascondition(tacticCondition, condition);
    }
}

