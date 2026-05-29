
import java.util.Scanner;

public class amoutMoney {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        int value = sc.nextInt();
        System.out.println("-----------------");
    
    int hundred = 0;
    int fifty = 0;
    int twenty = 0;
    int tem = 0;
    int five = 0;
    int two = 0;
    int one = 0;

    int rest100 = 0;
    int rest50 = 0;
    int rest20 = 0;
    int rest10 = 0;
    int rest5 = 0;
    int rest2 = 0;
    int rest1 = 0;

    rest100 = value % 100;

    // If o input do usuario for maior do que 100, ele calcula a quantidade de notas de 100 utilizadas
    if (value >= 100) {
        // Atribuindo a quantidade de notas de 100 utilizadas na variavel "firstResult"
        int firstResult = value / 100;
        hundred += firstResult;
        // Depois de ver a quantiadade de notas de 100 dentro do valor do input, adiciono o que sobrou na variavel rest100
        System.out.println("We used notes of 100 " + hundred + " times.");
        System.out.println("And i have left " + rest100 + " Reais.");
        System.out.println("-----------------");

        // If o input do usuario for maior do que 50, ele calcula a quantidade de notas de 100 utilizadas
    } 
    
    rest50 += rest100 % 50;
    
    if (rest100 >= 50) {
        // Atribuindo a quantidade de notas de 50 utilizadas na variavel "secondResult"
        int secondResult = rest100 / 50;
        fifty += secondResult;
        System.out.println("We used notes of 50 " + fifty + " times.");
        System.out.println("And i have left " + rest50 + " Reais.");
        System.out.println("-----------------");

        // If o input do usuario for maior do que 20, ele calcula a quantidade de notas de 100 utilizadas
    } 
    
    rest20 += rest50 % 20;
    
    if (rest50 >= 20) {
        // Atribuindo a quantidade de notas de 10 utilizadas na variavel "thirdResult"
        int thirdResult = rest50 / 20;
        twenty += thirdResult;
        System.out.println("We used notes of 20 " + twenty + " times.");
        System.out.println("And i have left " + rest20 + " Reais.");
        System.out.println("-----------------");
        // If o input do usuario for maior do que 10, ele calcula a quantidade de notas de 100 utilizadas

    } 
    
    rest10 += rest20 % 10;
    
    if (rest20 >= 10) {
        // Atribuindo a quantidade de notas de 5 utilizadas na variavel "fourthResut"
        int fourfhResult = rest20 / 10;
        tem += fourfhResult;
        System.out.println("We used notes of 10 " + tem + " times.");
        System.out.println("And i have left " + rest10 + " Reais.");
        System.out.println("-----------------");
        // If o input do usuario for maior do que 5, ele calcula a quantidade de notas de 100 utilizadas

    } 
    
    rest5 += rest10 % 5;
    
    if (rest10 >= 5) {
        // Atribuindo a quantidade de notas de 5 utilizadas na variavel "fifthResult"
        int fifthResult = rest10 / 5;
        five += fifthResult;
        System.out.println("We used notes of 5 " + five + " times.");
        System.out.println("And i have left " + rest5 + " Reais.");
        System.out.println("-----------------");
        // If o input do usuario for maior do que 2, ele calcula a quantidade de notas de 100 utilizadas

    } 
    
    rest2 += rest5 % 2;
    
    if (rest5 >= 2) {
        // Atribuindo a quantidade de notas de 2 utilizadas na variavel "sixthResult"
        int sixResult = rest5 / 2;
        two += sixResult;
        System.out.println("We used notes of 2 " + two + " times.");
        System.out.println("And i have left " + rest2 + " Reais.");
        System.out.println("-----------------");
        // If o input do usuario for maior do que 1, ele calcula a quantidade de notas de 100 utilizadas

    } 

    rest1 += rest2 % 1;

    if (rest2 >= 1) {
        // Atribuindo a quantidade de notas de 1 utilizadas na variavel "seventhResult"
        int seventhResult = rest2 / 1;
        one += seventhResult;
        System.out.println("We used notes of 1 " + one + " times.");
        System.out.println("And i have left " + rest1 + " Reais.");
        System.out.println("-----------------");
        }
    }
}