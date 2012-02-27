/**
 * 
 */
package ast.object;

/**
 * {@link ConditionType}'s that describe a condition a {@link Fighter} finds itself in.
 * @author Iwan Flameling
 */
public enum ConditionType {
	ALWAYS("always"),
	NEAR("near"),
	FAR("far"),
	MUCH_STRONGER("much_stronger"),
	STRONGER("stronger"),
	EVEN("even"),
	WEAKER("weaker"),
	MUCH_WEAKER("much_weaker");
	
	private String syntax;
	
	ConditionType(String syntax){
		this.syntax = syntax;
	}
	
	public String getSyntaxName(){
		return syntax;
	}
	
	@Override
	public String toString() {
		return getSyntaxName();
	}
}
