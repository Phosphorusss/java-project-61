package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int UPPER_LIMIT = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 3;
    public static void gameGCD() {
        String[][] arrayCorrectAnswer = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            Random randomNumber = new Random();
            int randomNumberOne = randomNumber.nextInt(UPPER_LIMIT);
            int randomNumberTwo = randomNumber.nextInt(UPPER_LIMIT);

            arrayCorrectAnswer[item][0] = randomNumberOne + " " + randomNumberTwo;
            arrayCorrectAnswer[item][1] = String.valueOf(getCorrectAnswer(randomNumberOne, randomNumberTwo));
            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer, "Find the greatest common divisor of given numbers.");
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
