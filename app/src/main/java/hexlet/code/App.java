package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class App {
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
            case EVEN_GAME:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Even.question();
                break;
            case CALCULATOR_GAME:
                System.out.println("What is the result of the expression?");
                Calculator.gameCalculator();
                break;
            case GCD_GAME:
                System.out.println("Find the greatest common divisor of given numbers.");
                GCD.gameGCD();
                break;
            case PROGRESSION_GAME:
                System.out.println("What number is missing in the progression?");
                Progression.gameProgression();
                break;
            case PRIME_GAME:
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Prime.gamePrime();
                break;
            default:
                break;
        }

    }
}
