package saf.ui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import saf.common.ActionType;
import saf.common.MoveType;


public class FighterImage{
	private static FighterImage m_Instance;
	public final int WIDTH=50;
	public final int HEIGHT=100;
	private BufferedImage m_Image;
	private FighterImage(){
		try{
			m_Image=ImageIO.read(new File("imgs.gif"));
		}
		catch(IOException e){
			System.err.println("imgs.gif couldn't be loaded from the working directory");
			System.exit(1);
		}
	}
	public static FighterImage getFighterImage(){
		if(m_Instance==null){
			m_Instance=new FighterImage();
		}
		return m_Instance;
	}

	private int getMoveRow(MoveType type){
		switch(type){
		case jump: return 1;
		case crouch: return 2;
		default: return 0;
		}
	}
	private int getActionColumn(ActionType type){
		switch(type){
		case punch_high:
			return 0;
		case punch_low:
			return 1;
		case block_high:
			return 2;
		case block_low:
			return 3;
		case kick_low:
			return 4;
		case kick_high:
			return 5;
		}
		return 0;
	}
	public Image createImage(IFighter fighter){
		int row=getMoveRow(fighter.getMoveState());
		int column=getActionColumn(fighter.getActionState());
		return m_Image.getSubimage(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
	}
	
}


