package grammar.Evaluators;

public interface BotVisit {
	public void visit(Characteristic character);
	public void visit(ConditionList conditionlist);
	public void visit(Condition condition);
	public void visit(InputRule inputrule);
	public void visit(Rule rule);
	public void visit(Bot bot);
}
