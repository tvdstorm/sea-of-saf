package saf.fight.action;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import saf.ast.action.ChooseAction;
import saf.ast.action.SingleAction;
import saf.message.dialog.ErrorDialog;

public class FAction implements IFAction{
	protected Point position;
	protected BufferedImage img;
	protected SingleAction singleFightAct, singleMoveAct; 
	
	protected final String suffix = "png";
	protected final String path = "/figures/";
	
	public FAction()
	{
		position = new Point();
		singleFightAct = new SingleAction();
		singleMoveAct = new SingleAction();
		img = readFighterImage("stand" + "." + suffix.trim());
	}
	
	@Override
	public BufferedImage getImage()
	{
		return img;
	}
	
	@Override
	public Point getPosition()
	{
		return position;
	}
	
	@Override
	public SingleAction getFightAct()
	{
		return singleFightAct;
	}
	
	@Override
	public SingleAction getMoveAct()
	{
		return singleMoveAct;
	}
	
	protected BufferedImage readFighterImage(String fileName)
	{
		try {
			BufferedImage tempBufferedImg;
			InputStream is = getClass().getResourceAsStream(path+fileName);
			String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
			Iterator<ImageReader> reader =  ImageIO.getImageReadersBySuffix(suffix);
			ImageReader ir = reader.next();
			ImageInputStream iis = ImageIO.createImageInputStream(is);
		    ir.setInput(iis,false);
		    tempBufferedImg = ir.read(ir.getMinIndex());
		    is.close();
			return tempBufferedImg;
		} catch (IOException e) {
			ErrorDialog safErrorDialog = new ErrorDialog();
			safErrorDialog.setErrorMessage(e.toString());
			safErrorDialog.setVisible(true);
			e.printStackTrace();
		}
		return null;
	}
	
	protected SingleAction getRandomAction(ChooseAction ca)
	{
		SingleAction tempAct;
		Random r = new Random();
		tempAct = (SingleAction) ca.getActions().get(r.nextInt(ca.getActions().size()));
		return tempAct;
	}
}
