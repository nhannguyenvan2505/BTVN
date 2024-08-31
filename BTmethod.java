package BT;

import java.util.Scanner;
import java.util.ArrayList;

public class BTmethod {

    public static float[] importData(float[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextFloat();
        }
        return arr;
    }

    public static void printData(float[] arrays) {
        System.out.print("In mang: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arr) {
        if (arr.length < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return Float.NaN;
        }
        float max1 = Float.NEGATIVE_INFINITY, max2 = Float.NEGATIVE_INFINITY;
        for (float num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    public static void deleteOddNumber(float[] arr) {
        ArrayList<Float> list = new ArrayList<>();
        for (float num : arr) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        arr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        printData(arr);
    }

    public static void main(String[] args) {
        float[] arr = null;
        arr = importData(arr);
        printData(arr);
        float max2 = findMax2(arr);
        System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        System.out.println("Mang sau khi xoa phan tu le:");
        deleteOddNumber(arr);
    }
}
