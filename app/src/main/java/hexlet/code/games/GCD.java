package hexlet.code.games;

import java.util.Random;

public class GCD {
    static final int UPPER_LIMIT = 100;
    public static String gameGCD() {

        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(UPPER_LIMIT);
        int randomNumberTwo = randomNumber.nextInt(UPPER_LIMIT);

        System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
        while (randomNumberTwo != 0) {
            int tmp = randomNumberOne % randomNumberTwo;
            randomNumberOne = randomNumberTwo;
            randomNumberTwo = tmp;
        }
    return String.valueOf(randomNumberOne);
    }
}
