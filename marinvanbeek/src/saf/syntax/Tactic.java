package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Tactic
{
    public static boolean isWellFormed(saf.data.Tactic tacticData,
                                       List<String> errorMessages)
    {
        saf.data.Logic tacticCondition = tacticData.getCondition();
        saf.data.Action tacticAction = tacticData.getAction();

        return Logic.isWellFormed(tacticCondition, errorMessages) &&
               Action.isWellFormed(tacticAction, errorMessages);
    }

    public static boolean hasCondition(saf.data.Tactic tacticData,
                                       String condition)
    {
        saf.data.Logic tacticCondition = tacticData.getCondition();

        return Logic.hasCondition(tacticCondition, condition);
    }
}

