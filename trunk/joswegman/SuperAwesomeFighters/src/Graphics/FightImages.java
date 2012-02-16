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
	
	public FightImages(){
		/*
		blockhighLeft   = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_block_high.jpg");
		blockhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_block_high.jpg");
		blocklowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_block_low.jpg");
		blocklowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_block_low.jpg");
		crawlLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_crawl.jpg");
		crawlRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_crawl.jpg");
		kickhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_kick_high.jpg");
		kickhighLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_kick_high.jpg");
		kicklowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_kick_low.jpg");
		kicklowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_kick_low.jpg");
		punchhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_punch_high.jpg");
		punchhighLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_punch_high.jpg");
		punchlowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_punch_low.jpg");
		punchlowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_punch_low.jpg");
		deadRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_r_dead.jpg");
		deadLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_pictures/bot_l_dead.jpg");
		*/
		stanceLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/stance_left.gif");
		stanceRight =  new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/stance_right_red.gif");
		blockhighLeft   = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/block_high.gif");
		blockhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/block_high_right_red.gif");
		blocklowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/block_low.gif");
		blocklowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/block_low_right_red.gif");
		crawlLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/crouch.gif");
		crawlRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/crouch_right_red.gif");
		kickhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/kick_high_right_red.gif");
		kickhighLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/kick_high.gif");
		kicklowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/kick_low_right_red.gif");
		kicklowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/kick_low.gif");
		punchhighRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/punch_high_right_red.gif");
		punchhighLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/punch_high.gif");
		punchlowRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/punch_low_right_red.gif");
		punchlowLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/punch_low.gif");
		deadRight = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/dead_right_red.gif");
		deadLeft = new ImageIcon ("/home/jos/workspace/SuperAwesomeFighters/bot_sprites/dead_left.gif");
		
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
