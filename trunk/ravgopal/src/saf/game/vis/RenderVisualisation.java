package saf.game.vis;

import java.awt.Font;

import saf.game.play.FighterState;
import saf.game.play.GameState;
import saf.Config;

public class RenderVisualisation {
	
	private final int Y_POSITION = 37;
	private GameState gamestate;
	private FighterState fighter1;
	private FighterState fighter2;
	
	public RenderVisualisation() {}
	
	public RenderVisualisation(GameState gamestate) {
		this.gamestate = gamestate;
		this.fighter1 = gamestate.getFighter1();
		this.fighter2 = gamestate.getFighter2();
	}
	
	private void init() {
		StdDraw.setCanvasSize(Config.STAGE_WIDTH, Config.STAGE_HEIGHT);
		StdDraw.setXscale(0, Config.SCALE);
		StdDraw.setYscale(0, Config.SCALE);
		StdDraw.setFont(new Font("Sans Serif", Font.BOLD, 20));
	}
	
	private void drawStage() {
		StdDraw.picture(50, 50, Config.IMG_URL + "stage.jpg");
	}
	
	public void drawFighters() {
		StdDraw.pictureFlipped(fighter1.getPosition(), Y_POSITION, Config.IMG_URL + fighter1.getFightAction() + ".png");
		StdDraw.picture(fighter2.getPosition(), Y_POSITION, Config.IMG_URL + fighter2.getFightAction() + ".png");
	}
	
	public void drawScore() {
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.textLeft(0, 97, gamestate.getFighter1().getName());
		StdDraw.textRight(100, 97, gamestate.getFighter2().getName());
		StdDraw.textLeft(50, 100-5, "VS");
		StdDraw.filledRectangle(10, 100-10, 10, 2);
		StdDraw.filledRectangle(90, 100-10, 10, 2);

		drawGameStateInfo();
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(fighter1.getHealth() / 10, 100-10, fighter1.getHealth() / 10, 2);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(100 - (fighter2.getHealth() / 10), 100-10, fighter2.getHealth() / 10, 2);
	}
	
	public void drawEndGame() {
		drawStage();
		drawScore();
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setFont(new Font("Sans Serif", Font.BOLD, 40));
		StdDraw.text(50, 55, gamestate.getWinner() + " wins!");
		StdDraw.pictureFlipped(30, Y_POSITION, Config.IMG_URL + "stand.png");
		StdDraw.picture(70, Y_POSITION, Config.IMG_URL + "stand.png");
		StdDraw.show();
	}
	
	public void drawGameStateInfo() {
		StdDraw.setFont(new Font("Sans Serif", Font.BOLD, 10));
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.textLeft(0, 65, fighter1.getDistanceCondition(fighter2));
		StdDraw.textLeft(0, 60, fighter1.getStrengthCondition(fighter2));
		StdDraw.textLeft(0, 55, fighter1.getMoveAction());
		StdDraw.textLeft(0, 50, fighter1.getFightAction());
		
		StdDraw.textRight(100, 65, fighter2.getDistanceCondition(fighter1));
		StdDraw.textRight(100, 60, fighter2.getStrengthCondition(fighter1));
		StdDraw.textRight(100, 55, fighter2.getMoveAction());
		StdDraw.textRight(100, 50, fighter2.getFightAction());
		StdDraw.setFont(new Font("Sans Serif", Font.BOLD, 20));
	}
	
	public void renderGame() {
		init();
		
		while (!gamestate.fighterDied()) {
			drawStage();
			drawFighters();
			drawScore();
			gamestate.step();
			StdDraw.show(500);
		}
		
		drawEndGame();
	}
	
}
