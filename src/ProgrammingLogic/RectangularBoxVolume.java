package ProgrammingLogic;

import java.util.Scanner;

public class RectangularBoxVolume {
    public static void main(String[] args) {

        // V = C . L . A

        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme the length: ");
        double length = sc.nextDouble();
        System.out.println("Gimme the width: ");
        double width = sc.nextDouble();
        System.out.println("Gimme the height : ");
        double height = sc.nextDouble();

        double volume = (length*width*height);

        System.out.printf("The Box volume is:  %.2f cm³%n", volume);

    }
}
