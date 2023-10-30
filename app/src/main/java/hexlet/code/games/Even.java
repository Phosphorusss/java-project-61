package hexlet.code.games;

import java.util.Random;

public class Even {
    public static String gameEven() {
        //System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Question: " + randomNumber);
        String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}
