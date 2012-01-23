package SAF;
import java.util.ArrayList;
import Generated.*;
import Generated.SAFParser.bots_return;
import SAF.Structure.*;
import org.antlr.runtime.*;

public class Main {
	public static void main(String args[]) throws Exception {
		SAFLexer lexer = new SAFLexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\Tests\\input2.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
              
        Bots bots = null;
        try {
        	bots_return _bots = parser.bots();
        	bots = _bots.bots;
        	for(Bot bot : bots.getBots())
        	{
        		System.out.println("Bot name: " + bot.getName() + " {");
        		for(Characteristic charact : bot.getCharacteristics())
            	{
        			System.out.println("   " + charact.getName() + " = " + charact.getValue());
            	}
        		
        		
        		for(Behavior behavior : bot.getBehaviors())
            	{
        			String strBehavior = "";
        			strBehavior = VisitCondition(behavior.getCondition());
        			System.out.print("  " + strBehavior + "[");
        			
        			ArrayList<String> moveActionValues = behavior.getMoveAction().getValues();
        			if(moveActionValues.size() > 1)
        				System.out.print("choose(");
        			
        			System.out.print(moveActionValues.get(0));
        			
        			for(int i = 1; i < moveActionValues.size(); i++)
        			{
        				System.out.print(" " + moveActionValues.get(i));
        			}
        			if(moveActionValues.size() > 1)
        				System.out.print(")");
        			

        			System.out.print(" ");
        			
        			ArrayList<String> fightActionValues = behavior.getFightAction().getValues();
        			if(fightActionValues.size() > 1)
        				System.out.print("choose(");
        			
        			System.out.print(fightActionValues.get(0));
        			
        			for(int i = 1; i < fightActionValues.size(); i++)
        			{
        				System.out.print(" " + fightActionValues.get(i));
        			}
        			
        			if(fightActionValues.size() > 1)
        				System.out.print(")");
        			
        			System.out.println("]");
            	}
        		System.out.println("}");
        	}
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
        
    	bots.accept(new SAFElementDoVisitor());
        
    }
	
	public static String VisitCondition(Condition condition)
	{
		String strReturn = "";
		if(condition == null)
			return "";
		
		if(condition instanceof StringCondition)
		{
			strReturn += " " + ((StringCondition)condition).getValue();
		}
		else
		{
			ChoiceCondition choiceCondition = (ChoiceCondition)condition;
			strReturn += VisitCondition(choiceCondition.getCondition());
			strReturn += " " + choiceCondition.getType().toString();
			strReturn += VisitCondition(choiceCondition.getSecondCondition());
		}
		
		return strReturn;
	}
}