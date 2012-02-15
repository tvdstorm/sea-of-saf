//package saf.astelements.actions;
//
//public class ChooseActionComposite implements IAction{
//	private List<IAction> actions;
//	
//	public ChooseActionComposite(){
//		this.actions = new ArrayList<IAction>();
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		Integer number = MyRandomizer.generateRandomNumber(actions.size());
//		this.actions.get(number).applyActionOn(curFighter, enemyFighter);
//	}
//}