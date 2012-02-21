package gui;

import javax.swing.JFrame;

import org.junit.Test;
import fighter.gui.MessageReporter;
import fighter.gui.image.reader.FightImagesContainer;

public class FightActionReaderTest {

	public FightActionReaderTest() {

		MessageReporter.initMessageReporter(new JFrame());
	}

	@Test
	public void readAllMoveActionTest() {

		FightImagesContainer.loadAllFightImages();

	}
}
