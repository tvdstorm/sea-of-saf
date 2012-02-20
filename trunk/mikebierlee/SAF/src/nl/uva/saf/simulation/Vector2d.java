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

	public Vector2d() {
		x = 0;
		y = 0;
	}

	public Vector2d(Vector2d source) {
		x = source.x;
		y = source.y;
	}

	public Vector2d(double components) {
		x = components;
		y = components;
	}

	public Vector2d(double x, double y) {
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

	public static Vector2d multiply(Vector2d vec, double scalar) {
		Vector2d resultVector = new Vector2d(vec);
		resultVector.x *= scalar;
		resultVector.y *= scalar;
		return resultVector;
	}

	public double length() {
		return Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	public void normalize() {
		double length = this.length();
		if (length != 0) {
			x /= length;
			y /= length;
		}
	}

	public boolean equals(Vector2d vec) {
		return vec.x == x && vec.y == y;
	}
}
