package ProgrammingLogic;

import java.util.Scanner;

public class ConvertBRLToUSD {
    public static void main(String[] args) {

        double usdPrice = 5.7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of BRL would u like to swap? ");
        double brl = sc.nextDouble();

        double finalUsd = brl/usdPrice;
        System.out.printf("The amount USD received %.2f Dollars.%n", + finalUsd);
    }
}