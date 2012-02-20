package saf.syntax;

import saf.check.CheckLog;

public abstract class ASTNode
{
    public abstract String toString();

    public abstract void check(CheckLog log);
}