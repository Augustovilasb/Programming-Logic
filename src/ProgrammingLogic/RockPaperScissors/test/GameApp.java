package ProgrammingLogic.RockPaperScissors.test;

import ProgrammingLogic.RockPaperScissors.domain.Option;
import ProgrammingLogic.RockPaperScissors.domain.Service;

import java.util.Random;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {

        for (int option = 0; option < Option.values().length; option++) {
            System.out.println(option + " - " + Option.values()[option]);
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = Integer.parseInt(input);
        Option chosen = Option.values()[index];

        int rndIndex = new Random().nextInt(Option.values().length);
        Option cpChosen = Option.values()[rndIndex];

        System.out.println("Você escolheu: " + chosen);
        System.out.println("PC escolheu: " + cpChosen);

        Service.whoWin(chosen, cpChosen);
    }
}
