package hexlet.code.games;

import java.util.Random;

public class GCD {

    public static String gameGCD() {
        //System.out.println("Find the greatest common divisor of given numbers.");
        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(50);
        int randomNumberTwo = randomNumber.nextInt(50);

        System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
        while (randomNumberTwo != 0) {
            int tmp = randomNumberOne % randomNumberTwo;
            randomNumberOne = randomNumberTwo;
            randomNumberTwo = tmp;
        }
    return String.valueOf(randomNumberOne);
    }
}
