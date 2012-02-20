package objects;


public class Condition {
private String ConditionName=new String();
private String MovesName=new String();
private String AttacksName=new String();
private int Id = 0;

public Condition(String conditionName,String movesName,String attacksName,int id)
{
			this.setConditionName(conditionName.toString());
			this.setMovesName(movesName.toString());
			this.setAttacksName(attacksName.toString());
			this.setId(id);
}

public Condition() {
	// TODO Auto-generated constructor stub
}

public void setConditionName(String ConditionName)
{
    this.ConditionName = ConditionName;
}
public String getConditionName()
{
	return ConditionName;
}
public void setMovesName(String MovesName)
{
    this.MovesName = MovesName;
}
public String getMovesName()
{
	return MovesName;
}
public void setAttacksName(String AttacksName)
{
    this.AttacksName = AttacksName;
}
public String getAttacksName()
{
	return AttacksName;
}
public void setId(int i)
{
    this.Id = i;
}
public int getId()
{
	return Id;
}
}
