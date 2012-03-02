package saf.ast;

public class Strength extends ASTNode {
        private String name;
        private Integer value;
       
        public Strength(String name, Integer value) {
                this.setName(name);
                this.setValue(value);
        }

        @Override
        public boolean accept() {
                //boolean hasAlwaysRule = false;
//                 for(Strength s : getStrengths()) {
//                         if (!s.validate()) {
//                                 return false;
//                         }
//                 }
//                 for(Behaviour b : getBehaviours()) {
//                         if (!b.validate()) {
//                                 return false;
//                         }
//                         if (b.getCondition().getType() == ConditionAtom.Type.ALWAYS) {
//                                 hasAlwaysRule = true;
//                         }
//                 }
            return true;      
        }
        
        @Override
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
        
        public Integer getValue() {
                return value;
        }

        public void setValue(Integer value) {
                this.value = value;
        }         
}

