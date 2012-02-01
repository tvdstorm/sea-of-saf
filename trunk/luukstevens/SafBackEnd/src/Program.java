
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Arena;
import view.Main;
import logic.Fight;
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
		Main view = new Main(left, right);
		
		Fight fight = new Fight();
		fight.start(left, right, view);
	}
}
