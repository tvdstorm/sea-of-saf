package safFightAnimation.config;

import safAST.action.Action;
import safAST.action.SelectAction;
import safAST.action.SingleAction;

public class SAFFightAnimationConfig extends SAFAnimationConfig{
	
	public SAFFightAnimationConfig(String fileName)
	{
		fighterImg = readFighterImage(fileName);;
	}
	
	public void setSAFFightAct(Action act)
	{
		if (act.getFightAction() instanceof SelectAction)
		{
			singleFightAct = getRandomAction((SelectAction)act.getFightAction());
			setFighterImage(singleFightAct.getActionName());
		}else
		{
			singleFightAct =(SingleAction)act.getFightAction();
			setFighterImage(singleFightAct.getActionName());
		}
	}
	
	private void setFighterImage(String fightActName)
	{
		String imageName = fightActName + "." + suffix.trim();
		fighterImg = readFighterImage(imageName);
	}
}
