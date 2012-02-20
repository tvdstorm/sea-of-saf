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

package nl.uva.saf.test;

import junit.framework.Assert;
import nl.uva.saf.fdl.NameExtractor;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;

import org.junit.Before;
import org.junit.Test;

public class NameExtractorTest {
	final String expectedName = "extractNameSuccessfullyTest";
	ITreeNode fighter;

	@Test
	public void extractNameSuccessfullyTest() {
		NameExtractor extractor = new NameExtractor(fighter);
		String extractedName = extractor.extract();

		Assert.assertEquals(expectedName, extractedName);
	}

	@Test
	public void extractWithStaticMethod() {
		String extractedName = NameExtractor.getName(fighter);
		Assert.assertEquals(expectedName, extractedName);
	}

	@Before
	public void setup() {
		fighter = new Fighter(expectedName, null);
	}
}
