package hexlet.code;

import hexlet.code.games.Calculator;

import hexlet.code.games.Even;

import hexlet.code.games.GCD;

import hexlet.code.games.Progression;

import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    static final int GREETINGS = 1;
    static final int EVEN_GAME = 2;
    static final int CALCULATOR_GAME = 3;
    static final int GCD_GAME = 4;
    static final int PROGRESSION_GAME = 5;
    static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet"
                + "\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 0) {
            return;
        }

        switch (gameNumber) {
            case GREETINGS:
                Cli.getUserName();
                break;
            case EVEN_GAME:
                Even.question();
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
                break;
        }

    }
}
