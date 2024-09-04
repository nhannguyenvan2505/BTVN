package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBT {

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

    public static void displayMenu() {
        ArrayList<Integer> arrayList = null;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap mang");
            System.out.println("2. Xuat mang");
            System.out.println("3. Tim phan tu lon thu 2");
            System.out.println("4. Xoa so le ra khoi mang");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    arrayList = inputArrayList();
                    break;
                case 2:
                    if (arrayList != null) {
                        printArrayList(arrayList);
                    } else {
                        System.out.println("Ban chua nhap mang.");
                    }
                    break;
                case 3:
                    if (arrayList != null) {
                        int secondLargest = findSecondLargest(arrayList);
                        if (secondLargest != Integer.MIN_VALUE) {
                            System.out.println("Phan tu lon thu 2 trong mang la: " + secondLargest);
                        }
                    } else {
                        System.out.println("Ban chua nhap mang.");
                    }
                    break;
                case 4:
                    if (arrayList != null) {
                        removeOddNumbers(arrayList);
                        System.out.println("Mang sau khi xoa le: ");
                        printArrayList(arrayList);
                    } else {
                        System.out.println("Ban chua nhap mang.");
                    }
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
