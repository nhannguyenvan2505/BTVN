package BT;
import java.util.Scanner;
public class BTVN23thg8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = keyboard.nextInt();
        System.out.print("Enter secound number: ");
        int b = keyboard.nextInt();
        int Add = a + b;
        int Sub = a - b;
        int Mul = a * b;
        float Div = 0;
        int Cld = 0;
        if (b != 0) {
            Div = (float) a / b;
            Cld = a % b;
        } else {
            System.out.println("cannot be divided by 0.");
        }
        System.out.println("Add result: " + Add);
        System.out.println("Sub result: " + Sub);
        System.out.println("Mul result: " + Mul);
        System.out.println("Div result: " + Div);
        System.out.println("Cld result: " + Cld);
    }
}
