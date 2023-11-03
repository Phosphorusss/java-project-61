package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet" +
                "\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 0) {
            return;
        }

        String userName = Cli.getUserName();;

        switch (gameNumber) {
            case 1:
                Cli.getUserName();
                break;
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Engine.startGame("2", userName);
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                Engine.startGame("3", userName);
                break;
            case 4:
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.startGame("4", userName);
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
                Engine.startGame("5", userName);
                break;
            case 6:
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Engine.startGame("6", userName);
                break;
            default:
                break;
        }
    }
}
