package ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public final class HealthBar {
	private int m_OffsetLeft;
	private int m_OffsetTop;
	private int m_Width;
	private int m_Height;
	
	public HealthBar(int offsetleft, int offsetTop, int width, int height){
		m_OffsetLeft=offsetleft;
		m_OffsetTop=offsetTop;
		m_Width=width;
		m_Height=height;
	}
	public void drawBar(int health, int maxhealth, Graphics g){
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.setPaint(new GradientPaint(0,0,Color.RED,m_Width,0,Color.GREEN,false));
		g2d.fillRect(m_OffsetLeft, m_OffsetTop, m_Width, m_Height);
		g2d.setColor(Color.black);
		g2d.drawRect(m_OffsetLeft, m_OffsetTop, m_Width, m_Height);
	}
}
