package hexlet.code.games;

import java.util.Random;

public class Calculator {
    public static String gameCalculator() {
        String operator = "-+*";
        Random random = new Random();
        char operatorRandom = operator.charAt(random.nextInt(operator.length()));

        int upperlimit = 100;
        int minimum = 40;
        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(upperlimit - minimum + 1) + minimum;
        int randomNumberTwo = randomNumber.nextInt(upperlimit);
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
