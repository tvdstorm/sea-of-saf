package saf;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import parser.SAFParser;
import saf.astnodes.Fighter;
import saf.astvisitors.validators.Validator;
import saf.engines.SimpleArenaEngine;
import saf.mvc.controllers.SimpleFightController;
import saf.mvc.models.SimpleFighterModel;
import saf.mvc.views.SimpleFighterArenaView;

public class MainProgram {
	public static void main(String args[]) {
		if(args.length != 2){
			System.out.print("Er zijn niet 2 geldige SAF bestanden opgegeven!");
		}
		else
		{
			try {
				HashMap<String, Fighter> fighters = new HashMap<String, Fighter>();

				//This loop throws an exception if something is wrong, so no extra check for errors is needed
				for(String fighterFile: args){
					InputStream inputStream = new FileInputStream(fighterFile);
					SAFParser parser = new SAFParser(inputStream);
		
					//Start parsing the file, put output ast in the hashmap.
					fighters.put(fighterFile, parser.Fighter());
		
					inputStream.close();
				}

				Boolean errorsFound = false;
				for(String fighterFile: fighters.keySet()){
					List<String> errors = Validator.check(fighters.get(fighterFile));

					if(!errors.isEmpty()) {
						errorsFound = true;
						System.out.println("Errors found in " + fighterFile);
						for(String error: errors)
							System.out.println(error);
					}
				}

				if(!errorsFound){
					ArrayList<Fighter> fighterArrayList = new ArrayList<Fighter>(fighters.values());
					startFightSimulation(fighterArrayList.get(0), fighterArrayList.get(1));		
				}
			} catch (Exception e) {
				System.out.println("Exception during parsing: " + e.getMessage());
			}
		}
	}
	
	private static void startFightSimulation(Fighter fighter01, Fighter fighter02){
		try {
			SimpleFighterModel fighterModel1 = new SimpleFighterModel(5, 100, "stand", "stand", fighter01);
			SimpleFighterModel fighterModel2 = new SimpleFighterModel(10, 100, "stand", "stand", fighter02);	
			SimpleArenaEngine arenaEngine = new SimpleArenaEngine(fighterModel1, fighterModel2);
			SimpleFighterArenaView simpleFightView = new SimpleFighterArenaView(fighterModel1, fighterModel2);
			SimpleFightController fightController = new SimpleFightController(arenaEngine, simpleFightView);
			fightController.run();
		} catch (Exception e) {
			System.out.println("Exception during simulation: " + e.getMessage() + "\n" + e.getLocalizedMessage());
		}
	}
}
