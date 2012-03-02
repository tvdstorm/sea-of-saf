package objects;

public class Behavior {	
	private Condition condition;
	private Move move;
	private Attack attack;
	
	public Behavior()
	{
				this.condition=new SimpleCondition();
				this.move=new Move();
				this.attack=new Attack();
	}
	public Behavior(Condition c,Move m,Attack a)
	{
				this.condition=c;
				this.move=m;
				this.attack=a;
	}
	public Behavior(Behavior b)
	{
				this.attack=b.getAttack();
				this.move=b.getMove();
				this.attack=b.getAttack();
	}
	public void setCondition(SimpleCondition c)
	{
	    this.condition = c;
	}
	public Condition getCondition()
	{
		return condition;
	}
	public void setMove(Move m)
	{
	    this.move = m;
	}
	public Move getMove()
	{
		return move;
	}
	public void setAttack(Attack a)
	{
	    this.attack = a;
	}
	public Attack getAttack()
{
	return attack;
}
}
