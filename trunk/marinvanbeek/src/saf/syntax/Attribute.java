package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Attribute
{
    public static boolean isWellFormed(List<saf.data.Attribute> attributeDatas,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        for (saf.data.Attribute attributeData : attributeDatas)
        {
            wellFormed &= checkSingleAttribute(attributeData, errorMessages);
        }

        return wellFormed;
    }

    private static boolean checkSingleAttribute(
            saf.data.Attribute attributeData, List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalNames = saf.data.Attribute.LEGAL;
        String attributeName = attributeData.getName();

        int maxValue = saf.data.Attribute.MAX_VALUE;
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

