package saf.ast.nodes;

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
        
        public ArrayList<String> getActionsAsArrayList() {
            return new ArrayList<String>(actions);
        }
        
        @Override
        public String getName() {
                return name;
        }
        
        private void setName(String name) {
                this.name = name;
        }
}

