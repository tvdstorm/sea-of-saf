
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Main;
import logic.Fight;
import model.Bot;

public class Program {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws FileNotFoundException, JAXBException, InterruptedException {
		Bot left = Bot.deserialize("/Users/luukstevens/jack.xml", Bot.Position.LEFT);
		Bot right = Bot.deserialize("/Users/luukstevens/neo.xml", Bot.Position.RIGHT);
		Main view = new Main(left, right);
		
		Fight fight = new Fight();
		fight.start(left, right, view);
	}
}
