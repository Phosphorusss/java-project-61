package hexlet.code.games;

import java.util.Random;

public class Even {
    public static String gameEven() {
        int upperlimit = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(upperlimit);
        System.out.println("Question: " + randomNumber);

        String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}
