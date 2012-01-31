package saf.visualisation;

import java.awt.Graphics;

/* 
 * LIMB depends only on Graphics, because Graphics is like Java sais: 
 * The Graphics class is the abstract base class for all graphics contexts 
 * that allow an application to draw onto components that are realized on 
 * various devices, as well as onto off-screen images.  
 */
public interface ILimb{
	public void draw(Graphics s);
}
