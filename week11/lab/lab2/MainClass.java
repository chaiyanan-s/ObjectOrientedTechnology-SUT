package week11.lab.lab2;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");
        System.out.println(calc.getName());
        System.out.print("Enter an equation: ");
        String str = sc.nextLine();
        String[] split;
        split = str.split(" ");
        double sum = 0;
        for(int i = 1; i < split.length; i+=2) {
            double n1 = Double.parseDouble(split[i-1]);
            double n2 = Double.parseDouble(split[i+1]);
            if(sum == 0) { 
                if(split[i].equals("+")) {
                    sum += calc.add(n1, n2);
                } else if (split[i].equals("-")) {
                    sum += calc.subtract(n1, n2);
                } else if (split[i].equals("*")) {
                    sum += calc.multiply(n1, n2);
                } else if (split[i].equals("/")) {
                    sum += calc.divide(n1, n2);
                }
            } else {
                if(split[i].equals("+")) {
                    sum += calc.add(sum, n2);
                } else if (split[i].equals("-")) {
                    sum += calc.subtract(sum, n2);
                } else if (split[i].equals("*")) {
                    sum += calc.multiply(sum, n2);
                } else if (split[i].equals("/")) {
                    sum += calc.divide(sum, n2);
                }

            }
        }
        System.out.print(str + " = ");
        System.out.println(sum);
    }
}