package arena;
import javax.swing.ImageIcon;
import fighter.Combatmove;

public class Graphics 
{

	public ImageIcon _deadA;
	private ImageIcon _punchhighA;
	private ImageIcon _punchlowA;
	private ImageIcon _kickhighA;
	private ImageIcon _kicklowA;
	private ImageIcon _blocklowA;
	private ImageIcon _blockhighA;
	private ImageIcon _standA;
	
	public ImageIcon _deadB;
	private ImageIcon _punchhighB;
	private ImageIcon _punchlowB;
	private ImageIcon _kickhighB;
	private ImageIcon _kicklowB;
	private ImageIcon _blocklowB;
	private ImageIcon _blockhighB;
	private ImageIcon _standB;
	
	public Graphics()
	{
		_deadA = loadImage("c:\\antlr\\saf\\graphics\\A\\dead.gif");
		_punchhighA = loadImage("c:\\antlr\\saf\\graphics\\A\\punchhigh.gif");
		_punchlowA = loadImage("c:\\antlr\\saf\\graphics\\A\\punchlow.gif");
		_kickhighA = loadImage("c:\\antlr\\saf\\graphics\\A\\kickhigh.gif");
		_kicklowA = loadImage("c:\\antlr\\saf\\graphics\\A\\kicklow.gif");
		_standA = loadImage("c:\\antlr\\saf\\graphics\\A\\stand.gif");
		_blocklowA = loadImage("c:\\antlr\\saf\\graphics\\A\\blocklow.gif");
		_blockhighA = loadImage("c:\\antlr\\saf\\graphics\\A\\blockhigh.gif");
		
		_deadB = loadImage("c:\\antlr\\saf\\graphics\\B\\dead.gif");
		_punchhighB = loadImage("c:\\antlr\\saf\\graphics\\B\\punchhigh.gif");
		_punchlowB = loadImage("c:\\antlr\\saf\\graphics\\B\\punchlow.gif");
		_kickhighB = loadImage("c:\\antlr\\saf\\graphics\\B\\kickhigh.gif");
		_kicklowB = loadImage("c:\\antlr\\saf\\graphics\\B\\kicklow.gif");
		_standB = loadImage("c:\\antlr\\saf\\graphics\\B\\stand.gif");
		_blocklowB = loadImage("c:\\antlr\\saf\\graphics\\B\\blocklow.gif");
		_blockhighB = loadImage("c:\\antlr\\saf\\graphics\\B\\blockhigh.gif");
	}
	
	private ImageIcon loadImage(String fileName) {
	    return new ImageIcon(fileName);
	}
	
	public ImageIcon getImage(Combatmove combatmove, int fighter)
	{
		if (fighter==1)
		{
			if (combatmove == null)
				return _deadA;
			
			switch (combatmove._action)
			{
				case punch_high:
					return _punchhighA;
				case punch_low:
					return _punchlowA;
				case kick_high:
					return _kickhighA;
				case kick_low:
					return _kicklowA;
				case block_low:
					return _blocklowA;
				case block_high:
					return _blockhighA;
			}
			
			return _standA;
		}
		else
		{
			if (combatmove == null)
				return _deadB;
			
			switch (combatmove._action)
			{
				case punch_high:
					return _punchhighB;
				case punch_low:
					return _punchlowB;
				case kick_high:
					return _kickhighB;
				case kick_low:
					return _kicklowB;
				case block_low:
					return _blocklowB;
				case block_high:
					return _blockhighB;
			}
			
			return _standB;
		}
	}

}
