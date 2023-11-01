package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String gamePrime() {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Question: " + number);
        String correctAnswer = "";
        for (var i = 2; i < number; i ++) {
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
