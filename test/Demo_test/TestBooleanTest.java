package Demo_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBooleanTest {

    @Test
    void getBoolean() {
        double width = 1.0;
        double height = 2.0 * Math.random();
        Boolean result = TestBoolean.getBoolean(width, height);
        assertEquals(result, false);
        System.out.println("height ==== " + height);
        assertFalse(width == height, "Khong phai square");
    }
}