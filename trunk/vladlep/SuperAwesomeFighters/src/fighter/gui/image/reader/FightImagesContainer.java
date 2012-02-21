package fighter.gui.image.reader;

import java.awt.image.BufferedImage;
import java.util.HashMap;

import fighter.action.FightActionType;

public class FightImagesContainer {

	private static HashMap<FightActionType, BufferedImage> fightImages;

	public static BufferedImage getImage(FightActionType key) {
		return fightImages.get(key);
	}

	public static void loadAllFightImages() {
		fightImages = new HashMap<FightActionType, BufferedImage>();
		for (FightActionType action : FightActionType.values()) {
			BufferedImage img = ImageLoader.loadImage(action.toString());
			fightImages.put(action, img);
		}
	}
}
