package saf.syntax;

import saf.data.Fighter;

import java.util.List;

public interface SyntaxCheck
{
    public void setParseErrors(int nrParseErrors);
    public boolean isWellFormed(List<String> errorMessages);

    public saf.data.Fighter getFighterData();
}

