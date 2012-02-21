package com.blommesteijn.uva.sc.saf.runner.model.interpreter;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.runner.model.game.Draw;
import com.blommesteijn.uva.sc.saf.runner.model.game.Game;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;
import com.blommesteijn.uva.sc.saf.runner.model.game.IDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGame;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.ArenaGameContext;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.FighterGameContext;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.Arena;

/**
 * Super Awesome Game Interpreter (SAF)
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class SuperAwesomeGameInterpreter implements IInterpreter
{
	private List<AstNode> _astNodes = null;
	private IGame _game = null;

	/**
	 * Construct SAF game from AST
	 * @param astNodes list of ASTs
	 * @param draw 
	 * @throws GameException 
	 */
	public SuperAwesomeGameInterpreter(List<AstNode> astNodes, IDraw draw) throws GameException
	{
		_astNodes  = astNodes;		
		_game  = new Game(draw);
		
		//load fighters
		List<Fighter> fighters = this.getFighters();
		
		//load arena configuration
		Arena arena = Arena.getInstance();
		
		//load fighters
		for(Fighter fighter : fighters)
			_game.addContext(new FighterGameContext(_game, arena, fighter));
		
		//load arena
		_game.addContext(new ArenaGameContext(_game, arena));
	}

	
	/**
	 * Get Fighters from AST
	 * @return list of Fighters
	 */
	private List<Fighter> getFighters()
	{
		List<Fighter> fighters = new LinkedList<Fighter>();
		for(AstNode astNode : _astNodes)
		{
			fighters.addAll(astNode.getFighters());
		}
		return fighters;
	}

	/**
	 * Start game
	 */
	public void start()
	{		
		_game.start();
	}

}
