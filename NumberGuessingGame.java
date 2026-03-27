import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;  // 1 to 100
        int maxAttempts = 7;
        int attemptsLeft = maxAttempts;
        boolean won = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I've picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!\n");

        while (attemptsLeft > 0) {
            System.out.print("Attempt " + (maxAttempts - attemptsLeft + 1) + "/" + maxAttempts + " → Enter your guess: ");
            int guess = scanner.nextInt();
            attemptsLeft--;

            if (guess == secret) {
                won = true;
                break;
            } else if (guess > secret) {
                System.out.println("Too high! " + attemptsLeft + " attempt(s) left.\n");
            } else {
                System.out.println("Too low! " + attemptsLeft + " attempt(s) left.\n");
            }
        }

        if (won) {
            System.out.println("Correct! You guessed it in " + (maxAttempts - attemptsLeft) + " attempt(s)!");
        } else {
            System.out.println("Game over! The number was " + secret + ".");
        }

        scanner.close();
    }
}