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

package nl.uva.saf.fdl;

import java.util.ArrayList;

public class ValidationReport {
	private ArrayList<String> errors;
	private ArrayList<String> warnings;

	public ValidationReport() {
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
	}

	public ArrayList<String> getErrors() {
		return errors;
	}

	public ArrayList<String> getWarnings() {
		return warnings;
	}

	public void addError(String error) {
		if (errors != null) {
			errors.add(error);
		}
	}

	public void addWarning(String warning) {
		if (warnings != null) {
			warnings.add(warning);
		}
	}

	public boolean isValid() {
		return errors.size() == 0 ? true : false;
	}
}
