package data;

import java.util.List;
import java.util.Random;
import core.BaseTreeVisitor;

public class Actions extends BaseData {

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
	
	public String getRandomMoveOption() {
		return getRandomOption(moveOptions);
	}
	
	public String getRandomAttackOption() {
		return getRandomOption(attackOptions);
	}
	
	private String getRandomOption(List<String> options) {
		if ( options.size() > 0 ) {
			Random random = new Random();
			int randomOption = random.nextInt(options.size());
			return options.get(randomOption);
		}
		return "";
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treeVisitor) {
		treeVisitor.visitActions(this);
	}
	
}
