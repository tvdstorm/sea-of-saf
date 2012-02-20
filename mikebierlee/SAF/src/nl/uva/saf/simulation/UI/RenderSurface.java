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

package nl.uva.saf.simulation.UI;

import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;

import nl.uva.saf.simulation.IRenderer;

public class RenderSurface extends JPanel implements ComponentListener {
	private static final long serialVersionUID = -1699307178102178482L;
	private final IRenderer renderer;

	public RenderSurface(IRenderer renderer) {
		addComponentListener(this);

		this.renderer = renderer;

		if (renderer != null) {
			renderer.bindRenderSurface(this);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (renderer != null) {
			renderer.draw(g);
		}
	}

	public void unbindRenderer() {
		renderer.unbindRenderSurface();
	}

	@Override
	public void componentHidden(ComponentEvent event) {
	}

	@Override
	public void componentMoved(ComponentEvent event) {
	}

	@Override
	public void componentResized(ComponentEvent event) {
		if (renderer != null) {
			renderer.updateDrawArea();
		}
	}

	@Override
	public void componentShown(ComponentEvent event) {
	}
}
