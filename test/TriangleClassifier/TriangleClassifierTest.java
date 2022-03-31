package TriangleClassifier;

import Phan.loai.tam.giac.TriangleClassifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TriangleClassifierTest {
    @Test
    void testCheckTriangle() {
        double sideA = 5.0;
        double sideB = 5.0;
        double sideC = 5.0;
        boolean result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
//        assertTrue(result);
//        assertTrue(TriangleClassifier.checkIsocelesTriangle(sideA,sideB,sideC));
        assertTrue(TriangleClassifier.checkTamGiacDeu(sideA,sideB,sideC));

    }
}
