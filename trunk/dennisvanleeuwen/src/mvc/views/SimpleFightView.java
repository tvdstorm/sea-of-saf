//package mvc.views;
//
//import java.awt.Dimension;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.JFrame;
//
//import saf.visualisation.SimpleFighter;
////import saf.visualisation.SimpleImageFighter;
//
//import mvc.IView;
//import mvc.models.FighterModel;
//
//public class SimpleFightView implements IView{
//	private MyFightFrame myFrame;
//	private JFrame f;
//	public SimpleFightView(FighterModel fighter1, FighterModel fighter2){
//		f = new JFrame("SAF Fight Area");
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {System.exit(0);}
//        });
//        myFrame = new MyFightFrame(new SimpleFighter(fighter1, true), new SimpleFighter(fighter2, false));
//        f.getContentPane().add("Center", myFrame);
//        myFrame.init();
//        f.pack();
//        f.setSize(new Dimension(1000,1000));
//        f.setVisible(true);
//	}
//	
//	public void render() {
//		myFrame.repaint();
//	}
//}