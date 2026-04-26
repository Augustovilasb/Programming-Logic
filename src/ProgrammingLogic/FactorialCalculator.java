package ProgrammingLogic;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme 5 integer numbers: ");
        int numberInput = sc.nextInt();

        System.out.println("----");
        System.out.println("Result:");
        System.out.println("----");

        // Formula Factorial
        // n = 10;
        // n! = (n) * (n-1) * (n-2) * (n-3) * (n-4) * (n-5) * (n-6) * (n-7) * (n-8) * (n-9);

        // using fori
        long factorial = 1;

        for (int i = numberInput; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("----");


//        // using while
//        long factorial2 = 1;
//        long j = 1;
//
//        while (j <= numberInput) {
//            factorial2 *= j;
//            j++;
//        }
//        System.out.println(factorial2);


    }
}