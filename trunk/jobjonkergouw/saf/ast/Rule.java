package saf.ast;

public class Rule extends ASTNode {
        private String name = "rule";
       
        public Rule() {
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

