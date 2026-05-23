package ProgrammingLogic;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {

        Random rnd = new Random();
        int secretNumber = rnd.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100: ");

        int attenpt = 0;
        boolean right = false;

        for (int i = 1; i <= 7; i++) {
            int numberInput = sc.nextInt();
            attenpt++;
            if (numberInput < secretNumber) {
                System.out.println("too low, go higher " + numberInput);
            } else if (numberInput > secretNumber) {
                System.out.println("too high, go lower " + numberInput);
            } else {
                System.out.println("U got it at " + attenpt + " attenpt, the number is: " + secretNumber);
                right = true;
                break;
            }
        }
        if (!right) {
            System.out.println("Sorry but u didint get it, the secret number is: " + secretNumber);
        }
    }
}