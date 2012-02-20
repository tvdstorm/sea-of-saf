package animator;

class Images {
	
	// Define the directories where the images are
	private final static String DIR = "images/";
	private final static String WEST = DIR + "west/";
	private final static String EAST = DIR + "east/";
	
	// All images for all bot actions are in these three folders
	// Each contains a set of images for a body position 
	private final static String CROUCH = "crouch/";
	private final static String DEFAULT = "default/";
	private final static String JUMP = "jump/";
	
	private String usedDir = "";
	
	public final static String BLANK = DIR + "blank.png";
	
	// Names of the images for different Bot attacks
	private final String BLOCKLOW = "block-low.png";
	private final String BLOCKHIGH ="block-high.png";
	private final String KICKLOW = "kick-low.png";
	private final String KICKHIGH = "kick-high.png";
	private final String PUNCHLOW = "punch-low.png";
	private final String PUNCHHIGH = "punch-high.png";
	private final String STAND = "stand.png";
	
	
	public Images(String direction, String bodyPosition)
	{
		// Choose the image directory based on the orientation and the body position of the Bot
		if(direction.equalsIgnoreCase("west"))
		{
			usedDir = WEST;
		}
		else
		{
			usedDir = EAST;
		}
		
		if(bodyPosition.equalsIgnoreCase("crouch"))
		{
			usedDir += CROUCH;
		}
		else if(bodyPosition.equalsIgnoreCase("jump"))
		{
			usedDir += JUMP;
		}
		else
		{
			usedDir += DEFAULT;
		}
	}
	
	public String getBlockHigh()
	{
		return usedDir + BLOCKHIGH;
	}
	
	public String getBlockLow()
	{
		return usedDir + BLOCKLOW;
	}
	
	public String getKickLow()
	{
		return usedDir + KICKLOW;
	}
	
	public String getKickHigh()
	{
		return usedDir + KICKHIGH;
	}
	
	public String getPunchLow()
	{
		return usedDir + PUNCHLOW;
	}
	
	public String getPunchHigh()
	{
		return usedDir + PUNCHHIGH;
	}
	
	public String getStand()
	{
		return usedDir + STAND;
	}
	
}
