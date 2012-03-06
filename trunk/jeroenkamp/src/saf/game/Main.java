package saf.game;

import java.awt.Component;
import saf.compiler.*;

import saf.javacompiler.SourceCompiler;
import saf.ui.SafFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			args = new String[] { "", "" };
		}

		Fighter p1 = getFighter(args[0]);
		Fighter p2 = getFighter(args[1]);

		SafFrame frame = new SafFrame(p1, p2);
		Component c = frame.getCanvas();
		Arena arena = new Arena(p1, p2, c);
		arena.run();
		frame.gameOver();

	}
	public static Fighter getFighter(String path) {
		try {
			String code = "";
			String fullname = "";
			if (path.endsWith(".saf")) {
				JavaCode c = SafCompiler.compile(path);
				code = c.getCode();
				fullname = c.getClassName();
			}
			System.out.println(code);
			return (Fighter) SourceCompiler.createInstanceFromSource(fullname, code);
		} catch (Exception e) {
			return new saf.fighters.SampleFighter();
		}
	}
}
