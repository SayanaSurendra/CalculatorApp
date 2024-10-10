package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner in=new Scanner(System.in);
        // boolean isCalculate= true , allows user to continue the program
        boolean isCalculate = true;
        while (isCalculate) {
            int operator= printOpertorChoice(in);
            //to perform advanced addition and subtraction
            if (operator==5 ||operator ==6){
                performCalculation(operator,num1,num2);
            }
            // to perform basic calculation
            else{
                System.out.println("Enter 2 numbers:");
                try {
                    num1 = in.nextInt();
                    num2 = in.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Input is not an Integer");
                } catch (Exception e) {
                    System.out.println("Exception:" + e.getMessage());
                }
                performCalculation(operator, num1, num2);
            }

            System.out.println("Enter  0 to Exit the program or 1 to continue");
            int option = in.nextInt();
            if (option == 0) {
                System.out.println("Program Exited");
                isCalculate = false;
            }

        }
    }


    public static int printOpertorChoice( Scanner in) {
        System.out.println("Enter operator choice: 1.Add 2.Subtract 3.Multiplication 4.Division 5.Advanced Addition 6.Advanced Subtract");
        int op = in.nextInt();
        return op;
    }


    private static void performCalculation(int operator,int num1,int num2) {
        switch (operator) {
            case 1:
                System.out.println(Calculator.add(num1, num2));
                break;

            case 2:
                System.out.println(Calculator.subtract(num1, num2));
                break;

            case 3:
                System.out.println(Calculator.multiply(num1, num2));
                break;

            case 4:
                System.out.println(Calculator.division(num1, num2));
                break;

            case 5:
                System.out.println(Calculator.advancedAddition());
                break;

            case 6:
                System.out.println(Calculator.advancedSubtract());
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }


}






