package game;

import java.awt.Component;

import ui.SafFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2){
			args=new String[]{"",""};
		}
		
		Fighter p1 =getFighter(args[0]);
		Fighter p2 =getFighter(args[1]);;
		
		SafFrame frame=new SafFrame(p1,p2);
		Component c=frame.getCanvas();
		Arena arena=new Arena(p1,p2,c);
		arena.run();
		frame.gameOver();
		
	}
	public static Fighter getFighter(String path){
		try{
			return (Fighter) Main.class.getClassLoader().loadClass(path).newInstance();
		}catch(Exception e){
			return new fighters.SampleFighter();
		}
	}

}
