package cb.saf.game;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import cb.saf.parser.*;

public class Fighter
{
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the characteristics
	 */
	public Characteristics getCharacteristics() {
		return characteristics;
	}

	/**
	 * @param characteristics the characteristics to set
	 */
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}

	/**
	 * @return the behaviour
	 */
	public List<Behaviour> getBehaviour() {
		return behaviour;
	}

	/**
	 * @param behaviour the behaviour to set
	 */
	public void setBehaviour(List<Behaviour> behaviour) {
		this.behaviour = behaviour;
	}

	private String name="NotInitialized";
	private Characteristics characteristics;
	private List<Behaviour> behaviour;
	
	public Fighter(String name, Characteristics characteristics,List<Behaviour> behaviour )
	{
		this.name=name;
		this.characteristics=characteristics;
		this.behaviour=behaviour;
		
		System.out.println("New Fighter: "+ name + " characteristics: "+ characteristics.getKickReach() + " behaviour:"+behaviour.size());
	}

	
	

	
}
