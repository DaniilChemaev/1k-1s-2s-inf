package models;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }
}
