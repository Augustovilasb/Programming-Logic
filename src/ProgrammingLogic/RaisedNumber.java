package ProgrammingLogic;

import java.util.Scanner;

public class RaisedNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the num: ");
        double num = sc.nextDouble();

        double square = Math.pow(num,2);
        System.out.printf("Square: %.2f%n ", square);
        double cube = Math.pow(num,3);
        System.out.printf("Cube: %.2f%n ",cube);
        double ten = Math.pow(num,10);
        System.out.printf("Ten: %.2f%n ",ten);

        double sum = square + cube + ten;
        System.out.printf("Sum of square, cube and ten: %.2f%n ",sum);

    }
}
