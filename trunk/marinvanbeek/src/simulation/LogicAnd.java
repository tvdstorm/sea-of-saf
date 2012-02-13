package simulation;

import data.*;

public class LogicAnd extends data.LogicAnd implements Logic
{
    public LogicAnd (data.LogicAnd logicAndData)
    {
        super(Converter.convertLogic(logicAndData.operand1),
              Converter.convertLogic(logicAndData.operand2));
    }

    public boolean isTrue(State state)
    {
        return ((Logic)operand1).isTrue(state) && 
               ((Logic)operand2).isTrue(state);
    }
}

