package ProgrammingLogic;

import java.util.Scanner;

public class MultiplyBy2AndCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme a fucking number: ");
        int input = sc.nextInt();

        int calc = input * 2;

        if (calc >= 30) {
            System.out.println(calc);
        } else {
            System.out.println("Inappropriate Value!");
        }
    }
}
