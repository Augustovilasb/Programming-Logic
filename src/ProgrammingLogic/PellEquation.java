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
        System.out.println("The remainder is: " + number);
        System.out.println("--------------");
        System.out.println(" ");

        System.out.println("Pell Equation with the remainder of Square of " + inputNumber);
        System.out.println("Remainder is: " + number);
        int newNumber = number * 100;
        System.out.println(number + " * 100 " + newNumber);
        System.out.println("--------------");
        System.out.println(" ");

        int number2 = newNumber;
        int odd2 = 1;
        int count2 = 0;

        while (number2 > 0) {
            if (number2 - odd2 < 0) break;
            number2 = number2 - odd2;
            count2++;
            System.out.println(count2 + " run: " + number2 + " - " + odd2 + " = " + count2);
            odd2 += 2;
        }
        System.out.println("√" + inputNumber + " ≈ " + count + "." + count2 / 10);
    }
}