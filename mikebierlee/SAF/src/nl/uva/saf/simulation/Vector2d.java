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
