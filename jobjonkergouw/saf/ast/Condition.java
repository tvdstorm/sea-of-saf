package saf.ast;

public class Condition extends ASTNode {
        private String name;
       
        public Condition(String name) {
            this.setName(name);
        }

        @Override
        public boolean accept() {
            return true;      
        }
        
        @Override
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

}

