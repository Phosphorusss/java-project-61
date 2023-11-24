package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {
    private static final int LOWER_LIMIT = 1;
    private static final int UPPER_LIMIT = 100;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int ARRAY_LENGTH = 3;

    public static void gameGCD() {
        String[][] questionsAndAnswers = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            int randomNumberOne = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int randomNumberTwo = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);

            questionsAndAnswers[item][0] = randomNumberOne + " " + randomNumberTwo;
            questionsAndAnswers[item][1] = String.valueOf(getCorrectAnswer(randomNumberOne, randomNumberTwo));
            item += 1;
        }
        Engine.startGame(questionsAndAnswers, "Find the greatest common divisor of given numbers.");
    }

    public static int getCorrectAnswer(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int tmp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = tmp;
        }
        return numberOne;
    }
}
