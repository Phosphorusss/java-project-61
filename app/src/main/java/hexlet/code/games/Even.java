package hexlet.code.games;

import java.util.Random;

public class Even {
    static final int UPPER_LIMIT = 100;
    public static String gameEven() {
        Random random = new Random();
        int randomNumber = random.nextInt(UPPER_LIMIT);
        System.out.println("Question: " + randomNumber);

        String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}
