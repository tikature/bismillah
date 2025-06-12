package geometry;

public class AreaCalculator {

	public static double calculateArea(ShapeType shape, double... params) {
		if (params.length != shape.getNumberOfParams()) {
			throw new IllegalArgumentException(
					shape.getName() + " requires " + shape.getNumberOfParams() + " parameter(s).");
		}

		switch (shape) {
			case CIRCLE:
				double radius = params[0];
				return Math.PI * radius * radius;
			case SQUARE:
				double side = params[0];
				return side * side;
			case RECTANGLE:
				double length = params[0];
				double width = params[1];
				return length * width;
			default:
				throw new IllegalArgumentException("Unsupported shape: " + shape);
		}
	}
}
