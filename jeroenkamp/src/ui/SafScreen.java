package ui;


import java.awt.*;

public class SafScreen extends Canvas{
	private static final long serialVersionUID = 1L;
	
	private IFighter m_Player1;
	private IFighter m_Player2; 
	private HealthBar m_P1Health;
	private HealthBar m_P2Health;
	
	private final int WIDTH=180;
	private final int XOFFSET=10;
	private final int HEALTHBARHEIGHT=20;
	private final int HEALTHBARY=40;
	
	public SafScreen(IFighter p1,IFighter p2){
		m_Player1=p1;
		m_Player2=p2;
		m_P1Health=new HealthBar(XOFFSET, HEALTHBARY, WIDTH, HEALTHBARHEIGHT);
		m_P2Health=new HealthBar(WIDTH+XOFFSET+XOFFSET, HEALTHBARY, WIDTH, HEALTHBARHEIGHT);
	}
	
	public void paint(Graphics g) {
		drawScreen(g);
	}
	private void drawScreen(Graphics g){
		g.setFont(new Font("sanserif",Font.BOLD,20));
		g.drawString(m_Player1.getName(), XOFFSET, 20);
		g.drawString(m_Player2.getName(), WIDTH+XOFFSET+XOFFSET, 20);
		m_P1Health.drawBar(m_Player1.getHealth(), m_Player1.getMaxHealth(),g );
		m_P2Health.drawBar(m_Player2.getHealth(), m_Player2.getMaxHealth(),g );
		drawFighters(g);
		
	}
	private int getPosition(int position){
		return position *10+50;
	}
	private void drawFighters(Graphics g){
		final int yoffset=100;
		final Point point =new Point(30,100);
		FighterImage f=FighterImage.createImage(m_Player1.getMoveState());
		Image img=f.createImage(m_Player1);
		FighterImage fighter2=FighterImage.createImage(m_Player2.getMoveState());
		Image img2=fighter2.createImage(m_Player2);
		int p2pos=getPosition( m_Player2.getPosition());
		int p1pos=getPosition( m_Player1.getPosition());
		if(m_Player1.getPosition()<m_Player2.getPosition()){
			g.drawImage(img, p1pos, yoffset,p1pos+point.x,yoffset+point.y ,0,0,point.x,point.y,this);
			g.drawImage(img2,p2pos,yoffset, p2pos+point.x,yoffset+point.y ,point.x,0,0,point.y,this);
		}else{
			g.drawImage(img,p1pos,yoffset, p1pos+point.x,yoffset+point.y, point.x,0,0,point.y,this);
			g.drawImage(img2,p2pos,yoffset, p2pos+point.x,yoffset+point.y, 0,0,point.x,point.y,this);
		}	
	}
}
