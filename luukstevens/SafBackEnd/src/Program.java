import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import model.BehaviourRule;
import model.Bot;
import model.ConditionType;


public class Program {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		Bot bot = Bot.deserialize("/Users/luukstevens/jack.xml");
		
		List<ConditionType> conditions = new LinkedList();
		conditions.add(ConditionType.FAR);
		
		for(BehaviourRule rule : bot.getBehaviourRules()) {
			System.out.println(rule.getCondition().evaluate(conditions));
		}
		
		System.out.println(bot);
	}
}
