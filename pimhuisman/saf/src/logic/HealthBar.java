package logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class HealthBar extends BaseGameObject {

	public enum HealthBarOrientation { ORIENTATION_LEFT, ORIENTATION_RIGHT };
	
	private FighterModel fighterModel;
	private HealthBarOrientation barOrientation;
	private int width;
	private int height;
	private int borderMargin;
	
	public HealthBar(FighterModel fighterModel, HealthBarOrientation barOrientation) {
		this.fighterModel = fighterModel;
		this.barOrientation = barOrientation;
		width = 300;
		height = 50;
		borderMargin = 4;
	}

	private int getBarWidth() {
		int health = fighterModel.getHealth();
		int maxHealth = fighterModel.getMaxHealth();
		int pixelsPerHP = (width-(borderMargin*2)) / maxHealth;
		return health*pixelsPerHP;
	}
	
	private float getHealthDivider() {
		int health = fighterModel.getHealth();
		int maxHealth = fighterModel.getMaxHealth();
		return (float)health / maxHealth;
	}
	
	@Override
	public void initialize() {
		
	}

	@Override
	public void draw(Graphics g) {
		Point currentPosition = new Point(position);
		if ( barOrientation == HealthBarOrientation.ORIENTATION_RIGHT) {
			currentPosition.x -= width;
		}
		g.setColor(new Color(145, 127, 110));
		g.fillRoundRect(currentPosition.x, currentPosition.y, width, height, 10, 10);
		currentPosition.x += borderMargin;
		currentPosition.y += borderMargin;
		
		float healthDivider = getHealthDivider();
		int redComponent = (int)((1.0f-healthDivider) * 255);
		int greenComponent = (int)(healthDivider * 255);
		
		g.setColor(new Color(redComponent, greenComponent, 0));
		g.fillRoundRect(currentPosition.x, currentPosition.y, getBarWidth(), height-(borderMargin*2), 10, 10);
	}

	@Override
	public void destroy() {
		
	}
}
