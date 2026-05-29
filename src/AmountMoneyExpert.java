import java.util.Scanner;

public class AmountMoneyExpert {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the value:");
        double value = sc.nextDouble();

        int[] notes = {100,50,20,10,5,2,1};
        
        for (int note : notes) {
            double qntt = (int) value / note;
            value = value % note;
            System.out.println("Utilizamos " + qntt + " notas de " + note);
        }

    }
    
}
