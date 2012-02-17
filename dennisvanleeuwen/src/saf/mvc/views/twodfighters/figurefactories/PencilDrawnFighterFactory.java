package saf.mvc.views.twodfighters.figurefactories;

import saf.mvc.FighterModel;
import saf.mvc.views.twodfighters.IFighterFigure;
import saf.mvc.views.twodfighters.IFigtherFigureFactory;
import saf.mvc.views.twodfighters.fighterfigures.PencilFigure;

public class PencilDrawnFighterFactory implements IFigtherFigureFactory {

	@Override
	public IFighterFigure createFighterFigure(FighterModel model, Boolean left) {
		return new PencilFigure(model.getX(), model.getY(), model.getCurrentMoveState(), model.getCurrentFightState(), left);
	}
}