package hexlet.code.games;

import java.util.Random;

public class Calculator {
    static final int UPPER_LIMIT = 100;
    static final int MINIMUM = 40;
    public static String gameCalculator() {
        String operator = "-+*";
        Random random = new Random();
        char operatorRandom = operator.charAt(random.nextInt(operator.length()));

        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(UPPER_LIMIT - MINIMUM + 1) + MINIMUM;
        int randomNumberTwo = randomNumber.nextInt(UPPER_LIMIT);
        String correctAnswer = "";

        switch (operatorRandom) {
            case '-':
                System.out.println("Question: " + randomNumberOne + " - " + randomNumberTwo);
                correctAnswer = String.valueOf(randomNumberOne - randomNumberTwo);
                break;
            case '+':
                System.out.println("Question: " + randomNumberOne + " + " + randomNumberTwo);
                correctAnswer = String.valueOf(randomNumberOne + randomNumberTwo);
                break;
            case '*':
                System.out.println("Question: " + randomNumberOne + " * " + randomNumberTwo);
                correctAnswer = String.valueOf(randomNumberOne * randomNumberTwo);
                break;
            default:
                correctAnswer = null;
        }
    return correctAnswer;
    }
}
