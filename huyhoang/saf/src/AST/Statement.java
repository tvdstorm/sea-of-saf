package AST;

public abstract class Statement 
{
	public abstract void accept(Evaluator.EvaluationManager visitor);
}
