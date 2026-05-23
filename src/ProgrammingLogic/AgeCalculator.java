package ProgrammingLogic;

import java.util.Scanner;

public class AgeCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provite the year when u was born: ");
        int wasBorn = sc.nextInt();
        System.out.println("Please provite the currently year: ");
        int currentlyYear = sc.nextInt();
        int age = 0;
        
        System.out.println(" ");
        for (int i = 0; i <= currentlyYear; i++) {
            age = i - wasBorn;
        }
        System.out.println("So your age now is: " + age);        
        int yearsTo100 = (age - 100) * (-1);
        System.out.println("Y'll reach 100 years in " + yearsTo100);        
        System.out.println("Y'll reach 100 years in: " + (currentlyYear + yearsTo100));
        System.out.println(" "); 
        


    
    }

}
