package ProgrammingLogic;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the number: ");
        int numberInput = sc.nextInt();

        System.out.println(" --- MULTIPLICATION TABLE --- ");
        for (int i = 1; i < 11; i++) {
            int calc = numberInput * i;
            System.out.println(numberInput + " * " + i + ": " + calc);
        }

    }
}