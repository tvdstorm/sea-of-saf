package simulation;

import data.*;

import java.util.List;
import java.util.ArrayList;

public class Attribute extends data.Attribute
{
    public Attribute (data.Attribute attributeData)
    {
        super(new String(attributeData.name),
              attributeData.value);
    }

    public static List<data.Attribute> convertDataList(List<data.Attribute>
                                                       attributes)
    {
        List<data.Attribute> convertedAttributes = 
                new ArrayList<data.Attribute>();

        for (data.Attribute attribute : attributes)
        {
            convertedAttributes.add(new Attribute(attribute));
        }

        return convertedAttributes;
    }
}

