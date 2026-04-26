package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class ImprovingTheFactorialCalculatorWithVetor {
    public static void main(String[] args) {

        System.out.println("----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme 5 integer numbers: ");
        int numberInput = sc.nextInt();
        int numberInput2 = sc.nextInt();
        int numberInput3 = sc.nextInt();
        int numberInput4 = sc.nextInt();
        int numberInput5 = sc.nextInt();

        System.out.println("----");

        //Creating the Vetor
        long[] inputList = new long[5];
        inputList[0] = numberInput;
        inputList[1] = numberInput2;
        inputList[2] = numberInput3;
        inputList[3] = numberInput4;
        inputList[4] = numberInput5;

        long factorial = 1;

        // First loop to read the vetor inputList
        for (int j = 0; j < 5; j++) {
            factorial = 1;
            long number = inputList[j];
            // Second loop to calculate the Factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
        System.out.println("----");
    }
}
