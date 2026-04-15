package ProgrammingLogic;

import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Gimme the Number2 : ");
        int num2 = sc.nextInt();

        int resultSum = num1 + num2;
        int resultSub = num1 - num2;
        int resultMult = num1 * num2;
        double resultDiv = (double) num1 / num2;

        System.out.println("The result of sum is: " + resultSum);
        System.out.println("The result of sub is: " + resultSub);
        System.out.println("The result of mult is: " +  resultMult);
        System.out.printf("The result of div is: %.2f%n", resultDiv);
    }
}