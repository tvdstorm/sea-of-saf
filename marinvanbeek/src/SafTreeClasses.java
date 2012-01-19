import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.lang.Character;
import java.lang.Integer;
import java.util.List;
import java.util.ArrayList;
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
        List<String> legal_attributes = SafAttribute.LEGAL;

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

class SafTreeMove extends SafTreeNode
{
    public SafTreeMove(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Actions should be in known actions. */
    public boolean isWellFormed()
    {
        List<String> legal_actions = SafMove.LEGAL;

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
        List<String> legal_actions = SafAttack.LEGAL;

        if (!legal_actions.contains(getText()))
        {
            System.err.println("Illegal attack: '" + token.getText() + "'.");
            return false;
        }

        return true;
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
        List<String> required_conditions = SafCondition.REQUIRED;
        boolean foundRequiredCondition = false;

        for (String required : required_conditions)
        {
            for (Object child : children)
                if ((child instanceof SafTreeTactic) && 
                    ((SafTreeTactic)child).hasCondition(required))
                    foundRequiredCondition = true;

            if (!foundRequiredCondition)
            {
                System.err.println("Required condition: '" + required + "' " + 
                                   "not found.");
                return false;
            }

            foundRequiredCondition = false;
        }

        return super.isWellFormed();
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
        if (getChildren().get(0) instanceof SafTreeComposedCondition)
        {
            SafTreeComposedCondition conditionChild =
                    (SafTreeComposedCondition)getChildren().get(0);

            return conditionChild.hasCondition(condition);
        }

        return false;
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
        return super.isWellFormed();
    }

    public boolean hasCondition(String condition)
    {
        if (getChildren().get(0) instanceof SafTreeCondition)
        {
            SafTreeCondition conditionChild =
                    (SafTreeCondition)getChildren().get(0);

            return conditionChild.getText().equals(condition);
        }

        return false;
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
                new ArrayList<String>(SafCondition.LEGAL);
        legal_conditions.addAll(SafCondition.REQUIRED);

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

