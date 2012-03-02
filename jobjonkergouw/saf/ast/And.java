package saf.ast;

public class And extends ASTNode {
        private final String name = "and";
       
        public And() { }

        @Override
        public boolean accept() {
            return true;      
        }
        
        @Override
        public String getName() {
                return name;
        }
}

