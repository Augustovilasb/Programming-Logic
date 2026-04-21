package ProgrammingLogic;

public class Sum1To500 {
        public static void main(String[] args) {

                int total = 0;

            for (int i = 1; i <= 500; i++) {
                total += i;
            }
                System.out.println("The sum of 1 to 500 is: " + total);
        }
    }