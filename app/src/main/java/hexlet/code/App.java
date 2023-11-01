package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        //scanner.close();
        switch (gameNumber){
            case 1:
                Cli.getUserName();
                break;
            case 2:
                Cli.getUserName();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Engine.startGame("2");
                break;
            case 3:
                Cli.getUserName();
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.startGame("3");
                break;
            case 4:
                Cli.getUserName();
                System.out.println("What is the result of the expression?");
                Engine.startGame("4");
                break;
            case 5:
                Cli.getUserName();
                System.out.println("What number is missing in the progression?");
                Engine.startGame("5");
                break;
            case 6:
                Cli.getUserName();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Engine.startGame("6");
                break;
        }
    }
}
