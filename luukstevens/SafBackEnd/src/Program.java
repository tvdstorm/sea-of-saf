
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Arena;
import view.Main;
import model.Bot;
import model.attack.*;
import model.move.*;

public class Program {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws FileNotFoundException, JAXBException, InterruptedException {
		Bot left = Bot.deserialize("/Users/luukstevens/jack.xml");
		Bot right = Bot.deserialize("/Users/luukstevens/jack.xml");
		
		Main mainView = new Main(left, right);
		
		while(left.getHealth() > 0 && right.getHealth() > 0) {
			left.setCurrentAttack(new BlockHigh());
			Thread.sleep(100);
			right.setCurrentAttack(new BlockHigh());
			Thread.sleep(100);
			mainView.update();
			left.setCurrentAttack(new KickLow());
			left.setCurrentMove(new RunTowards());
			right.setCurrentMove(new Stand());
			Thread.sleep(100);
			right.setCurrentAttack(new KickLow());
			Thread.sleep(100);
			mainView.update();
			left.setCurrentAttack(new PunchLow());
			Thread.sleep(100);
			right.setCurrentAttack(new PunchLow());
			right.setCurrentMove(new Jump());
			left.setCurrentMove(new RunAway());
			Thread.sleep(100);
			mainView.update();
			left.reduceHealth(10);
			right.reduceHealth(7);
			mainView.update();
		}
	}
}
