package ProgrammingLogic;

import java.util.Scanner;

public class WeekOrWeekend {

    public enum menuWeek {

        SEGUNDA {
            public String whichDay() {
                return "WEEKDAY";
                }
        },
        TERCA {
            public String whichDay() {
                return "WEEKDAY";
            }
        },
        QUARTA {
            public String whichDay() {
                return "WEEKDAY";
            }
        },
        QUINTA {
            public String whichDay() {
                return "WEEKDAY";
            }
        },
        SEXTA {
            public String whichDay() {
                return "WEEKDAY";
            }
        },
        SABADO {
            public String whichDay() {
                return "WEEKEND";
            }
        },
        DOMINGO {
            public String whichDay() {
                return "WEEKEND";
            }
        };

        public abstract String whichDay();

    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Choose a day: ");
        System.out.println("SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SAB OU DOMINGO");
        String input = sc.nextLine();

        System.out.println(menuWeek.valueOf(input).whichDay());


    }
}
