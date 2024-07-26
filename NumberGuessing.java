import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Score = 0;
        int rounds = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("All The Best!");

        for (int round = 1; round <= rounds; round++) {
            int numberGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maximumAttempts = 10; 
            boolean guessCorrect = false;

            System.out.println("Round " + round + ": Guess the number between 1 and 100.");

            while (attempts < maximumAttempts && !guessCorrect) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberGuess) {
                    System.out.println("Congratulations! You guessed the number " +guess);
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                    Score += (maximumAttempts - attempts + 1) * 10; 
                    guessCorrect = true;
                } else if (guess < numberGuess) {
                    System.out.println("Your guess is too low :( Try again");
                } else {
                    System.out.println("Your guess is too high :( Try again");
                }
            }

            if (!guessCorrect) {
                System.out.println("Sorry, you've used all " + maximumAttempts + " attempts. The number was " + numberGuess + ".");
            }
        }

        System.out.println("Game over! Your total score is: " + Score);
        scanner.close();
    }
}
