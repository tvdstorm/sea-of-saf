package data;

import java.util.List;

public class Actions {

	private List<String> moveOptions;
	private List<String> attackOptions;
	
	public Actions(List<String> moveOptions, List<String> attackOptions) {
		this.moveOptions = moveOptions;
		this.attackOptions = attackOptions;
	}
	
	public List<String> getMoveOptions() {
		return moveOptions;
	}
	
	public List<String> getAttackOptions() {
		return attackOptions;
	}
	
}
