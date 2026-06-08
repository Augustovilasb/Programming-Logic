package ProgrammingLogic.RockPaperScissors.domain;

public class Service {

    public static void whoWin(Option player, Option computer) {
        if (player == computer) {
            System.out.println("EMPATE");
        } else if (player.win() == computer) {
            System.out.println("PLAYER WIN");
        } else {
            System.out.println("COMPUTER WIN");
        }
    }
}
