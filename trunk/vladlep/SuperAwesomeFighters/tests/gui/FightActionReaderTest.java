package gui;

import javax.swing.JFrame;

import org.junit.Test;
import fighter.gui.MessageReporter;
import fighter.gui.images.FightImagesContainer;

public class FightActionReaderTest {

	public FightActionReaderTest() {

		MessageReporter.getMessageReporter(new JFrame());
	}

	@Test
	public void readAllMoveActionTest() {

		FightImagesContainer.loadAllFightImages();

	}
}
