package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class BTArrayList {

    public static ArrayList<Integer> inputArrayList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Nhap so phan tu mang: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }
        return arrayList;
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        System.out.println("Cac phan tu trong mang la: " + arrayList);
    }

    public static int findSecondLargest(ArrayList<Integer> arrayList) {
        if (arrayList.size() < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return Integer.MIN_VALUE;
        }
        int Max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : arrayList) {
            if (number > Max) {
                max2 = Max;
                Max = number;
            } else if (number > max2 && number < Max) {
                max2 = number;
            }
        }
        return max2;
    }

    public static void removeOddNumbers(ArrayList<Integer> arrayList) {
        arrayList.removeIf(number -> number % 2 != 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = inputArrayList();
        printArrayList(arrayList);
        int max2 = findSecondLargest(arrayList);
        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        }
        removeOddNumbers(arrayList);
        System.out.println("Mang sau khi xoa le: ");
        printArrayList(arrayList);
    }
}
