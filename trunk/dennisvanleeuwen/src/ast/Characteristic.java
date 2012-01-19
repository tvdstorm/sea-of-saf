package ast;

public class Characteristic{
	public String item;
	public int value;
	
	public Characteristic(){
		item = "";
		value = 0;
	}
	
	@Override
	public String toString(){
		return item + " => " + value + "\n";
	}
}