package ProgrammingLogic;

import java.util.Scanner;

public class condition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " EVEN Number");
            }
            if (i % 2 != 0) {
                System.out.println(i + " ODD Number");
            }
            if ((i % 2 == 0) && (i % 5 == 0)) {
                System.out.println(i + " Is EVEN" + " Its a ODD && multiply by 5.");
            }
            if ((i % 2 != 0) && (i % 5 == 0)) {
                System.out.println(i + " Is ODD" + " Its a ODD && multiply by 5.");
            } 
        }
    }
}
