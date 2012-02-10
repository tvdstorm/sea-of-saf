package ast;

import java.util.ArrayList;

public class Fighter implements Validator {
        private String name;
//         private ArrayList<Strength> strengths;
//         private ArrayList<Behaviour> behaviours;
       
        public Fighter(String name) {
                this.setName(name);
//                 setStrengths(new ArrayList<Strength>());
//                 setBehaviours(new ArrayList<Behaviour>());
        }

//         public void addStrength(Strength n) {
//                 getStrengths().add(n);
//         }
// 
//         public void addBehaviour(Behaviour n) {
//                 getBehaviours().add(n);
//         }

        @Override
        public boolean validate() {
                boolean hasAlwaysRule = false;
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
               
                if (!hasAlwaysRule) {
                        System.out.println("Saf definition does not contain 'always rule'.");
                        return false;
                }
                return true;
        }

//         public ArrayList<Strength> getStrengths() {
//                 return strengths;
//         }
// 
//         public void setStrengths(ArrayList<Strength> strengths) {
//                 this.strengths = strengths;
//         }
// 
//         public ArrayList<Behaviour> getBehaviours() {
//                 return behaviours;
//         }
// 
//         public void setBehaviours(ArrayList<Behaviour> behaviours) {
//                 this.behaviours = behaviours;
//        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
       
//         public int getStrength(Strength.Type type) {
//                 for(Strength s : getStrengths()) {
//                         if (s.getType() == type) {
//                                 return s.getValue();
//                         }
//                 }
//                 return 5;
//         }
// 
//         public double getWeight() {
//                 return (getStrength(Strength.Type.PUNCHPOWER) + getStrength(Strength.Type.KICKPOWER)) / 2;
//         }
// 
//         public double getHeight() {
//                 return (getStrength(Strength.Type.PUNCHREACH) + getStrength(Strength.Type.KICKREACH)) / 2;
//         }
//        
//         public int getSpeed() {
//                 return (int) Math.round( Math.abs(0.5 * (getHeight() - getWeight()) ));
//         }
}

