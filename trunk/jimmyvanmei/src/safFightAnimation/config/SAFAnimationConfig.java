package safFightAnimation.config;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import safAST.action.SelectAction;
import safAST.action.SingleAction;
import safMessage.SAFErrorMessageDialog;

public class SAFAnimationConfig implements ISAFAnimationConfig{
	protected Point position;
	protected BufferedImage fighterImg;
	protected SingleAction singleFightAct, singleMoveAct; 
	
	protected final String suffix = "png";
	protected final String path = "/safFigures/";
	
	public SAFAnimationConfig()
	{
		position = new Point();
		singleFightAct = new SingleAction();
		singleMoveAct = new SingleAction();
		fighterImg = readFighterImage("stand" + "." + suffix.trim());
	}
	
	@Override
	public BufferedImage getFightImage()
	{
		return fighterImg;
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
			SAFErrorMessageDialog safErrorDialog = new SAFErrorMessageDialog();
			safErrorDialog.setErrorMessage(e.toString());
			safErrorDialog.setVisible(true);
			e.printStackTrace();
		}
		return null;
	}
	
	protected SingleAction getRandomAction(SelectAction sa)
	{
		SingleAction tempAct;
		Random r = new Random();
		tempAct = (SingleAction) sa.getActions().get(r.nextInt(sa.getActions().size()));
		return tempAct;
	}
}
