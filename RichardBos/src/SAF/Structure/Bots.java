package SAF.Structure;

import java.util.ArrayList;

public class Bots {
	public Bots()
	{ 
		System.out.println("new bots");
		ChildBots = new ArrayList<Bot>();
	}
	public void AddBot(Bot b)
	{
		System.out.println(b.name);
		ChildBots.add(b);
	}
	public ArrayList<Bot> ChildBots;
}
