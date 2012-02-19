package saf.simulation;

import saf.data.*;

import java.util.List;
import java.util.ArrayList;

public abstract class Attribute
{
    public static int getValueByName(List<saf.data.Attribute> attributes, 
                                     String name)
    {
        for (saf.data.Attribute attribute : attributes)
        {
            if (attribute.getName().equals(name))
            {
                return attribute.getValue();
            }
        }

        return saf.data.Attribute.DEFAULT_VALUE;
    }
}

