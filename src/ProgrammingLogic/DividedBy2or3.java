package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class DividedBy2or3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the grade of first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input the grade of second number: ");
        int num2 = sc.nextInt();
        System.out.println("Input the grade of third  number ");
        int num3 = sc.nextInt();
        System.out.println("Input the grade of fourth number: ");
        int num4 = sc.nextInt();
        System.out.println("Input the grade of fifth number: ");
        int num5 = sc.nextInt();

        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(num1);
        listNumbers.add(num2);
        listNumbers.add(num3);
        listNumbers.add(num4);
        listNumbers.add(num5);

        for (int i = 0; i < listNumbers.size(); i++) {
            int numero = listNumbers.get(i);
            if (numero % 2 == 0) {
                System.out.println("Divided by 2: " + numero);
            } if (numero % 3 == 0) {
                System.out.println("Divided by 3: " + numero);
            }
        }
    }
}
