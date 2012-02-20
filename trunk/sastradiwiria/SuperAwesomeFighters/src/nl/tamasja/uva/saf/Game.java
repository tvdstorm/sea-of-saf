package nl.tamasja.uva.saf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

import nl.tamasja.uva.saf.fighter.FighterBot;


public class Game extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	
	private Thread animator;
    private final int DELAY = 30;
    
    private boolean runGame = true;

    Arena arena;

    public Game() {
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        arena = new Arena(20);
        
        CreateFighterBot fighterBotCreator = new CreateFighterBot();
        
        FighterBot fighterBot1 = fighterBotCreator.loadFighterFile("bots/here2win.saf");
        FighterBot fighterBot2 = fighterBotCreator.loadFighterFile("bots/here2win.saf");
        
        
        if(fighterBot1 != null && fighterBot2 != null) {
	        fighterBot1.SetEnemyFighter(fighterBot2);
	        fighterBot2.SetEnemyFighter(fighterBot1);
			
			arena.addFighter(fighterBot1,5);
			arena.addFighter(fighterBot2,15);
        }
    }

    public void addNotify() {
        super.addNotify();
        animator = new Thread(this);
        animator.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        arena.draw(g);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void run() {

        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();

        while (runGame) {
        	
        	runGame = arena.gameRunning();
        	arena.fightStep();
            repaint();

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0)
                sleep = 2;
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }

            beforeTime = System.currentTimeMillis();
        }
    }
}