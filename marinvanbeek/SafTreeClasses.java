import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.lang.Character;
import java.util.List;

//import used_classes;

abstract class SafTree extends CommonTree
{
    int a = 0;

    public boolean isWellFormed()
    {
        Tree child;

        for (int i = 0; i < getChildCount(); i++)
        {
            child = getChild(i);

            if ((child instanceof SafTree) && !((SafTree)child).isWellFormed())
                return false;
        }

        return true;
    }
}

class SafFighter extends SafTree
{
    public SafFighter(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    public boolean isWellFormed()
    {
        if (getChildCount() != 3)
            return false;

        return super.isWellFormed();
    }
}

class SafName extends SafTree
{
    public SafName(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    public boolean isWellFormed()
    {
        for (char c : getText().toCharArray())
        {
            if (!Character.isLetter(c))
                return false;
        }

        return true;
    }
}

class SafTraits extends SafTree
{
    public SafTraits(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Trait names should be in trait list. */
    public boolean isWellFormed()
    {
        System.out.println("checking SafTraits");
        List children = getChildren();

        for (Object child : children)
        {
            if (child instanceof CommonTree)
                System.out.println(((CommonTree)child).getText());
        }

        return true;
    }
}

class SafBehaviour extends SafTree
{
    public SafBehaviour(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Always condition should be present. */
    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }
}

class SafTrait extends SafTree
{
    
    public SafTrait(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Trait value should be between 0 and 11. */
    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }
}

class SafCondition extends SafTree
{
    public SafCondition(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Condition name should in known conditions. */
    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }
}

class SafAction extends SafTree
{
    public SafAction(int tType, String name)
    {
        token = new CommonToken(tType, name);
    }

    /* Actions should be in known actions. */
    public boolean isWellFormed()
    {
        return super.isWellFormed();
    }
}

