package ProgrammingLogic;

import java.util.Scanner;

public class NumberInsideLimit {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Input the number: ");
            int num = sc.nextInt();

            if ((num >= 1)  && (num <= 9)) {
                System.out.println("Number is inside the limit!");
            } else {
                System.out.println("Number out of bunder!");
            }
        }
    }