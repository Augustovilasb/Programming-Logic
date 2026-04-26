package ProgrammingLogic;

import java.util.Scanner;

public class PellEquationWithMethod {

    public static int pellSquareRoot(int n) {

        int number = n;
        int odd = 1;
        int count = 0;

        while (number > 0) {
            if (number - odd < 0) break;
            number = number - odd;
            count++;
            System.out.println(count + " run: " + number + " - " + odd + " = " + count);
            odd += 2;
        }
        return count;
    }

        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Gimme the number: ");
            int inputNumber = sc.nextInt();

            int square = pellSquareRoot(inputNumber);
            int remainder = inputNumber - (square*square);
            int value = pellSquareRoot(remainder*100)/10;

            System.out.println("Square " + inputNumber + " = " + square + "." + value);

        }
    }