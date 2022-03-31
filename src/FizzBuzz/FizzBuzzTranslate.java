package FizzBuzz;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = input.nextInt();
        int phanChuc = number / 10;
        int phanDonVi = number - phanChuc * 10;
        if ((number % 15 == 0)) {
            System.out.println("FizzBuzz");
        } else if ((number % 3 == 0) || (phanChuc == 3) || (phanDonVi == 3)) {
            System.out.println("Fizz");
        } else if ((number % 5 == 0) || (phanChuc == 5) || (phanDonVi == 5)) {
            System.out.println("Buzz");
        } else {
            switch (phanChuc) {
                case 0:
                    System.out.print("khong ");
                    break;
                case 1:
                    System.out.printf("mot ");
                    break;
                case 2:
                    System.out.printf("hai ");
                    break;
                case 3:
                    System.out.printf("ba ");
                    break;
                case 4:
                    System.out.printf("bon ");
                    break;
                case 5:
                    System.out.printf("nam ");
                    break;
                case 6:
                    System.out.printf("sau ");
                    break;
                case 7:
                    System.out.printf("bay ");
                    break;
                case 8:
                    System.out.printf("tam ");
                    break;
                case 9:
                    System.out.printf("chin ");
                    break;
            }
            switch (phanDonVi) {
                case 0:
                    System.out.print("khong ");
                    break;
                case 1:
                    System.out.printf("mot ");
                    break;
                case 2:
                    System.out.printf("hai ");
                    break;
                case 3:
                    System.out.printf("ba");
                    break;
                case 4:
                    System.out.printf("bon");
                    break;
                case 5:
                    System.out.printf("nam");
                    break;
                case 6:
                    System.out.printf("sau");
                    break;
                case 7:
                    System.out.printf("bay");
                    break;
                case 8:
                    System.out.printf("tam");
                    break;
                case 9:
                    System.out.printf("chin");
                    break;
            }
        }
    }
}
