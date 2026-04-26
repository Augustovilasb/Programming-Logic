package ProgrammingLogic;

import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the number: ");
        int number = sc.nextInt();

        System.out.println("The table of " + number + " is: ");

        for (int i = 1; i <= 10; i++) {
            int calc = number * i;
            System.out.println(number + " * " + i + " = " + calc);
        }
    }
}
