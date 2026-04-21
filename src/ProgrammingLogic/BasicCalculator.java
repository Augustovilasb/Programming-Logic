package ProgrammingLogic;

import java.util.Scanner;

public class BasicCalculator {

        public enum BasicCalc {

            ADD {
                public double calcValues(double x, double y) {
                    return x + y;
                }
            },
            SUB {
                public double calcValues(double x, double y) {
                    return x - y;
                }
            },
            MULTI {
                public double calcValues(double x, double y) {
                    return x * y;
                }
            },
            DIV {
                public double calcValues(double x, double y) {
                    return x / y;
                }
            };
            public abstract double calcValues(double x, double y);
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick an operation: ADD, SUB, MULTI || DIV");
        String pick = sc.next();
        System.out.println("Type X value: ");
        double x = sc.nextDouble();
        System.out.println("Type Y value: ");
        double y = sc.nextDouble();

        BasicCalc resultCalc = BasicCalc.valueOf(pick);
        System.out.println("Result: " + resultCalc.calcValues(x, y));


    }
}