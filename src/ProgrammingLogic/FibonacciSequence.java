package ProgrammingLogic;

public class FibonacciSequence {
    public static void main(String[] args) {

        int n = 15, first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(first + " + " + second + " = " + (first + second));
            int next = first + second;
            first = second;
            second = next;

        }
    }
}
