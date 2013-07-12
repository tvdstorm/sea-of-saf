package com.yennick.fighter.gui;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public final class StickMan extends JPanel{
	
	private Graphics2D g2;
	
	private boolean challenger;
	
	private int height;
	private int factor = 20;
	
	//offsets  
	private int xOffset;
	private int yOffset;
	private int xStart;
	private int yStart;
	
	private int legSize;
	private int armSize;
	private int bodySize;
	
	//actions
	private int kickL;
	private int kickR;
	
	private int punchL;
	private int punchR;

	private boolean block;
	private int highBlock;
	
	private boolean dead;
	
	public Dimension getPreferredSize(){
	    return new Dimension(250,250);
	}

	public StickMan (int height,boolean challenger){
		this.height = height*factor;
		this.challenger = challenger;
		
		setProps();
	}
	
	public StickMan() {
	}

	private void setProps(){
		xOffset = 125;
		yOffset = 245 - height ;
		
		xStart = xOffset;
		yStart = yOffset;
		
		legSize = height /2;
		armSize = height /3;
		bodySize = height /2;
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		//floor
		g.drawLine(0,245,250,245);
		
		//make possible to add weight
		g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		drawStickMan();
	}
	
	private void drawStickMan(){
		
		drawMan();
		drawArms();
		drawLegs();
		
		if(dead){
			this.unAct();
			g2.fillRect(xOffset- armSize, yOffset - bodySize,  bodySize +armSize,height *2);
		}

	}

	private void drawMan() {
		//draw head
		int headSize = height /5; 
		g2.drawOval(xOffset - (headSize /2), yOffset - headSize, headSize, headSize);
		
		//draw body
		g2.drawLine(xOffset, yOffset, xOffset, yOffset + bodySize);
	}

	private void drawLegs() {
		int width	= height /5;
		
		g2.drawLine(xOffset, yOffset + bodySize, xOffset - width - kickL  , yOffset +(legSize + bodySize) -kickL);		
		g2.drawLine(xOffset, yOffset + bodySize, xOffset + width + kickR , yOffset +(legSize + bodySize) -kickR);		
	}

	private void drawArms() {
		int shoulder =  bodySize /5;
		int width	= height /5;
		
		if(block)blockAction();
		
		g2.drawLine(xOffset, yOffset + shoulder, xOffset - width - punchL , yOffset +(armSize + shoulder) - punchL -highBlock );		
		g2.drawLine(xOffset, yOffset + shoulder, xOffset + width + punchR , yOffset +(armSize + shoulder) - punchR -highBlock );
		
	}
	
	public void block(boolean high){
		highBlock = (high)? height/3 : 0;
		block = true;
	}
	
	private void blockAction() {
		int side = height/5;
		if(challenger){
			side = -side;	
		} 
		g2.drawLine(xOffset + side, yOffset +bodySize/2 - highBlock, xOffset + side, yOffset + bodySize  - highBlock);		
	}

	public void kick(boolean high){
		int kick = (high)? height /2 : height /5;
		
		if(challenger){
			kickL = kick;
		} else {
			kickR = kick;
		}
 	}
	
	public void doAction(String action) {
		boolean high = false;
		if(action.indexOf('_') > 0){
			int us = action.indexOf('_');
			String type = action.substring(us+1);
			high = type.contains("high");
			action = action.substring(0,us);
			
		}
		
		//unAct();

		// not very pretty ...
		if(action.equals("kick")){
			kick(high);
		} else if(action.equals("punch")){
			punch(high);
		} else if(action.equals("block")){
			block(high);
		}
	}

	public void punch(boolean high){
		int punch = (high)? height /2 : height /5;
		if(challenger){
			punchL = punch;
		} else {
			punchR = punch;
		}
	}
	
	public void unAct(){
		punchL = 0;
		punchR = 0;
		kickL = 0;
		kickR = 0;
		highBlock = 0;
		legSize = height /2;
		block = false;
		xOffset = xStart;
		yOffset = yStart;
	}

	public void crouch(){
		legSize = height /3;
		yOffset = yOffset + (height/2 - height/3 );
	}

	public void jump(){
		legSize = height /3;
		yOffset = yOffset - (height/2 - height/3 );
	}

	public void move(int y, int x){
		xOffset = xOffset + x;
		yOffset = yOffset + y;
	}

	public void die() {
		
		this.dead = true;
	}

	public void setProps(int height, boolean challenger) {
		this.height = height*factor;
		this.challenger = challenger;
		
		setProps();
	}
}