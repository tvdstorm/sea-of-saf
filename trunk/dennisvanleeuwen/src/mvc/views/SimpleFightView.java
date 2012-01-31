package mvc.views;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import saf.visualisation.SimpleFighter;

import mvc.FightView;
import mvc.models.FighterModel;

public class SimpleFightView implements FightView{
	private MyFightFrame myFrame;
	private JFrame f;
	public SimpleFightView(FighterModel fighter1, FighterModel fighter2){
		f = new JFrame("SAF Fight Area");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        myFrame = new MyFightFrame(new SimpleFighter(fighter1),new SimpleFighter(fighter2));
        f.getContentPane().add("Center", myFrame);
        myFrame.init();
        f.pack();
        f.setSize(new Dimension(1000,1000));
        f.setVisible(true);
	}
	
	public void render() {
		myFrame.repaint();
	}
}

/*
package saf.visualisation;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class MyVis extends JApplet {
        public void paint (Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            SimpleFighter fighter = new SimpleFighter();
                fighter.draw(g2, null);
        }
        
    public static void main(String s[]) {
        JFrame f = new JFrame("SAF Fight Area");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JApplet applet = new MyVis();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(1000,1000));
        f.setVisible(true);
    }
}
*/