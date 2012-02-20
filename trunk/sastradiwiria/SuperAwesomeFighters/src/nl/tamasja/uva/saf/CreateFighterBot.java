package nl.tamasja.uva.saf;

import java.util.ArrayList;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.graphics.DrawFighter;
import nl.tamasja.uva.saf.tree.ErrorMessage;
import nl.tamasja.uva.saf.tree.FighterAstChecker;
import nl.tamasja.uva.saf.tree.FighterAstLoader;
import nl.tamasja.uva.saf.tree.FighterBotLoader;
import nl.tamasja.uva.saf.tree.ast.Fighter;

public class CreateFighterBot {

	private FighterAstLoader fighterAstLoader;
	private FighterAstChecker fighterAstChecker;
	private FighterBotLoader fighterBotLoader;

	
	public CreateFighterBot() {
		fighterAstLoader = new FighterAstLoader();
		fighterAstChecker = new FighterAstChecker();
		fighterBotLoader = new FighterBotLoader();	
	}
	
	public FighterBot loadFighterFile(String path) {
		
		FighterBot fighterBot = null;
		
		Fighter fighterAst = fighterAstLoader.loadFile(path);
		
		ArrayList<ErrorMessage> fighterErrors = fighterAstChecker.checkAst(fighterAst);
		
		if(fighterErrors.size() > 0) {
			for(ErrorMessage e: fighterErrors) {
				System.out.println(e.getMessage());
			}
		} else {
			fighterBot = fighterBotLoader.traverseFighterAst(fighterAst,new DrawFighter(200));
		}
		
		return fighterBot;
	}
	
}
