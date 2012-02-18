package saf;

//import java.io.IOException;

//import lexer.safLexer;
//import lexer.safParser;

//import org.antlr.runtime.ANTLRFileStream;
//import org.antlr.runtime.RecognitionException;
//import org.antlr.runtime.TokenRewriteStream;

import test.SafInterface;
import test.SafVisitor;

public class Saf implements SafInterface {

	private String name;
	
	private Behaviour behaviour;
	private Personality personality; 
	
	public Saf() {}
	
	public Saf(String name, Personality p, Behaviour b) {
        this.name = name;
        this.personality = p; 
        this.behaviour = b;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Personality getPersonality() {
		return this.personality;
	}
	
	public Behaviour getBehaviour() {
		return this.behaviour;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		this.behaviour.accept(visitor);
		this.personality.accept(visitor);
		
		visitor.visit(this);
	}
}
