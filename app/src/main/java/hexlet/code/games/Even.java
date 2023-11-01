package hexlet.code.games;

import java.util.Random;

public class Even {
    public static String gameEven() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Question: " + randomNumber);
        String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}
