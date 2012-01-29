package AST;

public interface Statement 
{
	public void accept(Evaluator.EvaluationManager visitor);
	public void accept(Game.Interpreter visitor);
}
