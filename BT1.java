package BT;

import java.util.Random;
import java.util.Scanner;

public class BT1 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String sc;
        Random rd = new Random();

        do {
            int n = rd.nextInt(100) + 1;
            int check = n % 2;
            System.out.println("Ban co muon kiem tra ?");
            sc = key.next();
            if (check == 0) {
                System.out.println("n la so chan ");
            } else {
                System.out.println("n la so le ");
            }
            System.out.println(n);
            System.out.println("----------------------------");
        } while (sc.equals("yes"));
    }
}