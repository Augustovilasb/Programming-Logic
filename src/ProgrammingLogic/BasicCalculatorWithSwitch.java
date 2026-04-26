package ProgrammingLogic;

import java.util.Scanner;

public class BasicCalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Pick an operation + , - , * , / : ");
            System.out.println("Or type '0' to close the program!!!");

            String pick = sc.next();

            if (pick.equals("0")) {
                System.out.println("See u again");
                break;
            }

            System.out.println("Type X value: ");
            double x = sc.nextDouble();

            System.out.println("Type Y value: ");
            double y = sc.nextDouble();

            switch (pick) {
                case "+":
                    System.out.println("The result for " + x + " + " + y + " is: " + (x + y));
                    break;
                case "-":
                    System.out.println("The result for " + x + " - " + y + " is: " + (x - y));
                    break;
                case "*":
                    System.out.println("The result for " + x + " * " + y + " is: " + (x * y));
                    break;
                case "/":
                    System.out.println("The result for " + x + " / " + y + " is: " + (x / y));
                    break;
                default:
                    System.out.println("Invalid Operation");

            }
        }
    }
}
