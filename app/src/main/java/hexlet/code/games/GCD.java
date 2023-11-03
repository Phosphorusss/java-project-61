package hexlet.code.games;

import java.util.Random;

public class GCD {

    public static String gameGCD() {
        int upperlimit = 50;
        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(upperlimit);
        int randomNumberTwo = randomNumber.nextInt(upperlimit);

        System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
        while (randomNumberTwo != 0) {
            int tmp = randomNumberOne % randomNumberTwo;
            randomNumberOne = randomNumberTwo;
            randomNumberTwo = tmp;
        }
    return String.valueOf(randomNumberOne);
    }
}
