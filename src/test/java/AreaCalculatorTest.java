package src.test.java;

import src.main.java.AreaCalculator;
import src.main.java.ShapeType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

public class AreaCalculatorTest {

    @Test
    public void testCircleArea() {
        double result = AreaCalculator.calculateArea(ShapeType.CIRCLE, 2);
        assertEquals(12.566, result, 0.001);
    }

    @Test
    public void testSquareArea() {
        double result = AreaCalculator.calculateArea(ShapeType.SQUARE, 4);
        assertEquals(16.0, result, 0.001);
    }

    @Test
    public void testRectangleArea() {
        double result = AreaCalculator.calculateArea(ShapeType.RECTANGLE, 3, 5);
        assertEquals(15.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCircleParams() {
        AreaCalculator.calculateArea(ShapeType.CIRCLE, 2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidShape() {
        AreaCalculator.calculateArea(null, 1);
    }
}
