package ProgrammingLogic;

import java.util.Scanner;

public class condition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i + " - EVEN - multiple of 5");
            } else if (i % 2 != 0 && i % 5 == 0) {
                System.out.println(i + " - ODD - multiple of 5");
            } else if (i % 2 == 0) {
                System.out.println(i + " - EVEN");
            } else {
                System.out.println(i + " - ODD");
            }
        } 
    }
}
