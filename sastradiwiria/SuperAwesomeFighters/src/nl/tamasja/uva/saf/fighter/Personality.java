package nl.tamasja.uva.saf.fighter;

import java.util.HashMap;

import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;

public class Personality {
	private static int DEFAULT_STAT = 5;
	
	private HashMap<Strength, Integer> stats;
	

	public Personality() {
		stats =  new HashMap<Strength, Integer>();
	}
	
	public void AddStat(String name, Integer value) {
		
		SpecificationMapper sm = new SpecificationMapper();
		Strength strenght = sm.MapStrength(name);
		AddStat(strenght, value);
	}
	
	public void AddStat(Strength stat, Integer value) {
		stats.put(stat, value);
	}
	
	public int getStat(String name) {
		return getStat(StringToStrength(name));
	}
	
	public int getStat(Strength stat) {
		return (stats.get(stat) == null) ? DEFAULT_STAT :  stats.get(stat);
	}
	
	
	protected Strength StringToStrength(String name) {
		SpecificationMapper sm = new SpecificationMapper();
		return sm.MapStrength(name);
	}
	
}
