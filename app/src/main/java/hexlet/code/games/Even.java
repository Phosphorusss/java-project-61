package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final int LOWER_LIMIT = 1;
    private static final int UPPER_LIMIT = 100;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int ARRAY_LENGTH = 3;

    public static void gameEven() {
        String[][] questionsAndAnswers = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            int randomNumber = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);

            questionsAndAnswers[item][0] = String.valueOf(randomNumber);
            questionsAndAnswers[item][1] = isEven(randomNumber) ? "yes" : "no";
            item += 1;
        }
        Engine.startGame(questionsAndAnswers, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
