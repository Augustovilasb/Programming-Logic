package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersRange {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please enter the lower number:");
        int lowerNumber = sc.nextInt();
        System.out.println("Please enter the higher' number:");
        int higherNumber = sc.nextInt();
        System.out.println(" ");
        
        ArrayList<Integer> allNumbers = new ArrayList<>();
        ArrayList<Integer> numNonPrimes = new ArrayList<>();
        ArrayList<Integer> numPrimes = new ArrayList<>();
        
        for (int i = lowerNumber; i <= higherNumber; i++) {
            boolean isPrime = true;
                        
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {   
                    isPrime = false;
                }
            }
            
            if (!isPrime) {
                allNumbers.add(i);
                numNonPrimes.add(i);                
            } else {
                allNumbers.add(i);
                numPrimes.add(i);
        }
    }
    
        System.out.println("Lowest number in the window: " + lowerNumber);
        System.out.println("Higher number in the window: " + higherNumber);
        System.out.println(" ");
        System.out.println("Full range numbers");
        System.out.println(allNumbers);
        System.out.println(" ");
        System.out.println("Non prime numbers:");
        System.out.println(numNonPrimes);
        System.out.println(" ");
        System.out.println("Prime numbers:");
        System.out.println(numPrimes);
        System.out.println(" ");

    }
}