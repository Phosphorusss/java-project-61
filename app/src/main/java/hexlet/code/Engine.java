package hexlet.code;


import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void startGame(String gameNumber, String userName) {

        int numberOfRounds = 3;
        int quitTheGame = 0;
        while (quitTheGame < 3) {
            String correctAnswer = "";
            switch (gameNumber) {
                case "2":
                    correctAnswer = Even.gameEven();
                    break;
                case "3":
                    correctAnswer = Calculator.gameCalculator();
                    break;
                case "4":
                    correctAnswer = GCD.gameGCD();
                    break;
                case "5":
                    correctAnswer = Progression.gameProgression();
                    break;
                case "6":
                    correctAnswer = Prime.gamePrime();
                    break;
                default:
                    correctAnswer = null;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userResponse = scanner.next();

            if (correctAnswer.equals(userResponse)) {
                System.out.println("Correct!");
                quitTheGame += 1;
            } else {
                System.out.println("'" + userResponse + "' is wrong answer ;(. Correct answer was '" +
                        correctAnswer + "'.\nLet's try again, " + userName + "!");
                break;
            }

            if (quitTheGame == numberOfRounds) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
        }
    }
}
