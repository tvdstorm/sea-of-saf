package nl.uva.saf.simulation.UI;

import java.awt.Graphics;
import javax.swing.JPanel;

import nl.uva.saf.simulation.IRenderer;

public class RenderSurface extends JPanel {
	private static final long serialVersionUID = -1699307178102178482L;
	private final IRenderer renderer;
	
	public RenderSurface(IRenderer renderer) {
		this.renderer = renderer;
		
		if (renderer != null) {
			renderer.BindRenderSurface(this);
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
		renderer.UnbindRenderSurface();
	}
}
