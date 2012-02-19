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

public class Vector2d {
	public double x, y;

	Vector2d() {
		x = 0;
		y = 0;
	}

	Vector2d(Vector2d source) {
		x = source.x;
		y = source.y;
	}

	Vector2d(double components) {
		x = components;
		y = components;
	}

	Vector2d(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void add(Vector2d vector) {
		x += vector.x;
		y += vector.y;
	}

	public void substract(Vector2d vector) {
		x -= vector.x;
		y -= vector.y;
	}

	public static Vector2d add(Vector2d vec1, Vector2d vec2) {
		Vector2d resultVector = new Vector2d(vec1);
		resultVector.add(vec2);
		return resultVector;
	}

	public static Vector2d substract(Vector2d vec1, Vector2d vec2) {
		Vector2d resultVector = new Vector2d(vec1);
		resultVector.substract(vec2);
		return resultVector;
	}
}
