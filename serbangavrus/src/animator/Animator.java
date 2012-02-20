package animator;

import saf.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Animator {
	private Bot bot1, bot2;
	private ArrayList<JLabel> places = new ArrayList<JLabel>();
	private JFrame frame;
	private JPanel panel;
	private JLabel bot1Health, bot2Health, winnerL;
	
	public Animator(Bot b1, Bot b2)
	{
		bot1 = b1;
		bot2 = b2;
	}

	public void init()
	{
		// Create the frame and container.
	    frame = new JFrame("Super Awesome Fighters");
	    panel = new JPanel();
	    
	    initMiscLabels();
	    initPlaces(Arena.getSize());
	    	    
	    drawBot(bot1);
	    drawBot(bot2);

	    // Add the panels to the frame.
	    frame.getContentPane().add(panel);

	    // Exit when the window is closed.
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Show the frame
	    frame.pack();
	    frame.setVisible(true);	
	}
	
	// Create the miscellaneous labels(health and winner)
	public void initMiscLabels()
	{
		// Create the panel where the misc labels will be placed
	    JPanel miscPanel = new JPanel();
	    miscPanel.setLayout(new BoxLayout(miscPanel, BoxLayout.PAGE_AXIS));
	    panel.add(miscPanel);
	    
		bot1Health = new JLabel();		
		bot2Health = new JLabel();
		winnerL = new JLabel();
		winnerL.setForeground(Color.green);
		miscPanel.add(bot1Health);
		miscPanel.add(bot2Health);
		miscPanel.add(winnerL);
	}
	
	// Creates a JLabels with a blank image for each position in the Arena
	public void initPlaces(int numberOfPlaces)
	{
		for(int i = 0; i<numberOfPlaces; i++)
		{
			JLabel place = new JLabel();
			places.add(place);
			panel.add(place);
		}
		clear();
	}
	
	private void drawBotsHealth()
	{
		bot1Health.setText(bot1.getBotName() + "'s health\n is " + bot1.getHealth());
		bot2Health.setText(bot2.getBotName() + "'s health is " + bot2.getHealth());
	}
	
	// Draws a bot on the frame
	private void drawBot(Bot bot)
	{
		
		// Get the bot's position in the Arena
		int botPosition = bot.getPosition();
		// Get the place(JLabel) from that position
		JLabel botPlace = places.get(botPosition);
		drawPlace(botPlace, getBotIcon(bot), bot.getBotName());
		
	}
	
	// Makes all JLabels blank
	private void clear()
	{
		for(JLabel jf : places)
		{
			drawPlace(jf, new ImageIcon(Images.BLANK));
		}
	
	}
	
	// Returns the image corresponding to the bot's current state as ImageIcon
	private ImageIcon getBotIcon(Bot bot)
	{
		Images img = new Images(getBotOrientation(bot),getBotBodyPosition(bot));
		if(bot.getPunchHigh())
		{
			return new ImageIcon(img.getPunchHigh());
		}
		else if(bot.getPunchLow())
		{
			return new ImageIcon(img.getPunchLow());
		}
		else if(bot.getKickHigh())
		{
			return new ImageIcon(img.getKickHigh());
		}
		else if(bot.getKickLow())
		{
			return new ImageIcon(img.getKickLow());
		}
		else if(bot.getBlockHigh())
		{
			return new ImageIcon(img.getBlockHigh());
		}
		else if(bot.getBlockLow())
		{
			return new ImageIcon(img.getBlockLow());
		}
		else
		{
			return new ImageIcon(img.getStand());
		}
	}
	
	// Adds Image and text to a JLabel that represents a fighter
	public void drawPlace(JLabel jl, ImageIcon img, String aboveText)
	{
		jl.setIcon(img);
		jl.setText(aboveText);
		
		jl.setHorizontalTextPosition(JLabel.CENTER);
		jl.setVerticalTextPosition(JLabel.TOP);
	}
	
	public void drawPlace(JLabel jl, ImageIcon img)
	{
		drawPlace(jl, img, " ");		
	}
	
	// Update the bots and misc information
	public void animate()
	{
		// Remove the images previously drawn
		clear();
		
		drawBot(bot1);
	    drawBot(bot2);
	    drawBotsHealth();
	}
	
	// Returns the Bot's orientation
	private String getBotOrientation(Bot bot)
	{
		if(bot.getPosition() - bot.getOpponentPosition() < 0)
		{
			return "east";
		}
		else
		{
			return "west";
		}
	}
	
	// Shows a text with the winner of the match
	public void matchFinished()
	{
		// Clear the Bot's off the frame
		clear();
		
		Bot winner;
		if(bot1.isDefeated())
		{
			winner = bot2;
			winnerL.setText(winner.getBotName() + " is the winner!");
		}
		else if(bot2.isDefeated())
		{
			winner = bot1;
			winnerL.setText(winner.getBotName() + " is the winner!");
		}
	}
	
	// Returns the bot's body position: crouch, jump or stand(default)
	private String getBotBodyPosition(Bot bot)
	{
		if(bot.getCrouch())
		{
			return "crouch";
		}
		else if(bot.getJump())
		{
			return "jump";
		}
		else
		{
			return "stand";
		}
	}
	
}
