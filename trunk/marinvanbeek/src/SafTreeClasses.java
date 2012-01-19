import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.lang.Character;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;

//import used_classes;

class SafTreeNode extends CommonTree
{
    public SafTreeNode()
    {
    }

    /* Test if all SafTree children all well-formed. */
    public boolean isWellFormed()
    {
        Tree child;

        for (int i = 0; i < getChildCount(); i++)
        {
            child = getChild(i);

            if ((child instanceof SafTreeNode) && 
                !((SafTreeNode)child).isWellFormed())
                return false;
        }

        return true;
    }
}

class SafTreeFighter extends SafTreeNode
{
    public SafTreeFighter(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }
}

class SafTreeAttributes extends SafTreeNode
{
    public SafTreeAttributes(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    public boolean isWellFormed()
    {
        // FIXME No duplicates
        return super.isWellFormed();
    }
}

class SafTreeAttribute extends SafTreeNode
{
    public int value = -1;
    
    public SafTreeAttribute(int tType, String name, String value)
    {
        token = new CommonToken(tType, name);
        this.value = Integer.parseInt(value);
    }

    /* Attribute value should be between 0 and 11. */
    public boolean isWellFormed()
    {
        List<String> legal_attributes = Arrays.asList(SafAttribute.LEGAL);

        if (!(1 <= value) || !(value <= 10))
        {
            System.err.println("Attribute value: " + value + " not 1-10.");
            System.err.println(token.getText());
            return false;
        }

        if (!legal_attributes.contains(token.getText()))
        {
            System.err.println("Illegal attribute name: '" + token.getText() +
                                "'.");
            return false;
        }

        return true;
    }

    public String toString()
    {
        return token.getText() + "=" + value;
    }
}

class SafTreeBehaviour extends SafTreeNode
{
    public SafTreeBehaviour(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Required condition should be present. */
    public boolean isWellFormed()
    {
        List children = getChildren();
        List<String> required_conditions = 
                Arrays.asList(SafCondition.REQUIRED);

        for (String required : required_conditions)
        {
            for (Object child : children)
                if ((child instanceof SafTreeTactic) && 
                    ((SafTreeTactic)child).hasCondition(required))
                    break;
            else
            {
                System.err.println("Required condition: '" + required + "' " + 
                                   "not found.");
                //return false;
            }
        }

        return true;
    }
}

class SafTreeTactic extends SafTreeNode
{
    public SafTreeTactic(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }

    public boolean hasCondition(String condition)
    {
        if (getChildren().get(0) instanceof SafTreeCondition)
        {
            SafTreeCondition conditionChild =
                    (SafTreeCondition)getChildren().get(0);

            System.out.println(conditionChild.getText());
            return conditionChild.getText().equals(condition);
        }

        return false;
    }
}

class SafTreeMove extends SafTreeNode
{
    public SafTreeMove(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Actions should be in known actions. */
    public boolean isWellFormed()
    {
        List<String> legal_actions = Arrays.asList(SafMove.LEGAL);

        if (!legal_actions.contains(getText()))
        {
            System.err.println("Illegal move: '" + token.getText() + "'.");
            return false;
        }

        return true;
    }
}

class SafTreeAttack extends SafTreeNode
{
    public SafTreeAttack(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Actions should be in known actions. */
    public boolean isWellFormed()
    {
        List<String> legal_actions = Arrays.asList(SafAttack.LEGAL);

        if (!legal_actions.contains(getText()))
        {
            System.err.println("Illegal attack: '" + token.getText() + "'.");
            return false;
        }

        return true;
    }
}

class SafTreeComposedCondition extends SafTreeNode
{
    public SafTreeComposedCondition(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Condition name should in known conditions. */
    public boolean isWellFormed()
    {
        List<String> legal_conditions = 
                Arrays.asList(SafCondition.LEGAL);

        if (!legal_conditions.contains(getText()))
        {
            System.err.println("Illegal condition: '" + token.getText() + 
                               "'.");
            return false;
        }

        return true;
    }
}

class SafTreeCondition extends SafTreeNode
{
    public SafTreeCondition(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Condition name should in known conditions. */
    public boolean isWellFormed()
    {
        List<String> legal_conditions = 
                Arrays.asList(SafCondition.LEGAL);

        if (!legal_conditions.contains(getText()))
        {
            System.err.println("Illegal condition: '" + token.getText() + 
                               "'.");
            return false;
        }

        return true;
    }
}

class SafTreeLogic extends SafTreeNode
{
    public SafTreeLogic(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }
}

