package week11.lab.lab2;

public class Calculator {
    private String name;


    public Calculator(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    double add(double n1, double n2) {
        return n1+n2;
    }
    double subtract(double n1, double n2) {
        return n1-n2;
    }
    double multiply(double n1, double n2) {
        return n1*n2;
    }
    double divide(double n1, double n2) {
        return n1/n2;
    }
}