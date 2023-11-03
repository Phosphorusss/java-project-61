package hexlet.code.games;

import java.util.Random;

public class Progression {

    static final int UPPER_LIMIT = 50;
    static final int MINIMUM = 1;
    public static String gameProgression() {
        Random randomNumber = new Random();
        int firstNumberProgression = randomNumber.nextInt(UPPER_LIMIT - MINIMUM + 1) + MINIMUM;

        int startingRangeValue = 1;
        int endValueOfRange = 9;
        int difference = startingRangeValue + (int) (Math.random() * endValueOfRange);
        int unknownNumber = startingRangeValue + (int) (Math.random() * endValueOfRange);

        int correctAnswer = 0;
        var progression = new StringBuilder("");
        progression.append(firstNumberProgression).append(" ");
        for (var i = 1; i <= 9; i++) {
            if (i == unknownNumber) {
                firstNumberProgression = firstNumberProgression + difference;
                correctAnswer = firstNumberProgression;
                progression.append("..").append(" ");
                continue;
            }
            firstNumberProgression = firstNumberProgression + difference;
            progression.append(firstNumberProgression).append(" ");

        }
        System.out.println("Question: " + progression);
    return String.valueOf(correctAnswer);
    }
}
