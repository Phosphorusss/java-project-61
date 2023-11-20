package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    static final int UPPER_LIMIT = 100;
    static final int MINIMUM = 40;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 3;

    public static void gameCalculator() {
        String[][] arrayCorrectAnswer = new String[ARRAY_LENGTH][2];

        int item = 0;
        while (item < NUMBER_OF_ROUNDS) {
            String operator = "-+*";
            Random random = new Random();
            char operatorRandom = operator.charAt(random.nextInt(operator.length()));

            Random randomNumber = new Random();
            int randomNumberOne = randomNumber.nextInt(UPPER_LIMIT - MINIMUM + 1) + MINIMUM;
            int randomNumberTwo = randomNumber.nextInt(UPPER_LIMIT);

            arrayCorrectAnswer[item][0] = randomNumberOne + " " + operatorRandom + " " + randomNumberTwo;
            arrayCorrectAnswer[item][1] = String.valueOf(getCorrectAnswer(randomNumberOne,
                    randomNumberTwo, operatorRandom));

            item += 1;
        }
        Engine.startGame(arrayCorrectAnswer, "What is the result of the expression?");
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
