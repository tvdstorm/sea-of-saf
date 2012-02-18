package Graphics;

import javax.swing.ImageIcon;

public class FightImages{
	private ImageIcon blockhighLeft;
	private ImageIcon blockhighRight;
	private ImageIcon blocklowRight;
	private ImageIcon blocklowLeft;
	private ImageIcon crawlRight;
	private ImageIcon crawlLeft;
	private ImageIcon kickhighRight;
	private ImageIcon kickhighLeft;
	private ImageIcon kicklowRight;
	private ImageIcon kicklowLeft;
	private ImageIcon punchhighRight;
	private ImageIcon punchhighLeft;
	private ImageIcon punchlowRight;
	private ImageIcon punchlowLeft;
	private ImageIcon deadRight;
	private ImageIcon deadLeft;
	private ImageIcon stanceLeft;
	private ImageIcon stanceRight;
	
	public enum fightimages{
		stance,blockhigh,blocklow,kickhigh,kicklow,punchhigh,punchlow,crawl,dead
	}
	
	public FightImages(){
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/bot_sprites/";
		//left
		stanceLeft      = new ImageIcon (defaultpath + "stance_left.gif");
		blockhighLeft   = new ImageIcon (defaultpath + "block_high.gif");
		blocklowLeft    = new ImageIcon (defaultpath + "block_low.gif");
		crawlLeft       = new ImageIcon (defaultpath + "crouch.gif");
		kickhighLeft    = new ImageIcon (defaultpath + "kick_high.gif");
		kicklowLeft     = new ImageIcon (defaultpath + "kick_low.gif");
		punchhighLeft   = new ImageIcon (defaultpath + "punch_high.gif");
		punchlowLeft    = new ImageIcon (defaultpath + "punch_low.gif");
		deadLeft        = new ImageIcon (defaultpath + "dead_left.gif");
		//right
		stanceRight     =  new ImageIcon (defaultpath + "stance_right_red.gif");
		blockhighRight  = new ImageIcon (defaultpath + "block_high_right_red.gif");
		blocklowRight   = new ImageIcon (defaultpath + "block_low_right_red.gif");
		crawlRight      = new ImageIcon (defaultpath + "crouch_right_red.gif");
		kickhighRight   = new ImageIcon (defaultpath + "kick_high_right_red.gif");
		kicklowRight    = new ImageIcon (defaultpath + "kick_low_right_red.gif");
		punchhighRight  = new ImageIcon (defaultpath + "punch_high_right_red.gif");
		deadRight       = new ImageIcon (defaultpath + "dead_right_red.gif");
		
	}
	
	public ImageIcon getImage(String name){
		if (name.contentEquals("standLeft") ){return stanceLeft;}
		if (name.contentEquals("block_highLeft") ){return blockhighLeft;}
		if (name.contentEquals("block_lowLeft") ){return blocklowLeft;}
		if (name.contentEquals("kick_highLeft") ){return kickhighLeft;}
		if (name.contentEquals("kick_lowLeft") ){return kicklowLeft;}
		if (name.contentEquals("punch_lowLeft") ){return punchlowLeft;}
		if (name.contentEquals("punch_highLeft") ){return punchhighLeft;}
		if (name.contentEquals("crouchLeft") ){return crawlLeft;}
		if (name.contentEquals("deadLeft") ){return deadLeft;}
		
		if (name.contentEquals("standRight") ){return stanceRight;}
		if (name.contentEquals("block_highRight") ){return blockhighRight;}
		if (name.contentEquals("block_lowRight") ){return blocklowRight;}
		if (name.contentEquals("kick_highRight") ){return kickhighRight;}
		if (name.contentEquals("kick_lowRight") ){return kicklowRight;}
		if (name.contentEquals("punch_lowRight") ){return punchlowRight;}
		if (name.contentEquals("punch_highRight") ){return punchhighRight;}
		if (name.contentEquals("crouchRight") ){return crawlRight;}
		if (name.contentEquals("deadRight") ){return deadRight;}
		return stanceRight;
		
	}
	
	public ImageIcon getImage1(fightimages f, boolean left){
		if (left){
			switch(f){
				case blockhigh: return blockhighLeft;
				case blocklow:  return blocklowLeft;
				case kickhigh:  return kickhighLeft;
				case kicklow:   return kicklowLeft;
				case punchhigh: return punchhighLeft;
				case punchlow:  return punchlowLeft;
				case crawl:     return crawlLeft;
				case dead:      return deadLeft;
			}
			return stanceLeft;
		}else {
			switch(f){
				case blockhigh: return blockhighRight;
				case blocklow:  return blocklowRight;
				case kickhigh:  return kickhighRight;
				case kicklow:   return kicklowRight;
				case punchhigh: return punchhighRight;
				case punchlow:  return punchlowRight;
				case crawl:     return crawlRight;
				case dead:      return deadRight;
			}
			return stanceRight;
		}
	}
	
	public ImageIcon getImages (int welke){
		ImageIcon tmp = new ImageIcon();
		switch (welke) { 
		case 1:tmp = blockhighLeft; break;
		case 2:tmp =  blockhighRight;break;
		case 3:tmp =  blocklowLeft;break;
		case 4:tmp =  blocklowRight;break;
		case 5:tmp =  crawlLeft; break;
		case 6:tmp =  crawlRight;break;
		case 7:tmp =  kickhighRight;break;
		case 8:tmp =  kickhighLeft;break;
		case 9:tmp =  kicklowRight;break;
		case 10:tmp =  kicklowLeft;break;
		case 11:tmp =  punchhighRight;break;
		case 12:tmp =  punchhighLeft;break;
		case 13:tmp =  punchlowRight;break;
		case 14:tmp =  punchlowLeft;break;
		case 15:tmp =  deadRight;break;
		case 16:tmp = deadLeft;break;
		case 17:tmp = stanceLeft;break;
		case 18:tmp = stanceRight;break;
		}
		return tmp;
	}

}
