package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import elements.Bots;
import game.graphics.SAFFighterNormal;

public class FightStart {

	public FightStart(Bots fightOpponents) {
		FightEngine fightEngine = new FightEngine(fightOpponents);
		
		FightView fightView = new FightView(fightEngine);
	}
}
