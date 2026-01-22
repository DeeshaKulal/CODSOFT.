import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;
        do {
            int number = rand.nextInt(100) + 1;
            int maxAttempts = 5;
            int guess;
            int attempts = 0;
            boolean isGuessed = false;
            System.out.println("\n Guess the numbers between 1 to 100");
            System.out.println("You have " + maxAttempts + " attempts");
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess:");
                guess = sc.nextInt();
                attempts++;
                if (guess > number) {
                    System.out.println("Too High");
                } else if (guess < number) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Correct!.... you guessed it in" +  attempts  +  " attempts");
                    score++;
                    isGuessed = true;
                    break;

                }

            }
            if (!isGuessed) {
                System.out.println("You lost!.... The correct number was :"  + number);
            }
            System.out.println("Do you want to play Again(y/n):");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Your Final Score is : " + score);
        System.out.println("Thank you for playing.");
        sc.close();
    }
}
