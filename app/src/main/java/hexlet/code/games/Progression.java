package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static String gameProgression() {
        Random randomNumber = new Random();
        int firstNumberProgression = randomNumber.nextInt(50);
        System.out.println(firstNumberProgression);

        int difference = randomNumber.nextInt(10);
        System.out.println(difference);

        int unknownNumber = randomNumber.nextInt(9);
        int correctAnswer = 0;

        var progression = new StringBuilder("");
        progression.append(firstNumberProgression).append(" ");
        for (var i = 0; i < 10; i ++) {
            if (i == unknownNumber) {
                firstNumberProgression = firstNumberProgression + difference;
                correctAnswer = firstNumberProgression;
                progression.append("..").append(" ");
                continue;
            }
            firstNumberProgression = firstNumberProgression + difference;
            progression.append(firstNumberProgression).append(" ");

        }
        System.out.println(progression.toString());
    return String.valueOf(correctAnswer);
    }
}
