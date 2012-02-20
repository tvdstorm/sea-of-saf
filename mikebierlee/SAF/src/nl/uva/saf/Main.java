/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.SwingUtilities;

import nl.uva.saf.simulation.FightSimulator;
import nl.uva.saf.simulation.IFightSimulator;
import nl.uva.saf.simulation.IRenderer;
import nl.uva.saf.simulation.Renderer;
import nl.uva.saf.simulation.UI.MainWindow;

public class Main {

	public static void main(String[] args) throws IOException {
		final IFightSimulator simulator = new FightSimulator();
		simulator.setPlayFieldSize(new Dimension(825, 350));
		final IRenderer renderer = new Renderer(simulator, 60);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainWindow mainWindow = new MainWindow(simulator, renderer);
				mainWindow.setVisible(true);
				renderer.start(true);
			}
		});

		try {
			while (!simulator.isDisposed()) {
				simulator.update();
				Thread.sleep(1000 / 30);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		renderer.stop();
	}
}
