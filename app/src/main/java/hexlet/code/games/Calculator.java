package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static String gameCalculator() {
        //System.out.println("What is the result of the expression?");

        var operator = "-+*";

        Random random = new Random();
        char operatorRandom = operator.charAt(random.nextInt(operator.length()));

        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(50);
        int randomNumberTwo = randomNumber.nextInt(50);
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
        }
    return correctAnswer;
    }
}
