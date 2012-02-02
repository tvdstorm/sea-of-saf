package grammar.Evaluators;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BotChecker implements BotVisit {
	List<String> conditionTypes = Arrays.asList("always","near","far","much_stronger","stronger","even","weaker","much_weaker", null);
	List<String> moveActions = Arrays.asList("walk_towards","walk_away","run_towards","run_away","jump","crouch","stand", null );
	List<String> fightActions = Arrays.asList( "block_low","block_high","kick_low","kick_high","punch_low","punch_high", null);
	List<String> operatorList = Arrays.asList("and", "or");
	
	private List <String> errorMessages = new LinkedList<String>();
	private List <String> initMessages = new LinkedList<String>();
	
	public BotChecker () {
		this.errorMessages.clear();
		this.initMessages.clear();
	}
	
	@Override
	public void visit(Characteristic character) {
		List<String>  charItems = Arrays.asList( "punchReach", "punchPower","kickReach","kickPower");
		boolean error = false;

		if  (!charItems.contains(character.getCharacterName())) {
			error = true;
			this.errorMessages.add("Invalid Character : " + character.getCharacterName());
		}
		
		if (!(character.getCharacterValue()<0) && (character.getCharacterValue()>10)){
			error = true;
			this.errorMessages.add("Character value : " + character.getCharacterName() + " = " + String.valueOf(character.getCharacterValue())+" is not within range!");
		}
		
		if (!error) {
			this.initMessages.add("Character : " + character.getCharacterName() + " = " + String.valueOf(character.getCharacterValue()));
		}
	}

	@Override
	public void visit(InputRule inputrule) {
		checkInputRule(inputrule, true);
		checkInputRule(inputrule, false);
	}

	private void checkInputRule (InputRule inputrule, boolean firstrule ){
		if ((this.moveActions.contains(inputrule.getInputrule(firstrule))) || (this.fightActions.contains(inputrule.getInputrule(firstrule)))){
			this.initMessages.add(inputrule.getInputrule(firstrule));
		}else {
			this.errorMessages.add("Inputrule:  "+ inputrule.getInputrule(firstrule) + "  is not valid!");
		}
	}
	
	@Override
	public void visit(Rule rule) {
		checkRule (rule);
	}

	public void checkRule (Rule rule) {
		visit(rule.getCondition());
		visit(rule.getRule(true));
		visit(rule.getRule(false));
	}
	
	@Override
	public void visit(Bot bot) {
		this.initMessages.add("Bot printout");
		for (Characteristic c : bot.getCharacteristics()) {
			visit(c);	
		}
		for (Rule i : bot.getRules()) {
			visit (i);
			visit (i.getCondition());
		}
		
		if (errorMessages.isEmpty()) {
			System.out.println(" Bot: "+ bot.getName() + " is valid!!!");
		}else {
			System.out.println(this.toString());
		}
	}

	@Override
	public void visit(Condition conor) { 
		if (this.operatorList.contains(conor.getType())||(conor.getType().contains("const"))){
			this.initMessages.add(conor.getType());
		} else {
			this.errorMessages.add("Type: "+ conor.getType()+" is not a valid type");
		}
		if (this.operatorList.contains(conor.getType())){
		  visit (conor.getRight());
		}
		if (this.conditionTypes.contains(conor.getLeft())) {
			this.initMessages.add(conor.getLeft());
		} else {
			this.errorMessages.add("Condition: "+ conor.getLeft()+" is not a valid condition");
		}
	}

	
	@Override
	public void visit(ConditionList conditionlist) {
	/*	for (Condition c : conditionlist.getList()) {
			visit (c.getRight());
			System.out.println("ConOr printout");
		}
		System.out.println("Condition printout1  "+ conditionlist.toString());
		*/
	}

	@Override
	public String toString() {
		return "BotChecker [errorMessages=" + errorMessages + ", initMessages="
				+ initMessages + "]";
	}
}
