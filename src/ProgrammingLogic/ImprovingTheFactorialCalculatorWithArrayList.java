package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class ImprovingTheFactorialCalculatorWithArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme 5 integer numbers: ");
        int numberInput = sc.nextInt();
        int numberInput2 = sc.nextInt();
        int numberInput3 = sc.nextInt();
        int numberInput4 = sc.nextInt();
        int numberInput5 = sc.nextInt();

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(numberInput);
        inputList.add(numberInput2);
        inputList.add(numberInput3);
        inputList.add(numberInput4);
        inputList.add(numberInput5);

        long factorial = 1;

        for (int j = 0; j < 5; j++) {
            factorial = 1;
        int number = inputList.get(j);

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        }

        System.out.println("----");

    }
}
