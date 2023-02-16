package week11.lab.lab1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int[] arr1 = {20, 40, 45, 60, 75, 90};
        int[] arr2 = {1, 2, 0, 5, 3};

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            num2 = sc.nextInt();
            try {
                System.out.println(arr1[num1] + " / " + arr2[num2] + " = " + arr1[num1]/arr2[num2]);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("An exception occurred: " + ex);
                System.out.println("The entered number exceeds the array size.");
            }
            catch(ArithmeticException ex) {
                System.out.println("An exception occurred: " + ex);
                System.out.println("Division by zero is not allowed.");
            }
        }
        catch(InputMismatchException ex) {
            System.out.println("An exception occurred: InputMismatchException");
            System.out.println("The index must be an integer.");

        }
        sc.close();
    }
}