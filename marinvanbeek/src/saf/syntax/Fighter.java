package saf.syntax;

import saf.data.*;

import java.util.List;

public class Fighter implements SyntaxCheck
{
    private int nrParseErrors = 0;
    private saf.data.Fighter fighterData;

    public Fighter(saf.data.Fighter fighterData)
    {
        this.fighterData = fighterData;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        if (nrParseErrors > 0)
        {
            errorMessages.add("Number of parse errors: " + nrParseErrors);
            wellFormed = false;
        }

        wellFormed &= Attribute.isWellFormed(fighterData.getAttributes(), 
                                             errorMessages);
        wellFormed &= Behaviour.isWellFormed(fighterData.getBehaviour(), 
                                             errorMessages);

        return wellFormed;
    }

    public void setParseErrors(int nr)
    {
        nrParseErrors = nr;
    }

    public saf.data.Fighter getFighterData()
    {
        return fighterData;
    }
}

