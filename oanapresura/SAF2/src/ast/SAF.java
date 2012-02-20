package ast;

public class SAF {

	public Bot firstBot;
	public Bot secondBot;
	
	public SAF(){
		this.firstBot = new Bot();
		this.secondBot = new Bot();
	}
	
	public void setBot1(Bot b){
		this.firstBot = b;
	}
	
	public void setBot2(Bot b){		
		this.secondBot = b;
	}
	
	public Bot getBot1(){
		return this.firstBot;
	}
	
	public Bot getBot2(){
		return this.secondBot;
	}
}
