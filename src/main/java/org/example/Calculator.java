package org.example;

public class Calculator {

    public static int add(int num1, int num2) {
        //System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        return num1 + num2;
    }


    public static int subtract(int num1, int num2) {
        // System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        return (num1 - num2);
    }


    public static int multiply(int num1, int num2) {
        //System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        return (num1 * num2);
    }


    public static int division(int num1, int num2) throws ArithmeticException {
        // System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        return num1 / num2;
    }
}
