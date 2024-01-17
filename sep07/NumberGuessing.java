import java.util.Scanner;
import java.util.Random;


public class NumberGuessing {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int lowerBound = 0;
            int upperBound = 100;
            int randomNumber = random.nextInt(upperBound + 1); // Generate a random number between 0 and 100

            int userGuess;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a random number between 0 and 100 (inclusive). Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    System.out.println("It took you " + attempts + " attempts.");
                }
            } while (userGuess != randomNumber);

            scanner.close();
        }
}


