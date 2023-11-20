package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUNDS = 3;

    public static void startGame(String[][] questionsAndAnswers, String question) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerUser = new Scanner(System.in);
        String userName = scannerUser.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(question);
        int quitTheGame = 0;
        while (quitTheGame < NUMBER_OF_ROUNDS) {
            System.out.println("Question: " + questionsAndAnswers[quitTheGame][0]);
            Scanner scannerAnswer = new Scanner(System.in);

            System.out.print("Your answer: ");
            String userResponse = scannerAnswer.next();
            String response = questionsAndAnswers[quitTheGame][1];

            if (response.equals(userResponse)) {
                System.out.println("Correct!");
                quitTheGame += 1;
            } else {
                System.out.println("'" + userResponse + "' is wrong answer ;(. Correct answer was '"
                        + response + "'.\nLet's try again, " + userName + "!");
                break;
            }

            if (quitTheGame == NUMBER_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
        }
    }
}
