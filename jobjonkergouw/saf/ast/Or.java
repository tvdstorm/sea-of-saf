package saf.ast;

public class Or extends ASTNode {
        private final String name = "or";
       
        public Or() { }

        @Override
        public boolean accept() {
            return true;      
        }
        
        @Override
        public String getName() {
                return name;
        }
}

