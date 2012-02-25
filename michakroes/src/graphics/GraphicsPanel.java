package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import config.settings;

import saf.*;

@SuppressWarnings("serial")
public class GraphicsPanel extends JPanel implements ActionListener, settings {
	
	private Timer timer;
	private Sprite fighterSprite;
	
	private Saf player1;
	private Saf player2;
	
	private String distanceStatus = "";
	    
	private BehaviourRule currentRulePlayer1;
	private BehaviourRule currentRulePlayer2;
	
	public GraphicsPanel(Sprite fighterSprite, Saf player1, Saf player2) {
		this.fighterSprite = fighterSprite;
		this.player1 = player1;
		this.player2 = player2;
		
		this.timer = new Timer(STEP_MS, this);
		this.timer.start();
		
		player1.setPosX(SCREEN_PADDING);
		player1.setPosY(OFFSET_Y);
		
		player2.setPosX(SCREEN_WIDTH - SCREEN_PADDING - PLAYER_WIDTH);
		player2.setPosY(OFFSET_Y);
   	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	@Override
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
        
		Graphics2D g2 = (Graphics2D)g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                			RenderingHints.VALUE_ANTIALIAS_ON);
		
        if (!checkGameOver(g2)) {
	        step();
			checkHit();
			walk();
			
	        drawFighterNames(g2);
			drawFighters(g2);
			drawHealth(g2);
			drawDistanceStatus(g2);
			drawRules(g2);
			drawFighterSpeed(g2);
			drawCoordinates(g2);
        }
    }
	
	public boolean checkGameOver(Graphics g2) {
		g2.setColor(Color.RED);
		
		if (this.player1.getHealth() < 0) {
			g2.drawString("Game Over, winner: " + this.player1.getName(), SCREEN_PADDING, PLAYER_HEIGHT + 250);
			return true;
		}
		
		if (this.player2.getHealth() < 0) {
			g2.drawString("Game Over, winner: " + this.player2.getName(), SCREEN_PADDING, PLAYER_HEIGHT + 250);
			return true;
		}
		
		return false;
	}
	
	public boolean checkHit() {
		int distance = player2.getPosX() - (player1.getPosX() + PLAYER_WIDTH);
		
		int p1_reach = getReach(player1, this.currentRulePlayer1);
		int p2_reach = getReach(player2, this.currentRulePlayer2);
		
		if (distance < p1_reach) {
			player2.setHealth( beat(player1, player2, this.currentRulePlayer1, this.currentRulePlayer2) );
			
			int newPosX = player1.getPosX() - 50;
			if (newPosX < SCREEN_PADDING) 
				newPosX = SCREEN_PADDING;
			
			player1.setPosX(newPosX);
			
			if (player2.getPosX() < (newPosX + 50) ) 
				player2.setPosX(newPosX + 50); 
			
			return true;
		}
		
		if (distance < p2_reach) {
			player1.setHealth( beat(player2, player1, this.currentRulePlayer2, this.currentRulePlayer1) );
			
			int newPosX = player2.getPosX() + 100;
			if (newPosX > (SCREEN_WIDTH - PLAYER_WIDTH)) 
				newPosX = SCREEN_WIDTH - PLAYER_WIDTH;
			
			player2.setPosX(newPosX);
			
			if (player1.getPosX() < (newPosX + 50 + PLAYER_WIDTH) ) 
				player1.setPosX(newPosX + 50 + PLAYER_WIDTH); 
			
			return true;
		} 
		
		return false;
	}
	
	private int beat(Saf p1, Saf p2, BehaviourRule r1, BehaviourRule r2) {		
		float hit_power = getPower(p1, r1);
		
		String p1_fight = r1.getFightAction().getType();
		String p2_fight = r2.getFightAction().getType();
		
		if (checkBlock(p1_fight, p2_fight))
			hit_power /= 2;
		
		return p2.getHealth() - (int) hit_power;
	}
	
	private boolean checkBlock(String p1_fight, String p2_fight) {
		if ( (p1_fight.equals(BLOCK_HIGH) && 
			 (p2_fight.equals(KICK_HIGH) || p2_fight.equals(PUNCH_HIGH))) ||
			 (p1_fight.equals(BLOCK_LOW) && 
			 (p2_fight.equals(KICK_LOW) || p2_fight.equals(PUNCH_LOW)))
			)
			return true;
		return false;
	}
	
	private int getReach(Saf player, BehaviourRule rule) {
		if (rule.getFightAction().getType().equals(KICK_HIGH) || 
			rule.getFightAction().getType().equals(KICK_LOW)) {
			return REACH_FACTOR * (player.getPersonality().getStrength(KICK_REACH).getValue());
		}
		
		if (rule.getFightAction().getType().equals(PUNCH_HIGH) || 
			rule.getFightAction().getType().equals(PUNCH_LOW)) {
			return REACH_FACTOR * (player.getPersonality().getStrength(KICK_REACH).getValue());
		}
		return 0;
	}
	
	private int getPower(Saf player, BehaviourRule rule) {
		if (rule.getFightAction().getType().equals(KICK_HIGH) || 
			rule.getFightAction().getType().equals(KICK_LOW)) {
			return player.getPersonality().getStrength(KICK_POWER).getValue();
		}
		
		if (rule.getFightAction().getType().equals(PUNCH_HIGH) || 
			rule.getFightAction().getType().equals(PUNCH_LOW)) {
			return player.getPersonality().getStrength(PUNCH_POWER).getValue();
		}
		return 0;
	}
	
	public void step() {
		this.distanceStatus = getDistanceStatus(player1, player2);
		
		String p1_health = EVEN;
		String p2_health = EVEN;
		
		if (isMuchStronger(player1, player2)) {
			p1_health = MUCH_STRONGER;
			p2_health = MUCH_WEAKER;
		} else if (isStronger(player1, player2)) {
			p1_health = STRONGER;
			p2_health = WEAKER;
		} 
		
		BehaviourRule p1_rule = player1.getBehaviour().getCondition(this.distanceStatus, p1_health);
		BehaviourRule p2_rule = player2.getBehaviour().getCondition(this.distanceStatus, p2_health);
				
		currentRulePlayer1 = p1_rule;
		currentRulePlayer2 = p2_rule;
	}
	
	private String getDistanceStatus(Saf s1, Saf s2) {
		String walk_status = NEAR;
				
		if ((player2.getPosX() - (player1.getPosX() + PLAYER_WIDTH)) > DISTANCE_THRESHOLD)			
			walk_status = FAR;
		
		return walk_status;
	}
		
	private void walk() {		
		if (currentRulePlayer1 != null && currentRulePlayer2 != null) {
			setPlayerPos(player1, currentRulePlayer1, true);
			setPlayerPos(player2, currentRulePlayer2, false);
		}
	}
	
	private void setPlayerPos(Saf player, BehaviourRule behaviourrule, boolean leftSide) {
		int x = player.getPosX();
		int speed = (int) player.getPersonality().getSpeed();
		
		if (speed < 1) speed = 1;
		
		if ( behaviourrule.getWalkAction().getType().equals(WALK_TOWARDS) ) {
			x = leftSide ? x + speed : x - speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(WALK_AWAY) ) {
			x = leftSide ? x - speed : x + speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(RUN_TOWARDS) ) {
			speed = (int) (speed * RUN_SPEED_FACTOR);
			x = leftSide ? x + speed : x - speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(RUN_AWAY) ) {
			speed = (int) (speed * RUN_SPEED_FACTOR);
			x = leftSide ? x - speed : x + speed;
		}
		
		if (x < SCREEN_PADDING) x = SCREEN_PADDING;
		if (x > (SCREEN_WIDTH - PLAYER_WIDTH)) x = SCREEN_WIDTH - PLAYER_WIDTH - SCREEN_PADDING;
		
		player.setPosX(x);
	}
	
	private boolean isStronger(Saf player1, Saf player2) {
		return player1.getHealth() > player2.getHealth();
	}
	
	private boolean isMuchStronger(Saf player1, Saf player2) {
		return player1.getHealth() > player2.getHealth() + HEALTH_THRESHOLD;
	}
	
	private void drawFighterNames(Graphics2D g2) {
		g2.drawString(this.player1.getName(), SCREEN_PADDING, PLAYER_HEIGHT + 60);
		g2.drawString(this.player2.getName(), SCREEN_WIDTH - SCREEN_PADDING - PLAYER_WIDTH, PLAYER_HEIGHT + 60);
	}
	
	private void drawFighterSpeed(Graphics2D g2) {
		g2.drawString("Speed: " + player1.getPersonality().getSpeed(), SCREEN_PADDING, PLAYER_HEIGHT + 210);
		g2.drawString("Speed: " + player2.getPersonality().getSpeed(), (SCREEN_WIDTH / 2) + SCREEN_PADDING, PLAYER_HEIGHT + 210);
	}
	
	private void drawHealth(Graphics2D g2) {
		g2.setColor(Color.black);
		g2.drawRect(SCREEN_PADDING, PLAYER_HEIGHT + 80, PLAYER_WIDTH, 30);
		g2.drawRect(SCREEN_WIDTH - SCREEN_PADDING - PLAYER_WIDTH, PLAYER_HEIGHT + 80, PLAYER_WIDTH, 30);		
		
		g2.setColor(Color.green);
		g2.fillRect(SCREEN_PADDING + 1, PLAYER_HEIGHT + 81, (player1.getHealth() * 2) - 2, 29);
		g2.fillRect(SCREEN_WIDTH - SCREEN_PADDING - PLAYER_WIDTH + 1, PLAYER_HEIGHT + 81, (player2.getHealth() * 2) - 2, 29);		
	}
	
	public int[] getCurrentSprite(BehaviourRule rule) {
		String fight = "";
		if (rule != null) {
			fight = rule.getFightAction().getType();
		}  
			
		return this.fighterSprite.getSprite(fight);	
	}
	
	public void drawFighters(Graphics g) {
		int[] player1Sprite = getCurrentSprite(currentRulePlayer1);
		int[] player2Sprite = getCurrentSprite(currentRulePlayer2);
			
		if (player1Sprite != new int[0])
			drawFighter(player1Sprite, g, true, player1.getPosX());
		if (player2Sprite != new int[0])
			drawFighter(player2Sprite, g, false, player2.getPosX());
	}
	
	private void drawDistanceStatus(Graphics2D g2) {
		g2.setColor(Color.DARK_GRAY);
		g2.drawString("Distance status: " + this.distanceStatus + ", value: " + (player2.getPosX() - (player1.getPosX() + PLAYER_WIDTH)), SCREEN_PADDING, PLAYER_HEIGHT + 150);
	}
	
	private void drawCoordinates(Graphics2D g2) {
		g2.setColor(Color.DARK_GRAY);
		g2.drawString("Player 1 Coordinates: " + this.player1.getPosX() + ", " + this.player1.getPosY(), SCREEN_PADDING, PLAYER_HEIGHT + 230);
		g2.drawString("Player 2 Coordinates: " + this.player2.getPosX() + ", " + this.player2.getPosY(), SCREEN_WIDTH - SCREEN_PADDING - PLAYER_WIDTH, PLAYER_HEIGHT + 230);
	}
	
	private void drawRules(Graphics2D g2) {
		g2.setColor(Color.DARK_GRAY);
		if (currentRulePlayer1 != null) {
			g2.drawString("Player 1 - Move: " + this.currentRulePlayer1.getWalkAction().getType(), SCREEN_PADDING, PLAYER_HEIGHT + 170);
			g2.drawString("Player 1 - Fight: " + this.currentRulePlayer1.getFightAction().getType(), SCREEN_PADDING, PLAYER_HEIGHT + 190);
		}
		if (currentRulePlayer2 != null) {
			g2.drawString("Player 2 - Move: " + this.currentRulePlayer2.getWalkAction().getType(), (SCREEN_WIDTH / 2) +  SCREEN_PADDING, PLAYER_HEIGHT + 170);
			g2.drawString("Player 2 - Fight: " + this.currentRulePlayer2.getFightAction().getType(), (SCREEN_WIDTH / 2) + SCREEN_PADDING, PLAYER_HEIGHT + 190);
		}
	}
	
	private void drawFighter(int[] type, Graphics g, boolean left, int offsetX) {		
		if (left) {
			g.drawImage(fighterSprite.getImage(), 
						offsetX, type[1] + OFFSET_Y, type[2] + offsetX, type[3] + type[1] + OFFSET_Y, 
						type[0], type[1], type[2] + type[0], type[3] + type[1], 
						null);
		} else {
			g.drawImage(fighterSprite.getImage(), 
						type[2] + offsetX, type[1] + OFFSET_Y, offsetX, type[3] + type[1] + OFFSET_Y, 
						type[0], type[1], type[2] + type[0], type[3] + type[1], 
						null);
		}
	}
}