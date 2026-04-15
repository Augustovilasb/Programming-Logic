package ProgrammingLogic;

import java.util.Scanner;

public class ConvertUSDToBRL {
    public static void main(String[] args) {

        double brlPrice = 5.7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of U$D would u like to swap? ");
        double usd = sc.nextDouble();

        double finalBrl = usd*brlPrice;
        System.out.printf("The amount BRL received %.2f Reais.%n", + finalBrl);
    }
}
