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

package nl.uva.saf.simulation;

import java.awt.Graphics;
import java.util.ConcurrentModificationException;

import javax.swing.JComponent;

public interface IRenderer extends Runnable {
	/**
	 * Bind a Swing component to this render to allow it to draw on it. This
	 * function should not be called when the renderer is started.
	 * 
	 * @param surface
	 *            Component serving as render surface.
	 * @throws ConcurrentModificationException
	 *             Thrown when the renderer is running threaded and is currently
	 *             rendering.
	 */
	public void bindRenderSurface(JComponent surface) throws ConcurrentModificationException;

	/**
	 * Draw state onto supplied graphics object. This function is typically
	 * called by the render surface when it receives a command/event to redraw.
	 * 
	 * @param g
	 *            Reference the graphics object of the surface..
	 */
	public void draw(Graphics g);

	public JComponent getSurface();

	/**
	 * If this renderer run threaded, this method will synchronize the calling
	 * thread. If not, this method does nothing.
	 * 
	 * @throws InterruptedException
	 *             Thrown when the render thread is interrupted.
	 */
	public void join() throws InterruptedException;

	/**
	 * Force a manual redraw of the renderer. Mainly used when handling the
	 * render loop outside of the renderer.
	 * 
	 */
	public void redraw();

	/**
	 * Allow the renderer to draw.
	 * 
	 * @param threaded
	 *            Set whether the renderer should use its internal threading
	 *            mechanism to defer rendering to a different thread. If set to
	 *            false you will have to render using redraw().
	 */
	public void start(boolean threaded);

	public void stop();

	public void unbindRenderSurface();

	/**
	 * Update the size of the drawing area, making it the same as the size of
	 * the bound render surface.
	 * 
	 */
	public void updateDrawArea();
}
