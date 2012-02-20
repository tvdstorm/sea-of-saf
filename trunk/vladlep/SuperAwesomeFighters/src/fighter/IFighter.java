package fighter;

public interface IFighter extends ASTNode {
	public String getName();

	public Behaviour getBehaviour();

	public Personality getPersonality();
}
