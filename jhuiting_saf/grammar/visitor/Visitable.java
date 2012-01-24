package visitor;

public interface Visitable {
  void accept(FighterVisitor v);
}
