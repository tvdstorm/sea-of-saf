package foo;

public class SAF {

	Bot firstBot;
	Bot secondBot;
	
	public SAF(){
		this.firstBot = new Bot();
		this.secondBot = new Bot();
	}
	
	void setBot1(Bot b){
		this.firstBot = b;
	}
	
	void setBot2(Bot b){
		this.secondBot = b;
	}
	
	Bot getBot1(){
		return this.firstBot;
	}
	
	Bot getBot2(){
		return this.secondBot;
	}
}
