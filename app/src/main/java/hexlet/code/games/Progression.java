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

            String progression = progressionGenerator(firstNumberProgression, difference);
            var stringToArray = progression.split(" ");
            arrayCorrectAnswer[item][1] = stringToArray[unknownNumber];
            stringToArray[unknownNumber] = "..";
            arrayCorrectAnswer[item][0] = String.join(" ", stringToArray);
            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer, "What number is missing in the progression?");
    }

    public static String progressionGenerator(int firstNumberProgression, int difference) {
        var progression = new StringBuilder("");
        progression.append(firstNumberProgression).append(" ");
        for (var i = 1; i <= END_VALUE_OF_RANGE; i++) {
            firstNumberProgression = firstNumberProgression + difference;
            progression.append(firstNumberProgression).append(" ");
        }
        return progression.toString();
    }
}
