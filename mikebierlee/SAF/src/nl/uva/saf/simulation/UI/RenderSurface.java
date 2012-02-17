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
