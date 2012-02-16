package saf.syntax;

public class Characteristic
{
    private final String name;
    private final int value;

    public Characteristic(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    public String toString()
    {
        return name + " = " + Integer.toString(value);
    }
}
