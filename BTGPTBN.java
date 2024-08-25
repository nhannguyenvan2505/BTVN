package BT;

import java.util.Scanner;

public class BTGPTBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT VSN.");
            } else {
                System.out.println("PT VN.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua PT la x = " + x);
        }
    }
}
