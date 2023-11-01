package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static String gameProgression() {
        Random randomNumber = new Random();
        int firstNumberProgression = randomNumber.nextInt(100 - 1 + 1) + 1;

        int difference = randomNumber.nextInt(10 - 1 + 1) + 1;
        //System.out.println("Шаг(только для теста) " + difference);

        int unknownNumber = randomNumber.nextInt(10 - 1 + 1) + 1;
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
