package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static String gameProgression() {
        Random randomNumber = new Random();
        int firstNumberProgression = randomNumber.nextInt(50 - 1 + 1) + 1;

        int difference = 1 + (int) (Math.random() * 9);
        int unknownNumber = 1 + (int) (Math.random() * 9);

        int correctAnswer = 0;
        var progression = new StringBuilder("");
        progression.append(firstNumberProgression).append(" ");
        for (var i = 1; i <= 9; i ++) {
            if (i == unknownNumber) {
                firstNumberProgression = firstNumberProgression + difference;
                correctAnswer = firstNumberProgression;
                System.out.println("correctAnswer " + correctAnswer);
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
