package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Even {
    static final int UPPER_LIMIT = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 3;

    public static void question() {
        String[][] arrayCorrectAnswer = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            Random random = new Random();
            int randomNumber = random.nextInt(UPPER_LIMIT);

            arrayCorrectAnswer[item][0] = String.valueOf(randomNumber);
            arrayCorrectAnswer[item][1] = isEven(randomNumber) ? "yes" : "no";
            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

        public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


