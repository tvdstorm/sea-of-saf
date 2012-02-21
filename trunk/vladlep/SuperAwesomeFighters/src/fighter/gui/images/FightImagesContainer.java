package fighter.gui.images;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import fighter.action.FightActionType;

public class FightImagesContainer {

	private static HashMap<FightActionType, BufferedImage> fightImages;

	public static void loadAllFightImages() {
		fightImages = new HashMap<FightActionType, BufferedImage>();
		for (FightActionType action : FightActionType.values()) {
			BufferedImage img = ImageLoader.loadImage(action.toString());
			fightImages.put(action, img);
		}
	}

	public static BufferedImage getImage(FightActionType key, int rotationAngle) {
		BufferedImage selectedImage;
		selectedImage = fightImages.get(key);
		if (rotationAngle == 90) {
			AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
			tx.translate(-selectedImage.getWidth(), 0);
			AffineTransformOp op = new AffineTransformOp(tx,
					AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
			selectedImage = op.filter(selectedImage, null);

		}
		return selectedImage;
	}

}
