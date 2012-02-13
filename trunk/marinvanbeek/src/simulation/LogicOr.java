package simulation;

import data.*;

public class LogicOr extends data.LogicOr implements Logic
{
    public LogicOr (data.LogicOr logicOrData)
    {
        super(Converter.convertLogic(logicOrData.operand1),
              Converter.convertLogic(logicOrData.operand2));
    }

    public boolean isTrue(State state)
    {
        return ((Logic)operand1).isTrue(state) || 
               ((Logic)operand2).isTrue(state);
    }
}

