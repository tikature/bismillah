package src.main.java;

public class AreaCalculator {

	public static double calculateArea(ShapeType shapeType, double... dimensions) {
		switch (shapeType) {
			case CIRCLE:
				if (dimensions.length != 1) {
					throw new IllegalArgumentException("CIRCLE needs 1 dimension (radius)");
				}
				return Math.PI * dimensions[0] * dimensions[0];
			case SQUARE:
				if (dimensions.length != 1) {
					throw new IllegalArgumentException("SQUARE needs 1 dimension (side)");
				}
				return dimensions[0] * dimensions[0];
			case RECTANGLE:
				if (dimensions.length != 2) {
					throw new IllegalArgumentException("RECTANGLE needs 2 dimensions (length and width)");
				}
				return dimensions[0] * dimensions[1];
			default:
				throw new UnsupportedOperationException("Unknown shape type");
		}
	}

	public static void main(String[] args) {
		System.out.println("Luas Lingkaran (r=3): " + calculateArea(ShapeType.CIRCLE, 3));
		System.out.println("Luas Persegi (s=4): " + calculateArea(ShapeType.SQUARE, 4));
		System.out.println("Luas Persegi Panjang (l=5, w=2): " + calculateArea(ShapeType.RECTANGLE, 5, 2));
	}
}
