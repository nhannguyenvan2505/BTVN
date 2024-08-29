package BT;

import java.util.Scanner;

public class NvN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ho va Ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        int namsinh = scanner.nextInt();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhap GPA: ");
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhap que quan: ");
        String quequan = scanner.nextLine();
        System.out.println(name+"-"+namsinh+"-"+age+"-"+gioitinh+"-"+GPA+"-"+quequan);
    }
    
}
