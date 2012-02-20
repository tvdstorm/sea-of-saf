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

package nl.uva.saf.simulation;

import java.util.Random;

import nl.uva.saf.fdl.ActionSelector;

/**
 * Simulation parameters allow you to assign different strategies to the
 * simulator by influencing it's evaluation and execution objects.
 */
public class SimulationParameters {
	private final IActionExecutor actionExecutor;
	private final ActionSelector actionSelector;
	private final IConditionSemantics conditionSemantics;

	public SimulationParameters() {
		actionSelector = new ActionSelector(new Random());
		conditionSemantics = new ConditionSemantics();
		actionExecutor = new ActionExecutor();
	}

	public SimulationParameters(ActionSelector actionSelector, IConditionSemantics conditionSemantics,
			IActionExecutor actionExecutor) {
		this.actionSelector = actionSelector;
		this.conditionSemantics = conditionSemantics;
		this.actionExecutor = actionExecutor;
	}

	public IActionExecutor getActionExecutor() {
		return actionExecutor;
	}

	public ActionSelector getActionSelector() {
		return actionSelector;
	}

	public IConditionSemantics getConditionSemantics() {
		return conditionSemantics;
	}
}
