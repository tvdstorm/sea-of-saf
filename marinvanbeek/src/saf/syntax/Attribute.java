package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Attribute
{
    public static boolean isWellFormed(List<data.Attribute> attributeDatas,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        for (data.Attribute attributeData : attributeDatas)
        {
            wellFormed &= checkAttribute(attributeData, errorMessages);
        }

        return wellFormed;
    }

    private static boolean checkAttribute(data.Attribute attributeData, 
                                          List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalNames = data.Attribute.LEGAL;
        String attributeName = attributeData.getName();

        int maxValue = data.Attribute.MAX_VALUE
        int attributeValue = attributeData.getValue();

        if (!legalNames.contains(attributeName))
        {
            errorMessages.add("Illegal attribute name: '" + attributeName + 
                              "'.");
            wellFormed = false;
        }

        if (!((attributeValue > 0) && (attributeValue <= maxValue)))
        {
            errorMessages.add("Illegal attribute value: '" + attributeValue + 
                              "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

