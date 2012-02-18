package saf.syntax;

import java.util.List;

public interface SyntaxCheck
{
    public boolean isWellFormed(List<String> errorMessages);
    public void setParseErrors(int nrParseErrors);
    public void printResult();
}

