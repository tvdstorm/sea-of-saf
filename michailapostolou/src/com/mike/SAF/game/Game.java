package game;


import java.awt.Point;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JLabel;

import messages.Message;

import com.mike.SAF.Bot;

public class Game {
	
	private Board board;
	private GameFrame GF;
	private JLabel p1Avatar;
	private JLabel p2Avatar;
	private Bot player1;
	private Bot player2;
	private Animation p1;
	private Animation p2;
	private int count=0;
	private ArrayList<String> p1moveSet;
	private ArrayList<String> p2moveSet;
	private String p1move;
	private String p2move;
	private ArrayList<Message> stream;
	
	public Game(ArrayList<Message> errors){
		this.stream = errors;
		GF = new GameFrame();
    	board = new Board();
    	GF.add(board);
	}
	
	public void start(){
    	ThreadHandler handler = new ThreadHandler(2);
    	p1 = new Animation(p1Avatar,"run_towards",player1.getOrientation(),p1Avatar.getLocation(),player1.getSpeed(),handler);
    	p2 = new Animation(p2Avatar,"run_towards",player2.getOrientation(),p2Avatar.getLocation(),player2.getSpeed(),handler);
		board.setP1Name(player1.getBotName());
		board.setP2Name(player2.getBotName());
		board.repaint();
		p1moveSet = player1.decideMove(p1Avatar.getLocation(), p2Avatar.getLocation(),player2.getHealth());
		p2moveSet = player2.decideMove(p2Avatar.getLocation(), p1Avatar.getLocation(),player1.getHealth());
    	while(!board.getGameEnded()){
//	    	if(p1.getThread()==null)
    		correctOrientation();
    		if(p1moveSet.size()!=0){
	    		if(p1.isAnimationFinished()){
	    			p1move = p1moveSet.get(0);
	    			didIHitHim(player1, 1, p1move, p2move, p1Avatar.getLocation(), p2Avatar.getLocation());
			    	p1.setAnimation(p1moveSet.get(0),player1.getOrientation(),p1Avatar.getLocation(),handler);
			    	p1moveSet.remove(0);
	    		}
    		}
    		else p1moveSet = player1.decideMove(p1Avatar.getLocation(), p2Avatar.getLocation(),player2.getHealth());
    		if(p2moveSet.size()!=0){
    			if(p2.isAnimationFinished()){
    				p2move = p2moveSet.get(0);
	    			didIHitHim(player2, 2, p2move, p1move, p2Avatar.getLocation(), p1Avatar.getLocation());
		    		p2.setAnimation(p2moveSet.get(0),player2.getOrientation(),p2Avatar.getLocation(),handler);
		    		p2moveSet.remove(0);
    			}
    		}
    		else p2moveSet = player2.decideMove(p2Avatar.getLocation(), p1Avatar.getLocation(),player1.getHealth());
    	}
    	String winner = board.getWinner();
    	System.out.println("GAME ENDED AND THE WINNER IS..........."+"\n"+winner);
	}
	
	private boolean didIHitHim(Bot me,int myId,String myMove, String hisMove, Point myLocation, Point hisLocation){
		Map<String,Integer> myPersonality = me.getPersonality();
		if(myLocation.x - hisLocation.x <=60){
			if(myMove.endsWith("_high")||myMove.endsWith("_low")){
				if(myMove.contains("kick"))
					myMove = "kickPower";
				else if(myMove.contains("punch"))
					myMove = "punchPower";
				else return false;
				int power = myPersonality.get(myMove);
				if(myMove.endsWith("_high")){
					if(hisMove.endsWith("_low")||hisMove.equals("crouch"))
						return false;
					if(hisMove.equals("block_high"))
						power = power/2;
					updateHealth(myId, power);
					return true;
				}
				else{
					if(hisMove.equals("block_low"))
						power = power/2;
					updateHealth(myId, power);
					return true;
				}
			}
			else return false;
		}
		else return false;
	}
	
	private void updateHealth(int myId,int amount){
		board.updateHealth(myId, amount);
		if(myId==1)
			player1.setHealth((board.getP1Health().getWidth()-amount)/2);
		else
			player2.setHealth((board.getP2Health().getWidth()-amount)/2);
	}
	
	public void loadBrain(Bot player){
		if(player1==null && player2==null){
			player.setOrientation(1);
			player.checkConsistency(stream);
			this.player1 = player;
			this.p1Avatar = board.getP1Avatar();
			this.p1Avatar.setName(player1.getBotName());
		}
		else if(player1!=null && player2==null){
			player.setOrientation(-1);
			player.checkConsistency(stream);
			this.player2 = player;
			this.p2Avatar = board.getP2Avatar();
			this.p2Avatar.setName(player2.getBotName());
		}
	}
	
	private void correctOrientation(){
		if(p1Avatar.getLocation().x>=p2Avatar.getLocation().x){
			player1.setOrientation(-1);
			player2.setOrientation(1);
		}
		else{
			player1.setOrientation(1);
			player2.setOrientation(-1);
		}
	}
}
