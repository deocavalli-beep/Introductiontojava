import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();


        String[] ArrayOfwords = {"PROGRAMMING", "VEHICLE", "HOUSE", "TIGER", "SONGS","CLOTHES","MATCHES","LOVING"};


        int randomNumber = random.nextInt(ArrayOfwords.length);
        String secretWord = ArrayOfwords[randomNumber];


        String guessedLetters = "";

        int incorrectGuesses = 0;

        // Math class example
        int maxAttempts = Math.max(6, secretWord.length());

        System.out.println("=== HANGMAN GAME ===");
        System.out.println("Guess the secret word one letter at a time!");

        while (incorrectGuesses < maxAttempts) {

            String hiddenWord = "";


            for (int i = 0; i < secretWord.length(); i++) {

                char letter = secretWord.charAt(i);

                if (guessedLetters.indexOf(letter) >= 0) {
                    hiddenWord += letter + " ";
                } else {
                    hiddenWord += "_ ";
                }
            }

            System.out.println();
            System.out.println("Word: " + hiddenWord);

            int remainingAttempts = maxAttempts - incorrectGuesses;

            System.out.printf("Incorrect guesses: %d%n", incorrectGuesses);
            System.out.printf("Remaining attempts: %d%n", remainingAttempts);


            if (!hiddenWord.contains("_")) {
                System.out.println();
                System.out.println("Congratulations! You guessed the word!");
                System.out.println("The word was: " + secretWord);
                break;
            }

            System.out.print("Enter a letter: ");
            String guess = input.nextLine().toUpperCase();


            if (guess.length() == 0) {
                System.out.println("Please enter a letter.");
                continue;
            }


            char guessedLetter = guess.charAt(0);


            if (guessedLetters.indexOf(guessedLetter) >= 0) {
                System.out.println("You already guessed that letter.");
                continue;
            }

            guessedLetters += guessedLetter;


            if (secretWord.indexOf(guessedLetter) >= 0) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess.");
                incorrectGuesses++;
            }
        }


        if (incorrectGuesses >= maxAttempts) {
            System.out.println();
            System.out.println("Game Over!");
            System.out.println("The secret word was: " + secretWord);
        }

        input.close();
    }
}