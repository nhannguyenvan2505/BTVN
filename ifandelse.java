/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;
import java.util.Scanner;
public class ifandelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x>0) {
            System.out.println("Positive");
        } else if (x<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
