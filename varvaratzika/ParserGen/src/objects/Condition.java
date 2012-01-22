package objects;


public class Condition {
private String ConditionName=new String();
private String MovesName=new String();
private String AttacksName=new String();

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
}
