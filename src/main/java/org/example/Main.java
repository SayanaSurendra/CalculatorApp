package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // boolean isCalculate= true , allows user to continue the program
        boolean isCalculate = true;
        while (isCalculate) {
            System.out.println("Enter first number:");
            int num1=in.nextInt();
            int num2=in.nextInt();
            System.out.println("Enter operator choice: 1.Add 2.Subtract 3.Multiplication 4.Division");
            int operator = in.nextInt();
            switch (operator) {
                case 1:
                    System.out.println(Calculator.add(num1, num2));
                    break;

                case 2:
                    System.out.println(Calculator.subtract(num1,num2));
                    break;

                case 3:
                    System.out.println (Calculator.multiply(num1, num2));
                    break;

                case 4:
                    System.out.println( Calculator.division(num1, num2));
                    break;

                default:
                    System.out.println("Invalid Operator");
                    break;
            }
            System.out.println("Enter  0 to Exit the program or 1 to continue");
            int option = in.nextInt();
            if (option == 0) {
                System.out.println("Program Exited");
                isCalculate = false;
            }


        }
    }
}






