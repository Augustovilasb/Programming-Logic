package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class CPFValidator {
    public static void main(String[] args) {

        ArrayList<Integer> cpf = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the full CPF digits with out any '.' and '-'. Only numbers: ");
        String cpfString = sc.next();

        for (int i = 0; i < 9; i++) {
            cpf.add(Character.getNumericValue(cpfString.charAt(i)));
        }

        int dv1 = calculationFirstDigit(cpf);
        cpf.add(dv1);
        int dv2 = calculationSecondDigit(cpf);

        System.out.println("DV1: " + dv1);
        System.out.println("DV2: " + dv2);

        cpf.add(dv2);

        System.out.println(printCpf(cpf));

    }

    public static int calculationFirstDigit(ArrayList<Integer> cpf) {

        int sum = 0;
        int multiply = 10;

        for (int i = 0; i < 9; i++) {
            sum += cpf.get(i) * multiply;
            multiply--;
        }

        int rest = sum % 11;
        int result = 11 - rest;

        if (result > 9) {
            return 0;
        } else {
            return result;
        }

    }

    public static int calculationSecondDigit(ArrayList<Integer> cpf) {

        int sum = 0;
        int multiply = 11;

        for (int i = 0; i < 10; i++) {
            sum += cpf.get(i) * multiply;
            multiply--;
        }

        int rest = sum % 11;
        int result = 11 - rest;

        if (result > 9) {
            return 0;
        } else {
            return result;
        }
    }

    public static String printCpf(ArrayList<Integer> cpf) {
        return String.format("The final CPF is: %d%d%d.%d%d%d.%d%d%d-%d%d",
                cpf.get(0), cpf.get(1), cpf.get(2),
                cpf.get(3), cpf.get(4), cpf.get(5),
                cpf.get(6), cpf.get(7), cpf.get(8),
                cpf.get(9), cpf.get(10));
    }
}
