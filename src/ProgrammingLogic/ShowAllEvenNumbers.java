package ProgrammingLogic;

public class ShowAllEvenNumbers {
    public static void main(String[] args) {

        // A WAY TO CHECK IF A NUMBER IS EVEN OR ODD;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // A SIMPLE AND EASY WAY TO CHECK IF A NUMBER IS EVEN OF ODD;
        for (int i = 0; i <= 100; i += 2) {
        System.out.println(i);
        }
    }
}