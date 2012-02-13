package data;

import java.util.List;
import java.util.ArrayList;

public class Fighter
{
    public static final Integer MAX_HEALTH = 100;

    public String name;
    public List<Attribute> attributes;
    public Behaviour behaviour;

    public Fighter(String name, List<Attribute> attributes,
                      Behaviour behaviour)
    {
        this.name = name;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    public String toString()
    {
        String stringRep = name + "\n{\n";

        for (Attribute attribute : attributes)
        {
            stringRep += "    " + attribute + "\n";
        }

        stringRep += behaviour + "}\n";

        return stringRep;
    }
}

