package saf.ast;
import saf.checker.*;

public interface Statement 
{
	public void accept(Checker visitor);
	public void accept(Game.Interpreter visitor);
}
