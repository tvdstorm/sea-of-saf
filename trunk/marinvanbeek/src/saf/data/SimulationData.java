package saf.data;

import java.util.List;

public class SimulationData
{
    List<Fighter> leftData;
    List<Fighter> rightData;

    public SimulationData(List<Fighter> leftData, List<Fighter> rightData)
    {
        this.leftData = leftData;
        this.rightData = rightData;
    }

    public List<Fighter> getLeftData() { return leftData; }
    public List<Fighter> getRightData() { return rightData; }
}

