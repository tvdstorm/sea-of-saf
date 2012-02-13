package simulation;

import data.*;

public interface Logic extends data.Logic
{
    public static class Converter
    {
        public static Logic convertLogic(data.Logic logic)
        {
            if (logic instanceof data.Condition)
            {
                return new Condition((data.Condition)logic);
            } else if (logic instanceof data.LogicAnd)
            {
                return new LogicAnd((data.LogicAnd)logic);
            } else /* if (logic instanceof data.LogicOr) */
            {
                return new LogicOr((data.LogicOr)logic);
            }
        }
    }

    public boolean isTrue(State state);
}

