package ProgrammingLogic;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {

        String login = "augustovilasb@hotmail.com";
        String password = "senha0539wqk*";

        Scanner sc = new Scanner(System.in);

        while (true) {

        System.out.println("Please enter the login: ");
        String inputLogin = sc.nextLine();
        System.out.println("Please enter the password: ");
        String inputPassword = sc.nextLine();

        if (login.equals(inputLogin) && password.equals(inputPassword)) {
            System.out.println("Access available!!");
            break;
        } else {
            System.out.println("Access denied!!");
        }

        }
    }
}
