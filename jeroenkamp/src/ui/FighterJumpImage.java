package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import common.ActionType;

class FighterJumpImage extends FighterImage {
	public final int WIDTH=30;
	public final int HEIGHT=100;
	
	private final int HEADDIAMETER=10;
	private final int HEADX=5;
	private final int HEADY=5;
	private final int BODYLENGTH=20;
	private final int SHOULDERYOFFSET=3;
	
	
	private final int NECKX=HEADX+HEADDIAMETER/2;
	private final int NECKY=HEADY+HEADDIAMETER;
	
	private final int SHOULDERX=NECKX;
	private final int SHOULDERY=NECKY+SHOULDERYOFFSET;
	
	private final int ASSX=NECKX;
	private final int ASSY=BODYLENGTH+NECKY;
	
	private final int HITX=30;
	private final int HITHIGHY=35;
	private final int HITLOWY=60;
	private final int LEGY=ASSY+20;
	private final int ARMY=SHOULDERY+10;
	private final int IDLEX=ASSX+10;
	
	public Image createImage(IFighter f){
		Image img=new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g=img.getGraphics();
		g.setColor(Color.black);
		g.drawOval(HEADX, HEADY, HEADDIAMETER, HEADDIAMETER);
		g.drawLine(NECKX, NECKY, ASSX, ASSY);
		g.drawLine(ASSX,ASSY, 0, LEGY);
		g.drawLine(SHOULDERX, SHOULDERY, 0, ARMY);
		ActionType action=f.getActionState();
		if(action==ActionType.kick_high || action==ActionType.kick_low){
			g.drawLine(SHOULDERX, SHOULDERY, IDLEX, ARMY);
			if(action==ActionType.kick_high){
				g.drawLine(ASSX, ASSY, HITX, HITHIGHY);
			}
			else{
				g.drawLine(ASSX, ASSY, HITX, HITLOWY);
			}
		}
		else{
			g.drawLine(ASSX, ASSY, IDLEX, LEGY);
			if(action ==ActionType.punch_high){
				g.drawLine(SHOULDERX, SHOULDERY, HITX, HITHIGHY);
			}else if(action ==ActionType.punch_low){
				g.drawLine(SHOULDERX, SHOULDERY, HITX, HITLOWY);
			}
			else{
				g.drawLine(SHOULDERX,SHOULDERY, IDLEX, SHOULDERY);
				if(action == ActionType.block_high){
					g.drawLine(IDLEX,SHOULDERY,IDLEX,HITHIGHY);
				}
				else{
					g.drawLine(IDLEX, SHOULDERY, IDLEX, HITHIGHY);
				}
			}
		}
		g.dispose();
		return img;
	}
}
