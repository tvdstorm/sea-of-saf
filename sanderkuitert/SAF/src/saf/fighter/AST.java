package saf.fighter;

import java.util.List;

interface AST {
	
	String getName();
	List<AST> getChildren();
	boolean equals(Object other);
	
}
