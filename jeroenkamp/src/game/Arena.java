package game;

import java.awt.*;

public class Arena implements Runnable{
	public final int width=20;
	private Fighter m_Player1;
	private Fighter m_Player2;
	

	
	private boolean m_Continue;
	
	public int getWidth() {
		return width;
	}

	public Fighter getPlayer1() {
		return m_Player1;
	}

	public Fighter getPlayer2() {
		return m_Player2;
	}

	public Arena(String[] args,Graphics g){
		ClassLoader loader=ClassLoader.class.getClassLoader();
		try{
		m_Player1=(Fighter) loader.loadClass(args[0]).newInstance();
		}catch(Exception e){
			m_Player1=new fighters.SampleFighter();
		}
		m_Player1.init(5);
		try{
		m_Player2=(Fighter) loader.loadClass(args[1]).newInstance();;
		}catch(Exception e){
			m_Player1=new fighters.SampleFighter();
		}
		m_Player2.init(25);
	}
	
	
	public void run(){
		while(m_Continue){
			m_Player1.act();
			m_Player2.act();
		}
	}
}
