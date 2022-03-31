package Phan.loai.tam.giac;

public class TriangleClassifier {
    public static boolean checkTriangle(double sideA, double sideB, double sideC) {
     if ((sideA+sideB)>sideC && (sideA+sideC)>sideB && (sideB+sideC)>sideA) {
         return true;
     } else {
         return false;
     }
    }
    public static boolean checkIsocelesTriangle(double sideA, double sideB, double sideC) {
        double sideAB = sideA + sideB;
        double sideAC = sideA + sideC;
        double sideBC = sideB + sideC;
        if (sideAB >sideC && sideAC >sideB && sideBC >sideA) {
            if (sideA == sideB || sideA == sideC || sideB == sideC) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static boolean checkTamGiacDeu(double sideA, double sideB, double sideC) {
        double sideAB = sideA + sideB;
        double sideAC = sideA + sideC;
        double sideBC = sideB + sideC;
        if (sideAB >sideC && sideAC >sideB && sideBC >sideA) {
            if (sideA == sideB && sideA == sideC) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
