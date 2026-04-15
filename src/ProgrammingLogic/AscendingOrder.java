package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value number1: ");
        int valueN1 = sc.nextInt();
        System.out.println("Enter the value number2: ");
        int valueN2 = sc.nextInt();
        System.out.println("Enter the value number3: ");
        int valueN3 = sc.nextInt();

        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(valueN1);
        listNumber.add(valueN2);
        listNumber.add(valueN3);

        // I did create 3 methods to print the numbers
        // ArrayList with Collections.sort
        // BubbleSort
        // & a normal IF condition

        //Collections method to print the arraylist
        Collections.sort(listNumber);
        System.out.println(listNumber);

        // bubble SORT PRINT
        bubbleSort(listNumber);
        for (int num : listNumber) {
            System.out.println(num);
        }

        // IF METhod
        if (valueN1 <= valueN2 && valueN1 <= valueN3) {
            System.out.println(valueN1);
        }
        if (valueN2 <= valueN1 && valueN2 <= valueN3) {
            System.out.println(valueN2);
        }
        if (valueN3 <= valueN1 && valueN3 <= valueN2) {
            System.out.println(valueN3);
        }

        if ((valueN1 > valueN2 && valueN1 < valueN3) || (valueN1 > valueN3 && valueN1 < valueN2)) {
            System.out.println(valueN1);
        }
        if ((valueN2 > valueN1 && valueN2 < valueN3) || (valueN2 > valueN3 && valueN2 < valueN1)) {
            System.out.println(valueN2);
        }
        if (((valueN3 > valueN1 && valueN3 < valueN2) || (valueN3 > valueN2 && valueN3 < valueN1))) {
            System.out.println(valueN3);
        }

        if (valueN1 >= valueN2 && valueN1 >= valueN3) {
            System.out.println(valueN1);
        }
        if (valueN2 >= valueN1 && valueN2 >= valueN3) {
            System.out.println(valueN2);
        }
        if (valueN3 >= valueN1 && valueN3 >= valueN2) {
            System.out.println(valueN3);
        }
    }


    //BUBBLE SORT METHOD
    public static void bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int swaps = 0;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j) + 1) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swaps = 1;
                }
            }
            if (swaps == 0) break;
        }
    }
}
