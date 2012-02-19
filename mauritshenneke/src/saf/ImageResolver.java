package saf;

import javax.swing.ImageIcon;

public class ImageResolver  
{       
	private String imagesRootPath ;
	
        public void setFiguresRootPath(String imagesRootPath){
        	this.imagesRootPath = imagesRootPath;
        }
        
        public ImageIcon getImage(String actionTypeName, String fighterColor)
        {
        	String filePath  = String.format("%s/%s/%s.gif", imagesRootPath, fighterColor, actionTypeName);
        	return new ImageIcon(filePath);
        }

}