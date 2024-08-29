
package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of arr: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element of arr:");
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max= arr[0];
        int min= arr[0];
        int sum= 0;
        for (int i=0; i<n; i++) {
            if (arr[i]> max) {
                max= arr[i];
            }
            if (arr[i]< min) {
                min= arr[i];
            }
            sum += arr[i];
        }
        double avg = (double)sum/n;
        Arrays.sort(arr);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("AVG: " + avg);
        System.out.println("Mang sau khi sx tang dan: " + Arrays.toString(arr));
    }
}


