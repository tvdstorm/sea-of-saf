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
public class GraphicsPanel extends JPanel implements ActionListener {
	
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
		
		this.timer = new Timer(settings.STEP_MS, this);
		this.timer.start();
		
		player1.setPosX(settings.SCREEN_PADDING);
		player1.setPosY(settings.OFFSET_Y);
		
		player2.setPosX(settings.SCREEN_WIDTH - settings.SCREEN_PADDING - settings.PLAYER_WIDTH);
		player2.setPosY(settings.OFFSET_Y);
   	}
	
	public void actionPerformed(ActionEvent e) {
		step();
		checkHit();
		walk();
		repaint();
	}
	
	public boolean checkHit() {
		int distance = player2.getPosX() - (player1.getPosX() + settings.PLAYER_WIDTH);
		
		int p1_reach = getReachPower(player1, this.currentRulePlayer1, false);
		int p2_reach = getReachPower(player2, this.currentRulePlayer2, false);
		
		int p1_power = getReachPower(player1, this.currentRulePlayer1, true);
		int p2_power = getReachPower(player2, this.currentRulePlayer2, true);
		
		String p1_fight = this.currentRulePlayer1.getFightAction().getType();
		String p2_fight = this.currentRulePlayer2.getFightAction().getType();
		
		if (distance < p1_reach) {
			if ( (p2_fight.equals(settings.BLOCK_HIGH) && 
				  (p1_fight.equals(settings.KICK_HIGH) || p1_fight.equals(settings.PUNCH_HIGH))) ||
				 (p2_fight.equals(settings.BLOCK_LOW) && 
				  (p1_fight.equals(settings.KICK_LOW) || p1_fight.equals(settings.PUNCH_LOW)))
			   ) 
				p1_power /= 2;
			
			player2.setHealth(player2.getHealth() - p1_power);
			
			int newPosX = player1.getPosX() - 50;
			if (newPosX < settings.SCREEN_PADDING) newPosX = settings.SCREEN_PADDING;
			player1.setPosX(newPosX);
			
			if (player2.getPosX() < (newPosX + 50) ) player2.setPosX(newPosX + 50); 
			
			return true;
		} 
		if (distance < p2_reach) {
			if ( (p1_fight.equals(settings.BLOCK_HIGH) && 
				  (p2_fight.equals(settings.KICK_HIGH) || p2_fight.equals(settings.PUNCH_HIGH))) ||
				 (p1_fight.equals(settings.BLOCK_LOW) && 
				  (p2_fight.equals(settings.KICK_LOW) || p2_fight.equals(settings.PUNCH_LOW)))
			   ) 
				p2_power /= 2;
			
			player1.setHealth(player1.getHealth() - p2_power);	
			
			int newPosX = player2.getPosX() + 100;
			if (newPosX > (settings.SCREEN_WIDTH - settings.PLAYER_WIDTH)) newPosX = settings.SCREEN_WIDTH - settings.PLAYER_WIDTH;
			player2.setPosX(newPosX);
			
			if (player1.getPosX() < (newPosX + 50 + settings.PLAYER_WIDTH) ) player1.setPosX(newPosX + 50 + settings.PLAYER_WIDTH); 
			
			return true;
		} 
		
		return false;
	}
	
	private int getReachPower(Saf player, BehaviourRule rule, boolean reach) {
		if (rule.getFightAction().getType().equals(settings.KICK_HIGH) || 
			rule.getFightAction().getType().equals(settings.KICK_LOW)) {
			if (reach) return settings.REACH_FACTOR * (player.getPersonality().getStrength(settings.KICK_REACH).getValue());
			else return player.getPersonality().getStrength(settings.KICK_POWER).getValue();
		}
		
		if (rule.getFightAction().getType().equals(settings.PUNCH_HIGH) || 
			rule.getFightAction().getType().equals(settings.PUNCH_LOW)) {
			if (reach) return settings.REACH_FACTOR * (player.getPersonality().getStrength(settings.KICK_REACH).getValue());
			else return player.getPersonality().getStrength(settings.PUNCH_POWER).getValue();
		}
		return 0;
	}
	
	public void step() {
		this.distanceStatus = getDistanceStatus(player1, player2);
		
		String p1_health = settings.EVEN;
		String p2_health = settings.EVEN;
		
		if (isMuchStronger(player1, player2)) {
			p1_health = settings.MUCH_STRONGER;
			p2_health = settings.MUCH_WEAKER;
		} else if (isStronger(player1, player2)) {
			p1_health = settings.STRONGER;
			p2_health = settings.WEAKER;
		} 
		
		BehaviourRule p1_rule = player1.getBehaviour().getCondition(this.distanceStatus, p1_health);
		BehaviourRule p2_rule = player2.getBehaviour().getCondition(this.distanceStatus, p2_health);
				
		currentRulePlayer1 = p1_rule;
		currentRulePlayer2 = p2_rule;
	}
	
	private String getDistanceStatus(Saf s1, Saf s2) {
		String walk_status = settings.NEAR;
				
		if ((player2.getPosX() - (player1.getPosX() + settings.PLAYER_WIDTH)) > settings.DISTANCE_THRESHOLD) {			
			walk_status = settings.FAR;
		}
		
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
		
		if ( behaviourrule.getWalkAction().getType().equals(settings.WALK_TOWARDS) ) {
			x = leftSide ? x + speed : x - speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(settings.WALK_AWAY) ) {
			x = leftSide ? x - speed : x + speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(settings.RUN_TOWARDS) ) {
			speed = (int) (speed * settings.RUN_SPEED_FACTOR);
			x = leftSide ? x + speed : x - speed;
		}
		if ( behaviourrule.getWalkAction().getType().equals(settings.RUN_AWAY) ) {
			speed = (int) (speed * settings.RUN_SPEED_FACTOR);
			x = leftSide ? x - speed : x + speed;
		}
		
		if (x < settings.SCREEN_PADDING) x = settings.SCREEN_PADDING;
		if (x > (settings.SCREEN_WIDTH - settings.PLAYER_WIDTH)) x = settings.SCREEN_WIDTH - settings.PLAYER_WIDTH - settings.SCREEN_PADDING;
		
		player.setPosX(x);
	}
	
	private boolean isStronger(Saf player1, Saf player2) {
		return player1.getHealth() > player2.getHealth();
	}
	
	private boolean isMuchStronger(Saf player1, Saf player2) {
		return player1.getHealth() > player2.getHealth() + settings.HEALTH_THRESHOLD;
	}
	
	@Override
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
        
		Graphics2D g2 = (Graphics2D)g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                			RenderingHints.VALUE_ANTIALIAS_ON);
		
        drawFighterNames(g2);
		drawFighters(g2);
		drawHealth(g2);
		drawDistanceStatus(g2);
		drawRules(g2);
		drawFighterSpeed(g2);
		drawCoordinates(g2);
    }
	
	private void drawFighterNames(Graphics2D g2) {
		g2.drawString(this.player1.getName(), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 60);
		g2.drawString(this.player2.getName(), settings.SCREEN_WIDTH - settings.SCREEN_PADDING - settings.PLAYER_WIDTH, settings.PLAYER_HEIGHT + 60);
	}
	
	private void drawFighterSpeed(Graphics2D g2) {
		g2.drawString("Speed: " + player1.getPersonality().getSpeed(), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 210);
		g2.drawString("Speed: " + player2.getPersonality().getSpeed(), (settings.SCREEN_WIDTH / 2) + settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 210);
	}
	
	private void drawHealth(Graphics2D g2) {
		g2.setColor(Color.black);
		g2.drawRect(settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 80, settings.PLAYER_WIDTH, 30);
		g2.drawRect(settings.SCREEN_WIDTH - settings.SCREEN_PADDING - settings.PLAYER_WIDTH, settings.PLAYER_HEIGHT + 80, settings.PLAYER_WIDTH, 30);		
		
		g2.setColor(Color.green);
		g2.fillRect(settings.SCREEN_PADDING + 1, settings.PLAYER_HEIGHT + 81, (player1.getHealth() * 2) - 2, 29);
		g2.fillRect(settings.SCREEN_WIDTH - settings.SCREEN_PADDING - settings.PLAYER_WIDTH + 1, settings.PLAYER_HEIGHT + 81, (player1.getHealth() * 2) - 2, 29);		
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
		g2.drawString("Distance status: " + this.distanceStatus + ", value: " + (player2.getPosX() - (player1.getPosX() + settings.PLAYER_WIDTH)), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 150);
	}
	
	private void drawCoordinates(Graphics2D g2) {
		g2.setColor(Color.DARK_GRAY);
		g2.drawString("Player 1 Coordinates: " + this.player1.getPosX() + ", " + this.player1.getPosY(), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 230);
		g2.drawString("Player 2 Coordinates: " + this.player2.getPosX() + ", " + this.player2.getPosY(), settings.SCREEN_WIDTH - settings.SCREEN_PADDING - settings.PLAYER_WIDTH, settings.PLAYER_HEIGHT + 230);
	}
	
	private void drawRules(Graphics2D g2) {
		g2.setColor(Color.DARK_GRAY);
		if (currentRulePlayer1 != null) {
			g2.drawString("Player 1 - Move: " + this.currentRulePlayer1.getWalkAction().getType(), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 170);
			g2.drawString("Player 1 - Fight: " + this.currentRulePlayer1.getFightAction().getType(), settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 190);
		}
		if (currentRulePlayer2 != null) {
			g2.drawString("Player 2 - Move: " + this.currentRulePlayer2.getWalkAction().getType(), (settings.SCREEN_WIDTH / 2) +  settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 170);
			g2.drawString("Player 2 - Fight: " + this.currentRulePlayer2.getFightAction().getType(), (settings.SCREEN_WIDTH / 2) + settings.SCREEN_PADDING, settings.PLAYER_HEIGHT + 190);
		}
	}
	
	private void drawFighter(int[] type, Graphics g, boolean left, int offsetX) {		
		if (left) {
			g.drawImage(fighterSprite.getImage(), 
						offsetX, type[1] + settings.OFFSET_Y, type[2] + offsetX, type[3] + type[1] + settings.OFFSET_Y, 
						type[0], type[1], type[2] + type[0], type[3] + type[1], 
						null);
		} else {
			g.drawImage(fighterSprite.getImage(), 
						type[2] + offsetX, type[1] + settings.OFFSET_Y, offsetX, type[3] + type[1] + settings.OFFSET_Y, 
						type[0], type[1], type[2] + type[0], type[3] + type[1], 
						null);
		}
	}
}