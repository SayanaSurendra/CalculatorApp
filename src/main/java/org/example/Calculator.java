package org.example;

import java.util.Scanner;

public class Calculator {

    public static int add(int num1, int num2) {
        //System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        return num1 +num2;
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

    public static  int advancedAddition() {
        Scanner in=new Scanner(System.in);
        int  sum=0;

        while(true){
            System.out.println("Enter numbers(or enter + to calculate)");
            String input= in.nextLine();
            if(input.equals("+")){
                break;
            }
            int num1= Integer.parseInt(input);
            sum=Calculator.add(num1,sum);

        }
        return  sum;

    }

    public static  int advancedSubtract(){
        Scanner in=new Scanner(System.in);
        int  diff=0, num1=0;
        while(true){
            System.out.println("Enter numbers(or enter - to calculate)");
            String input= in.nextLine();
            if(input.equals("-")){
                break;
            }
            if(diff == 0) {
                num1 = Integer.parseInt(input);
            }else{
                num1=diff;
                diff=Integer.parseInt(input);
            }
            diff=Calculator.subtract(num1,diff);

        }
        return  diff;
    }
}

 /*if(input.contains("+")) {
String  arr[]=input.split("\\+");
        int sum=0,i;
            for( i=0;i<arr.length;i++) {
        if(i==0){
sum=0;
        }

int num1= Integer.parseInt(arr[i]);
sum=Calculator.add(num1,sum);

            }
                    System.out.println(sum);
        }*/