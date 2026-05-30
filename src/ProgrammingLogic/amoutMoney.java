package ProgrammingLogic;

import java.util.Scanner;

public class amoutMoney {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        int value = sc.nextInt();
        System.out.println("-----------------");

    int hundred = 0;
    int fifty = 0;
    int twenty = 0;
    int tem = 0;
    int five = 0;
    int two = 0;
    int one = 0;

    int rest100 = 0;
    int rest50 = 0;
    int rest20 = 0;
    int rest10 = 0;
    int rest5 = 0;
    int rest2 = 0;
    int rest1 = 0;

    rest100 = value % 100;

    if (value >= 100) {
        int firstResult = value / 100;
        hundred = firstResult;
        System.out.println("We used notes of 100 " + hundred + " times.");
        System.out.println("And i have left " + rest100 + " Reais.");
        System.out.println("-----------------");

    }

    rest50 += rest100 % 50;

    if (rest100 >= 50) {
        int secondResult = rest100 / 50;
        fifty = secondResult;
        System.out.println("We used notes of 50 " + fifty + " times.");
        System.out.println("And i have left " + rest50 + " Reais.");
        System.out.println("-----------------");

    }

    rest20 += rest50 % 20;

    if (rest50 >= 20) {
        int thirdResult = rest50 / 20;
        twenty = thirdResult;
        System.out.println("We used notes of 20 " + twenty + " times.");
        System.out.println("And i have left " + rest20 + " Reais.");
        System.out.println("-----------------");

    }

    rest10 += rest20 % 10;

    if (rest20 >= 10) {
        int fourfhResult = rest20 / 10;
        tem = fourfhResult;
        System.out.println("We used notes of 10 " + tem + " times.");
        System.out.println("And i have left " + rest10 + " Reais.");
        System.out.println("-----------------");

    }

    rest5 += rest10 % 5;

    if (rest10 >= 5) {
        int fifthResult = rest10 / 5;
        five = fifthResult;
        System.out.println("We used notes of 5 " + five + " times.");
        System.out.println("And i have left " + rest5 + " Reais.");
        System.out.println("-----------------");

    }

    rest2 += rest5 % 2;

    if (rest5 >= 2) {
        int sixResult = rest5 / 2;
        two = sixResult;
        System.out.println("We used notes of 2 " + two + " times.");
        System.out.println("And i have left " + rest2 + " Reais.");
        System.out.println("-----------------");

    }

    rest1 += rest2 % 1;

    if (rest2 >= 1) {
        int seventhResult = rest2 / 1;
        one = seventhResult;
        System.out.println("We used notes of 1 " + one + " times.");
        System.out.println("And i have left " + rest1 + " Reais.");
        System.out.println("-----------------");
        }
    }
}
