package ProgrammingLogic;

import java.util.Scanner;

public class PredecessorSuccessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value number: ");
        int valueN = sc.nextInt();

        int successor = valueN + 1;
        int predecessor = valueN -1;

        System.out.println(successor);
        System.out.println(predecessor);

    }
}