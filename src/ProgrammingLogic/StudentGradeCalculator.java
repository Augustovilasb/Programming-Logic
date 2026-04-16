package ProgrammingLogic;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the grade of first test: ");
        double grade1 = sc.nextDouble();
        System.out.println("Input the grade of second test: ");
        double grade2 = sc.nextDouble();
        System.out.println("Input the grade of third test: ");
        double grade3 = sc.nextDouble();
        System.out.println("Input the grade of fourth test: ");
        double grade4 = sc.nextDouble();

        double avg = ((grade1 + grade2 + grade3 + grade4)/4);
        System.out.println("The avg of these 4 tests is: " + avg + ".");

        if (avg < 50) {
            System.out.println("DENIED!!");
        } else if (Double.compare(avg, 50) == 0) {
            System.out.println("LEARNER HAS TO ATTEND A ONE MORE TEST.");
        } else {
            System.out.println("APPROVED!!");
        }
        }
}
