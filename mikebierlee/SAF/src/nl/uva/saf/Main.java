/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf;

import java.io.IOException;

import nl.uva.saf.fdl.TreeValidator;
import nl.uva.saf.fdl.ValidationReport;
import nl.uva.saf.fdl.ast.Fighter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		IFighterLoader loader = new ANTLFighterLoader();
		Fighter fighter = (Fighter) loader.loadFighter("data/challengingFighter.saf");
		
		TreeValidator validator = new TreeValidator();
		ValidationReport validationReport = validator.validate(fighter);
		
		for(String warning : validationReport.getWarnings()) {
			System.out.println("Warning: " + warning);
		}
		
		for(String error : validationReport.getErrors()) {
			System.err.println("Error: " + error);
		}

		System.out.println("Loaded " + fighter.getName() + " - " + validationReport.getWarnings().size() + " warnings, " + validationReport.getErrors().size() + " errors.");
	}

}