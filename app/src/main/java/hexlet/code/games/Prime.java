package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static final int UPPER_LIMIT = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    public static void gamePrime() {
        String [][] arrayCorrectAnswer = new String[3][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            Random random = new Random();
            int randomNumber = random.nextInt(UPPER_LIMIT);

            arrayCorrectAnswer[item][0] = String.valueOf(randomNumber);
            arrayCorrectAnswer[item][1] = getCorrectAnswer(randomNumber);
            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer);
    }

    public static String getCorrectAnswer(int number) {
        String correctAnswer = "no";
        if (number == 1 || number == 0) {
            correctAnswer = "no";
        }
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                break;
            } else {
                correctAnswer = "yes";
            }
        }
    return correctAnswer;
    }
}
