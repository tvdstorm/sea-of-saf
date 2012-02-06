
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import view.Main;
import logic.Fight;
import model.Bot;

public class Program {

	public static void main(String[] args) {
		
		try {
			Bot left = Bot.deserialize(args[0], Bot.Position.LEFT);
			Bot right = Bot.deserialize(args[1], Bot.Position.RIGHT);
			Main view = new Main(left, right);
			Fight fight = new Fight();
			
			fight.start(left, right, view);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
