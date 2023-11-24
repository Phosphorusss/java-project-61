package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final int LOWER_LIMIT = 1;
    private static final int UPPER_LIMIT = 50;
    private static final int UPPER_LIMIT_UNKNOWN_NUMBER = 9;
    private static final int UPPER_LIMIT_DIFFERENCE = 5;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int ARRAY_LENGTH = 3;

    public static void gameProgression() {
        String[][] questionsAndAnswers = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {

            int firstNumberProgression = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int difference = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT_DIFFERENCE);
            int unknownNumber = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT_UNKNOWN_NUMBER);

            String progression = progressionGenerator(firstNumberProgression, difference, UPPER_LIMIT_UNKNOWN_NUMBER);
            var stringToArray = progression.split(" ");
            questionsAndAnswers[item][1] = stringToArray[unknownNumber];
            stringToArray[unknownNumber] = "..";
            questionsAndAnswers[item][0] = String.join(" ", stringToArray);
            item += 1;
        }
        Engine.startGame(questionsAndAnswers, "What number is missing in the progression?");
    }

    public static String progressionGenerator(int firstNumberProgression, int difference, int progressionNumbers) {
        var progression = new StringBuilder("");
        progression.append(firstNumberProgression).append(" ");
        for (var i = 1; i <= progressionNumbers; i++) {
            firstNumberProgression = firstNumberProgression + difference;
            progression.append(firstNumberProgression).append(" ");
        }
        return progression.toString();
    }
}
