package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestSmallestNumberFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Input the third  number ");
        int num3 = sc.nextInt();
        System.out.println("Input the fourth number: ");
        int num4 = sc.nextInt();
        System.out.println("Input the fifth number: ");
        int num5 = sc.nextInt();

        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(num1);
        listNumber.add(num2);
        listNumber.add(num3);
        listNumber.add(num4);
        listNumber.add(num5);

        // FIRST AND EASY WAY TO SEARCH THE HIGHER AND LOWEST NUMBER
        // USING COLLECTIONS ON ARRAYLIST
        Integer min = Collections.min(listNumber);
        Integer max = Collections.max(listNumber);
        System.out.println(min);
        System.out.println(max);

        // SECOND WAY WITH FOR TO SEARCH THE HIGHER AND LOWEST NUMBER
        double highest = listNumber.get(0);
        double lowest = listNumber.get(0);

        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) > highest) {
                highest = listNumber.get(i);
            }
        }
            System.out.println("Highest number = " + highest);

        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) < lowest) {
                lowest = listNumber.get(i);
            }
        }
            System.out.println("Lowest number = " + lowest);
    }
}
