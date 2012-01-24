package ast;

import java.util.ArrayList;
import java.util.List;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class ArenaElement implements ISAFElement{
	private List<BotElement> bots;

	public ArenaElement(){
		this.bots = new ArrayList<BotElement>();
	}
	
	public void addBot(BotElement bot){
		this.bots.add(bot);
	}

	public List<BotElement> getBots(){
		return this.bots;
	}	
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
		for(BotElement bot: this.bots)
			bot.accept(visitor);
	}  
}