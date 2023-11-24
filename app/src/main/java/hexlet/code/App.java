package hexlet.code;

import hexlet.code.games.Calculator;

import hexlet.code.games.Even;

import hexlet.code.games.GCD;

import hexlet.code.games.Progression;

import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int GREETINGS = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALCULATOR_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet"
                + "\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case GREETINGS:
                Cli.greetings();
                break;
            case EVEN_GAME:
                Even.gameEven();
                break;
            case CALCULATOR_GAME:
                Calculator.gameCalculator();
                break;
            case GCD_GAME:
                GCD.gameGCD();
                break;
            case PROGRESSION_GAME:
                Progression.gameProgression();
                break;
            case PRIME_GAME:
                Prime.gamePrime();
                break;
            default:
                throw new Error("you must specify the game number. From 0 to 6");
        }

    }
}
