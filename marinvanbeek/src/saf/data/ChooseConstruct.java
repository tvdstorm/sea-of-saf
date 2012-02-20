package saf.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/*
 * FIXME Choose behaviour shouldn't be implemented in the data package. Move
 * this functionality to the simulation package.
 */
public class ChooseConstruct
{
    private List<String> possibilities;

    public ChooseConstruct(String name)
    {
        this.possibilities = new ArrayList<String>();
        this.possibilities.add(name);
    }

    public ChooseConstruct(List<String> possibilities)
    {
        this.possibilities = possibilities;
    }

    private String choose(List<String> possibilities)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(possibilities.size());

        return possibilities.get(randomIndex); 
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
    
    public String getName() { return choose(possibilities); }
    /* Still make all possibilities readable for the syntax check. */
    public List<String> getAllPossibilities() { return possibilities; }
}

