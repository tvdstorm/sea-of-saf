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

package nl.uva.saf.test.mocks;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * Removes the random factor from the random number generator to produce
 * testable facts.
 */
public class RandomMock extends Random {
	private static final long serialVersionUID = 6029252354710961782L;

	private int currentIndex = 0;
	private final List<Integer> expected;

	/**
	 * Constructs instance of the random mock. This instance will return the
	 * number 0 at every call.
	 * 
	 */
	public RandomMock() {
		expected = new ArrayList<Integer>();
		expected.add(0);
	}

	/**
	 * Constructs instance of the random mock.
	 * 
	 * @param expected
	 *            List of expected returned random numbers in order. Will loop
	 *            around if more requests are made than the list contains.
	 */
	public RandomMock(List<Integer> expected) {
		this.expected = expected;
	}

	@Override
	public int nextInt(int n) {
		if (currentIndex == expected.size()) {
			currentIndex = 0;
		}

		return expected.get(currentIndex++);
	}
}