package ProgrammingLogic;

import java.util.Scanner;

public class SalaryAdjustment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the Salary Base: ");
        double sb = sc.nextDouble();
        System.out.println("Gimme the Adjustment Percentage : ");
        double ap = sc.nextDouble();

        double ns = (sb + ((sb * ap)/100));
        System.out.printf("Your new Salary is: %.2f Euros%n", ns);

    }
}
