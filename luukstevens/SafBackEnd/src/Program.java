
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Arena;
import view.Main;
import model.Bot;
import model.enums.AttackType;
import model.enums.MoveType;

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
		
		for(;;) {
			left.setCurrentAttack(AttackType.BLOCK_HIGH);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.BLOCK_HIGH);
			Thread.sleep(100);
			mainView.update();
			left.setCurrentAttack(AttackType.KICK_LOW);
			left.setCurrentMove(MoveType.CROUCH);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.KICK_LOW);
			Thread.sleep(100);
			mainView.update();
			left.setCurrentAttack(AttackType.PUNCH_HIGH);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.PUNCH_HIGH);
			left.setCurrentMove(MoveType.JUMP);
			Thread.sleep(100);
			mainView.update();
			left.reduceHealth(10);
			right.reduceHealth(7);
			mainView.update();
		}
	}
}
