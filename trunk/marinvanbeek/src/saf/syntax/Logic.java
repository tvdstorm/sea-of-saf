package saf.syntax;

import saf.data.*;

public abstract class Logic
{
    public static boolean hasCondition(data.Logic logic, String condition)
    {
        if (logic instanceof data.Condition)
        {
            return Condition.hasCondition((data.Condition)logic, condition);
        }
        else /* if (logic instanceof data.LogicOperator) */
        {
            return false;
        }
    }

    public static boolean isWellFormed(data.Logic logic, 
                                       List<String> errorMessages)
    {
        if (logic instanceof data.Condition)
        {
            return Condition.isWellFormed((data.Condition)logic, 
                                          errorMessages);
        }
        else /* if (logic instanceof data.LogicOperator) */
        {
            return true;
        }
}

