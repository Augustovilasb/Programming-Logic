import java.util.Scanner;

public class CashCount {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the amount: ");
        double cash = sc.nextDouble();

        int[] changes = {25, 10, 5, 1};
        int qntt = 0;
        int total = 0;

        for (int change : changes) {
            qntt = (int) cash / change;
            total += qntt;
            cash = cash % change;
        }

            System.out.println("Change owed: " + qntt + " cents.");
            System.out.println("Coins: " + total);

    }
}
