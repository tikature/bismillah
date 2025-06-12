package src.main.java;

public enum ShapeType {
    CIRCLE("Circle", 1),
    SQUARE("Square", 1),
    RECTANGLE("Rectangle", 2);

    private final String name;
    private final int numberOfParams;

    ShapeType(String name, int numberOfParams) {
        this.name = name;
        this.numberOfParams = numberOfParams;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfParams() {
        return numberOfParams;
    }

    @Override
    public String toString() {
        return name + " (needs " + numberOfParams + " parameter(s))";
    }
}
