package saf.syntax;

public class Simple extends Response
{
    private final String id;

    public Simple(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public String toString()
    {
        return id;
    }
}
