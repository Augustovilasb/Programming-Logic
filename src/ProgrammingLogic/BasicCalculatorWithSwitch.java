package ProgrammingLogic;

import java.util.Scanner;

public class BasicCalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type X value: ");
        double x = sc.nextDouble();
        System.out.println("Type Y value: ");
        double y = sc.nextDouble();
        System.out.println("Pick an operation (+,-,*,/): ");
        String pick = sc.next();

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
