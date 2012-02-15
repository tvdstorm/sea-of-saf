package com.mike.SAF;

import java.awt.Point;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Animations implements Runnable {

//	private static String resourceFolder = "/Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/Resources/Sprites/";
//	private int p1orientation;
//	private static String lr = "Left-Right";
//	private static String rl = "Right-Left";
//	private String location;
//	private int p1numberOfSprites;
//	private String[] p1spriteLocations;
//	ArrayList<ImageIcon> p1sprites = new ArrayList<ImageIcon>();
//    private Thread p1thread ;
//    private JLabel p1avatar;
//    private Point p1from;
//    private Point p1to;
//    private int p1speed;
//    private int p2numberOfSprites;
//	private String[] p2spriteLocations;
//	ArrayList<ImageIcon> p2sprites = new ArrayList<ImageIcon>();
//    private Thread p2thread ;
//    private JLabel p2avatar;
//    private Point p2from;
//    private Point p2to;
//    private int p2speed;
//    private Point p1location;
//    private Point p2location;
//    
//	public Animations(JLabel player1, String p1animation,int p1orientation,Point p1location, int p1speed,JLabel player2, String p2animation,int p2orientation,Point p2location, int p2speed){
//		this.p1speed = p1speed;
//		this.p2speed = p2speed;
//		this.p1from = p1location;
//		this.p2from = p2location;
//		this.p1orientation = p1orientation;
//		this.p1to = getResultingPoint(p1animation, p1location, p1orientation);
//		this.p2to = getResultingPoint(p2animation, p2location, p2orientation);
//		this.p1avatar = player1;
//		this.p2avatar = player2;
//		this.p1sprites = getSprites(p1animation,p1orientation);
//		this.p2sprites = getSprites(p2animation,p2orientation);
//		p1avatar.setLocation(p1location);
//		p2avatar.setLocation(p2location);
//		thread = new Thread(this);
//		thread.start();
//	}
//	
//
	@Override
	public void run() {
//		playAnimation();
	}
//	
//	public void setAnimation(String name, int orientation,Point p){
//		this.from = p;
//		sprites = getSprites(name, orientation);
//		this.to = getResultingPoint(name, p, orientation);
//		playAnimation();
////		run();
//	}
//	
//	public Thread getThread() {
//		return thread;
//	}
//	
//	private ArrayList<ImageIcon> getSprites(String name, int orientation) {
//		this.location = resourceFolder+ ((orientation == 1)?lr :rl)+"/"+name+"/";
//		File f = new File(this.location);
//		FilenameFilter filter = new FilenameFilter() {
//			
//			@Override
//			public boolean accept(File dir, String name) {
//				if(name.contains(".DS_Store"))
//					return false;
//				else return true;
//			}
//		};
//		this.spriteLocations = f.list(filter);
//		this.numberOfSprites = this.spriteLocations.length;
//		
//		for(String sprite:spriteLocations){
//			sprites.add(new ImageIcon(location+sprite));
//		}
//		return sprites;
//	}
//	
//	
//	public JLabel getAvatar() {
//		return avatar;
//	}
//	
//	
//    private void playAnimation(){
//    	if(thread == null){
//    		thread = new Thread(this);
//    		thread.start();
//    	}
//    	int state = 0;
//    	while(!isAnimationDone(state)){
//    		Double s = (state+1)*1.0;
//    		Double n = this.numberOfSprites*1.0;
//    		try{
//    			avatar.setIcon(sprites.get(state));
//    			
//    			Point tempLocation = new Point((from.x+orientation*((int)((to.x-from.x)*(s/n)))),to.y);
//    			avatar.setBounds(tempLocation.x, tempLocation.y, 120, 116);
////    			avatar.setLocation(tempLocation);
//    			Thread.sleep(speed);
//    		}
//    		catch (InterruptedException e){
//    			
//    		}
//    		state++;
//    	}
//    	thread=null;
//    }
//    
//    public boolean isAnimationDone(int state){
//    	boolean result = false;
//    	if(this.numberOfSprites == state)
//    		result = true;
//    	return result;
//    }
//    
//    private Point getResultingPoint(String name,Point currentPoint,int orientation){
//    	if(name.equals("punchHigh") || name.equals("kickHigh") || name.equals("punchLow") || name.equals("kickLow") || name.equals("crouch") || name.equals("stand") ){
//    		return currentPoint;
//    	}
//    	else{
//    		if(orientation==1)
//    			return new Point(currentPoint.x+70,currentPoint.y);
//    		else
//    			return new Point(currentPoint.x+70,currentPoint.y);
//    	}
//    }
//    
//    public void stop() {
//
//        if ( thread != null && thread.isAlive() )
//            thread.stop();
//
//       thread = null;
//   }

}
