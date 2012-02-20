package nl.tamasja.uva.saf.fighter.action;

import java.io.ObjectInputStream.GetField;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

public abstract class FightAction_old implements IBehaviourAction {
    public static enum Height {
        LOW,
        HIGH,
        NONE
    };
    
    protected Height lastHeight;
    protected Height blockHeight = Height.NONE;
    protected Height block = null;

    
  //  protected abstract BehaviourCondition getCondition();
    protected abstract boolean evaluate(FighterBot self);
    protected abstract Height getHeight();
    //protected abstract Height getBlock();
    
    public abstract void executeFightAction(FighterBot self);
    
    @Override
    public void execute(FighterBot self) {
    	setBlockHeight(null);
		if(evaluate(self)) {
			executeFightAction(self);
			
			self.getBehaviour().setCurrentFightAction(this);
		}
    }
    
    public void setBlockHeight(Height block) {
    	this.block = block;
    }
    
    public Height getBlockHeight() {
    	return this.block;
    }
    
}
