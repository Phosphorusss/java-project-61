package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startGame(String[][] correctAnswer, String question) {
        String userName = Cli.getUserName();
        System.out.println(question);
        int quitTheGame = 0;
        while (quitTheGame < NUMBER_OF_ROUNDS) {
            System.out.println("Question: " + correctAnswer[quitTheGame][0]);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userResponse = scanner.next();

        String response = correctAnswer[quitTheGame][1];
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
