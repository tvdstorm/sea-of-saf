package visualization;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

	class ImagePanel extends JComponent {
		private static final long serialVersionUID = 1L;
		private Image image;
		int x;
		int y;
	    
		public ImagePanel(Image image, int x, int y) {
	        this.image = image;
	        this.x = x;	    
	    }
		
	    @Override
	    protected void paintComponent(Graphics g) {
	        g.drawImage(image, x, y, null);
	    }
	

}
