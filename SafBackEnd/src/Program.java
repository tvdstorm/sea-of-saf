import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import model.Bot;


public class Program {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		Bot bot = Bot.deserialize("/Users/luukstevens/jack.xml");
		System.out.println(bot);
	}
}
