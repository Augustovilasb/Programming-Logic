package ProgrammingLogic;

import java.util.Scanner;

public class Calculator {
    public enum Calculation {
        ADD {
            public double calc(double x, double y) {
                return x + y;
            }
        },
        SUB {
            public double calc(double x, double y) {
                return x - y;
            }
        },
        MULTI {
            public double calc(double x, double y) {
                return x * y;
            }
        },
        DIV {
            public double calc(double x, double y) {
                return x / y;
            }
        };

        public abstract double calc(double x, double y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme X: ");
        double x = sc.nextDouble();
        System.out.println("Gimme Y: ");
        double y = sc.nextDouble();
        System.out.println("Choose the operation: (ADD, SUB, MULTI, DIV): ");
        String operation = sc.next();

        Calculation calc2 = Calculation.valueOf(operation);
        System.out.println("Result: " + calc2.calc(x, y));
    }
}
