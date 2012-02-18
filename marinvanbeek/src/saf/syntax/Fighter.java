package saf.syntax;

import saf.data.*;

class Fighter implements SyntaxCheck
{
    private int nrParseErrors = 0;
    private data.Fighter fighterData;

    public Fighter(data.Fighter fighterData)
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

        Attribute.isWellFormed(fighterData.getAttributes(), errorMessages);
        Behaviour.isWellFormed(fighterdata.getBehaviour(), errorMessages);

        return wellFormed;
    }

    public void setParseErrors(int nr)
    {
        nrParseErrors = nr;
    }
}

