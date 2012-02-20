package nl.tamasja.uva.saf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.graphics.DrawFighter;
import nl.tamasja.uva.saf.graphics.IFighterGraphics;
import nl.tamasja.uva.saf.tree.ErrorMessage;
import nl.tamasja.uva.saf.tree.FighterAstChecker;
import nl.tamasja.uva.saf.tree.FighterAstLoader;
import nl.tamasja.uva.saf.tree.FighterBotLoader;
import nl.tamasja.uva.saf.tree.ast.Fighter;


public class Game extends JPanel implements Runnable {

    private Thread animator;
    private final int DELAY = 30;

    Arena arena;

    public Game() {
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        
        /*
		FighterAstLoader fighterAstLoader = new FighterAstLoader();
		FighterAstChecker fighterAstChecker = new FighterAstChecker();
		FighterBotLoader fighterBotLoader = new FighterBotLoader();
		IFighterGraphics fighterGraphics = new DrawFighter(500, 200,false);
		
		Fighter fighter1Ast = fighterAstLoader.loadFile("bots/CrackieJan.saf");
		
		ArrayList<ErrorMessage> fighter1Errors = fighterAstChecker.checkAst(fighter1Ast);

		if(fighter1Errors.size() > 0) {
			for(ErrorMessage e: fighter1Errors) {
				System.out.println(e.getMessage());
			}
		} else {
			FighterBot fighterBot1 = fighterBotLoader.traverseFighterAst(fighter1Ast,fighterGraphics);
		}
		
		

		
		Fighter fighter2Ast = fighterAstLoader.loadFile("bots/Adhd.saf");
         */
        
        CreateFighterBot fighterBotCreator = new CreateFighterBot();
        
        FighterBot fighterBot1 = fighterBotCreator.loadFighterFile("bots/Adhd.saf");
        FighterBot fighterBot2 = fighterBotCreator.loadFighterFile("bots/Adhd.saf");
        

        fighterBot1.SetEnemyFighter(fighterBot2);
        fighterBot2.SetEnemyFighter(fighterBot1);
		
		arena = new Arena(100,100,20);
		arena.addFighter(fighterBot1,5);
		arena.addFighter(fighterBot2,15);
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

        while (true) {

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