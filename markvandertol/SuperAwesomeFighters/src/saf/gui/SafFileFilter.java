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

	private String getExtension(File file) {
	    String name = file.getName();
	    int lastIndex = name.lastIndexOf('.');

	    if (lastIndex > 0 &&  lastIndex < name.length() - 1)
	        return name.substring(lastIndex+1);
	    
	    return null;
	}
}