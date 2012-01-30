import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Arena;
import view.Main;
import model.Bot;
import model.enums.AttackType;

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
		
		Arena arena = new Arena(left, right);
		left.setArena(arena);
		right.setArena(arena);
		
		Main mainView = new Main(arena);
		
		for(;;) {
			left.setCurrentAttack(AttackType.BLOCK_HIGH);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.BLOCK_HIGH);
			Thread.sleep(100);
			left.setCurrentAttack(AttackType.KICK_LOW);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.KICK_LOW);
			Thread.sleep(100);
			left.setCurrentAttack(AttackType.PUNCH_HIGH);
			Thread.sleep(100);
			right.setCurrentAttack(AttackType.PUNCH_HIGH);
			Thread.sleep(100);
		}
	}
}
