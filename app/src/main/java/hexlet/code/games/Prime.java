package hexlet.code.games;

import java.util.Random;

public class Prime {
    static final int UPPER_LIMIT = 100;
    public static String gamePrime() {
        Random random = new Random();
        int number = random.nextInt(UPPER_LIMIT);

        System.out.println("Question: " + number);
        String correctAnswer = "";

        if (number == 1 || number == 0) {
            correctAnswer = "no";
        }
        for (var i = 2; i < number; i++) {

            if (number % i == 0) {
                correctAnswer = "no";
                break;
            } else {
                correctAnswer = "yes";
            }
        }
    return correctAnswer;
    }
}
