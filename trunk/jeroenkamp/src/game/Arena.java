package game;

import java.awt.*;

public class Arena implements Runnable{
	public static final int MAXPOS=40;
	private Fighter m_Player1;
	private Fighter m_Player2;
	private boolean m_Continue;
	private Component m_Canvas;
	
	public Fighter getPlayer1() {
		return m_Player1;
	}

	public Fighter getPlayer2() {
		return m_Player2;
	}

	public Arena(Fighter p1,Fighter p2,Component c){
		m_Player1=p1;
		m_Player2=p2;
		m_Player1.init(5,p2);
		m_Player2.init(25,p1);
		m_Canvas=c;
		m_Continue=true;
	}

	
	public void run(){
		int player1wait=getWaittime(m_Player1);
		int player2wait=getWaittime(m_Player2);
		boolean acted=true;
		while(m_Continue){
			player1wait--;
			player2wait--;
			if(player1wait<=0){
				m_Player1.act();
				player1wait=getWaittime(m_Player1);
				acted=true;
			}
			if(player2wait<=0){
				m_Player2.act();
				player2wait=getWaittime(m_Player2);
				acted=true;
			}
			if(acted){
				m_Canvas.repaint();
				acted=false;
			}
			try{
			Thread.sleep(200);
			}catch(InterruptedException e){
				//don't bother
			}
			if(m_Player1.getHealth()==0 || m_Player2.getHealth()==0){
				m_Continue=false;
			}
		}
	}
	private int getWaittime(Fighter f){
		return 10-f.getSpeed();
	}
}
