package saf.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

final class SafFileFilter extends FileFilter {
	@Override
	public String getDescription() {
		return "Super Awesome Fighter Files (*.saf)";
	}

	@Override
	public boolean accept(File file) {				
		return "saf".equalsIgnoreCase(getExtension(file));
	}

	private String getExtension(File f) {
	    String name = f.getName();
	    int i = name.lastIndexOf('.');

	    if (i > 0 &&  i < name.length() - 1)
	        return name.substring(i+1);
	    
	    return null;
	}
}