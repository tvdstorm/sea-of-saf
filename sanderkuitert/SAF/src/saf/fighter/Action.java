package saf.fighter;

class Action implements AST {

	public boolean isValid(String attribute) {
		// TODO Auto-generated method stub
		return true;
	}

	public String validPropertyValues() {
		// TODO Auto-generated method stub
		return "TODO";
	}

	public class Move implements AST {

		public String validPropertyValues() {
			// TODO Auto-generated method stub
			return "TODO";
		}
		
		public boolean isValid(String move) {
			// TODO Auto-generated method stub
			return true;
		}
		
	}
	
	public class Attack implements AST {

		public String validPropertyValues() {
			// TODO Auto-generated method stub
			return "TODO";
		}
		
		public boolean isValid(String attack) {
			// TODO Auto-generated method stub
			return true;
		}
		
	}
	
}
