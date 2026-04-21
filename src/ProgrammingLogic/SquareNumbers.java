package ProgrammingLogic;

public class SquareNumbers {
    public static void main(String[] args) {

        for (int i = 15; i <= 200; i++) {

            // Normal method
            double square = i * i;
            System.out.println("The square of " + i + " is: " + square);

            // Math.pow method
            System.out.println("The square of " + i + " is: " + Math.pow(i,2));
        }

    }
}