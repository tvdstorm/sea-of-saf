package nl.uva.saf.test;

import javax.swing.JComponent;
import javax.swing.JPanel;

import junit.framework.Assert;

import nl.uva.saf.simulation.IRenderer;
import nl.uva.saf.simulation.Renderer;

import org.junit.Test;

public class RendererTest {
	@Test
	public void surfaceBindingTest() {
		JComponent renderSurface = new JPanel();
		IRenderer renderer = new Renderer(null, 60);

		renderer.bindRenderSurface(renderSurface);
		Assert.assertEquals(renderSurface, renderer.getSurface());

		renderer.unbindRenderSurface();
		Assert.assertEquals(null, renderer.getSurface());
	}
}
