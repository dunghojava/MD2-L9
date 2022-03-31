package Demo_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea() {
        double side = 5.0;
        double expected = side * side;
        double result = Square.getArea(side);
        assertEquals(expected, result);

    }
}