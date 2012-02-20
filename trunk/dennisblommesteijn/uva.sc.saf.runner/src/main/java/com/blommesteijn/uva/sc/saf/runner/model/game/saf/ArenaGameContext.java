/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game.saf;

import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.Property;
import com.blommesteijn.uva.sc.saf.runner.model.game.IDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGame;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGameContext;

/**
 * Super Awesome Fighter Game Context
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class ArenaGameContext implements IGameContext
{
	private IGame _game = null;
	private List<Fighter> _fighters = null;
	
	private long _time = 0L;
	private String[][] _matrix = null;

	/**
	 * Construct a Fighter context
	 * @param game 
	 * @param fighters 
	 * @param fighter fighter object
	 */
	public ArenaGameContext(IGame game, List<Fighter> fighters)
	{
		_game = game;
		_fighters = fighters;
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#load()
	 */
	public void load()
	{
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#unload()
	 */
	public void unload()
	{
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#loadContext()
	 */
	public void loadContext()
	{
//		_matrix = new String[][] {};
		
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#unloadContext()
	 */
	public void unloadContext()
	{
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#update()
	 */
	public void update()
	{
//		//TODO: arena properties
//		for(Fighter fighter : _fighters)
//		{
//			for(Property property : fighter.getProperties())
//			{
//				System.out.println("ident: " + property.getIdent());
//				System.out.println("value: " + property.getValue());
////				proper
//			}
//		}
		

		
		
		
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#draw()
	 */
	public void draw(IDraw draw)
	{
		draw.print("draw test\n" +
				"draw test\n" +
				"");
	}

}
