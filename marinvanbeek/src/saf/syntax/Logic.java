package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Logic
{
    public static boolean hasCondition(saf.data.Logic logic, String condition)
    {
        if (logic instanceof saf.data.Condition)
        {
            return Condition.hasCondition((saf.data.Condition)logic, 
                                          condition);
        }
        else /* if (logic instanceof data.LogicOperator) */
        {
            return false;
        }
    }

    public static boolean isWellFormed(saf.data.Logic logic, 
                                       List<String> errorMessages)
    {
        if (logic instanceof saf.data.Condition)
        {
            return Condition.isWellFormed((saf.data.Condition)logic, 
                                          errorMessages);
        }
        else /* if (logic instanceof data.LogicOperator) */
        {
            return true;
        }
    }
}

