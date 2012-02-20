package saf.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ChooseConstruct
{
    private List<String> possibilities;

    public ChooseConstruct(String name)
    {
        this.possibilities = new ArrayList<String>();
        possibilities.add(name);
    }

    public ChooseConstruct(List<String> possibilities)
    {
        this.possibilities = possibilities;
    }

    public String toString()
    {
        String stringRepresentation = "";

        if (possibilities.size() == 1)
        {
            stringRepresentation = possibilities.get(0);
        }
        else
        {
            stringRepresentation = "choose ( ";
            for (String name : possibilities)
            {
                stringRepresentation += name + " ";
            }
            stringRepresentation += ")";
        }

        return stringRepresentation;
    }
    
    /* Choose one of the possible names. */
    public String getName()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(possibilities.size());

        return possibilities.get(randomIndex); 
    }
    public List<String> getAllPossibilities() { return possibilities; }
}

