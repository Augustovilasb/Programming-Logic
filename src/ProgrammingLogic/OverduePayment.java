package ProgrammingLogic;

import java.util.Scanner;

public class OverduePayment {
    public static void main(String[] args) {

        double tax = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value overdue payment: ");
        double value = sc.nextDouble();
        System.out.println("How long are u late?");
        int monthsLate = sc.nextInt();

        double priceAfterTax = (value + ((tax * value / 100) * monthsLate));
        System.out.println(priceAfterTax);

    }
}
