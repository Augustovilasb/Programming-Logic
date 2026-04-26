package ProgrammingLogic;

import java.util.Scanner;

public class PellEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the number: ");
        int inputNumber = sc.nextInt();

        int number = inputNumber;
        int odd = 1;
        int count = 0;

        while (number > 0) {
            if (number - odd < 0) break;
            number = number - odd;
            count++;
            System.out.println(count + " run: " + number + " - " + odd + " = " + count);
            odd += 2;
        }
        System.out.println("Square root of " + inputNumber + " is: " + count);
    }
}