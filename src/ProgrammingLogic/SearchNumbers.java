package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Random;

public class SearchNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 51; i++) {
            int numbersToSearch = random.nextInt(51);
            numbers.add(numbersToSearch);
        }
        int maior = numbers.get(0);
        int menor = numbers.get(0);

        for (int j = 0; j < 51; j++) {
            int atual = numbers.get(j);
            if (atual > maior) {
                maior = atual;
            } if (menor > atual){
                    menor = atual;
            }
        }
            System.out.println("Temos como maior e menor numero? " + maior + " & " + menor);
    }
}
