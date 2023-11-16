package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    static final int UPPER_LIMIT = 50;
    static final int MINIMUM = 1;
    static final int END_VALUE_OF_RANGE = 9;
    static final int STARTING_RANGE_VALUE = 1;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 3;
    public static void gameProgression() {
        String[][] arrayCorrectAnswer = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            Random randomNumber = new Random();

            int firstNumberProgression = randomNumber.nextInt(UPPER_LIMIT - MINIMUM + 1) + MINIMUM;
            int difference = STARTING_RANGE_VALUE + (int) (Math.random() * END_VALUE_OF_RANGE);
            int unknownNumber = STARTING_RANGE_VALUE + (int) (Math.random() * END_VALUE_OF_RANGE);

            var progression = new StringBuilder("");
            progression.append(firstNumberProgression).append(" ");
            for (var i = 1; i <= END_VALUE_OF_RANGE; i++) {
                if (i == unknownNumber) {
                    firstNumberProgression = firstNumberProgression + difference;
                    progression.append("..").append(" ");
                    continue;
                }
                firstNumberProgression = firstNumberProgression + difference;
                progression.append(firstNumberProgression).append(" ");
            }
            String strProgression = progression.toString();

            arrayCorrectAnswer[item][0] = strProgression;
            arrayCorrectAnswer[item][1] = String.valueOf(getCorrectAnswer(strProgression, difference, unknownNumber));
            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer, "What number is missing in the progression?");
    }

    public static int getCorrectAnswer(String strProgression, int difference, int unknownNumber) {
        var stringToArray = strProgression.split(" ");
        return Integer.parseInt(stringToArray[unknownNumber - 1]) + difference;
    }
}
