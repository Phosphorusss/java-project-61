package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calculator {
    private static final int LOWER_LIMIT = 1;
    private static final int UPPER_LIMIT = 50;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int ARRAY_LENGTH = 3;

    public static void gameCalculator() {
        String[][] questionsAndAnswers = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            String operator = "-+*";
            Random random = new Random();
            char operatorRandom = operator.charAt(random.nextInt(operator.length()));

            int randomNumberOne = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int randomNumberTwo = Utils.getRandomInt(LOWER_LIMIT, UPPER_LIMIT);

            questionsAndAnswers[item][0] = randomNumberOne + " " + operatorRandom + " " + randomNumberTwo;
            questionsAndAnswers[item][1] = String.valueOf(getCorrectAnswer(randomNumberOne,
                    randomNumberTwo, operatorRandom));

            item += 1;
        }
        Engine.startGame(questionsAndAnswers, "What is the result of the expression?");
    }

    public static int getCorrectAnswer(int numberOne, int numberTwo, char operator) {
        int correctAnswer = 0;
        switch (operator) {
            case '-':
                correctAnswer = numberOne - numberTwo;
                break;
            case '+':
                correctAnswer = numberOne + numberTwo;
                break;
            case '*':
                correctAnswer = numberOne * numberTwo;
                break;
            default:
                break;
        }
        return correctAnswer;
    }
}
