package fighter;

public interface IFighter extends ASTNode {
	public Behaviour getBehaviour();

	public String getName();

	public Personality getPersonality();
}
