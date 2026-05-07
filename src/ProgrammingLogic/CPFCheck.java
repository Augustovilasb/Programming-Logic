package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class CPFCheck {
    public static void main(String[] args) {

        ArrayList<Integer> cpf = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input yours first 9 CPF digits: ");
        String cpfString = sc.nextLine();

            for (int i = 0; i < 9; i++) {
                cpf.add(Character.getNumericValue(cpfString.charAt(i)));
            }

            int digit1 = checkFirstDigit(cpf);
            cpf.add(digit1);
            int digit2 = checkSecondDigit(cpf);

        System.out.println("Digit 1 = " + digit1);
        System.out.println("Digit 2 = " + digit2);

        cpf.add(digit2);

        System.out.println("This is the final CPF: " + cpf.get(0) + cpf.get(1) + cpf.get(2) + "." + cpf.get(3) + cpf.get(4) + cpf.get(5) + "." + cpf.get(6) + cpf.get(7) + cpf.get(8) + "-" + digit1 + digit2);
        }

    public static int checkFirstDigit(ArrayList<Integer> cpf) {

        int sum = 0;
        int multply = 10;

        for (int i = 0; i < 9; i++) {
        sum += cpf.get(i) * multply;
        multply--;
        }

        int rest = sum % 11;
        int result = 11 - rest;

        if (result > 9) {
            return 0;
        } else {
            return result;
        }
    }

    public static int checkSecondDigit(ArrayList<Integer> cpf) {

        int sum = 0;
        int multply = 11;

        for (int i = 0; i < 10; i++) {
            sum += cpf.get(i) * multply;
            multply--;
        }

        int rest = sum % 11;
        int result = 11 - rest;

        if (result > 9) {
            return 0;
        } else {
            return result;
        }
    }

}