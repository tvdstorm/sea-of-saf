package saf.ast.nodes;

import saf.ast.Visitor;

import java.util.ArrayList;

public abstract class Action extends ASTNode {
        private String name;
        private ArrayList<String> actions = new ArrayList<String>();
       
        protected Action(String action) {
            addAction(action);
            setName(action);
        }
        
        public void addAction(String action) {
            actions.add(action);
            setName( getName() + ", " + action );
        } 

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
        
        @Override
        public String getName() {
                return name;
        }
        
        public void setName(String name) {
                this.name = name;
        }
}

