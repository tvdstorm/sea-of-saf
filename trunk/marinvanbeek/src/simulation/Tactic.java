package simulation;

import data.*;

import java.util.List;
import java.util.ArrayList;

public class Tactic extends data.Tactic
{
    public Tactic (data.Tactic tacticData)
    {
        super(Logic.Converter.convertLogic(tacticData.condition), 
              new Action(tacticData.action));
    }

    public static List<data.Tactic> convertDataList(List<data.Tactic> tactics)
    {
        List<data.Tactic> convertedTactics = new ArrayList<data.Tactic>();

        for (data.Tactic tactic : tactics)
        {
            convertedTactics.add(new Tactic(tactic));
        }

        return convertedTactics;
    }
}

