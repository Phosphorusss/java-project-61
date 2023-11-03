package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static String gameProgression() {
        int upperlimit = 50;
        int minimum = 1;
        Random randomNumber = new Random();
        int firstNumberProgression = randomNumber.nextInt(upperlimit - minimum + 1) + minimum;

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
