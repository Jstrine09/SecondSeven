// a simple high low number guessing game for JShell
//
import java.util.Random;
import java.util.Scanner;

class TooHighTooLow {
    private int number;
    private int guesses;

    public TooHighTooLow() {
        // setup number to be a random number from 1 to 100
        // TODO: Create a Random object
        Random randomGenerator = new Random();
        // TODO: Set this.number to a random integer from 1 to 100 (hint: use nextInt)
        this.number = randomGenerator.nextInt(100) + 1;
        this.guesses = 0;
    
        // TODO: Set this.guesses to 0
        int maxGuesses = 5;
        int guesses = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TODO: Get a number guess from the user (between 1 and 100)
            System.out.println("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            this.guesses++;

            // TODO: Print a prompt asking for a guess
            
            // TODO: Read an integer from the scanner and store it in a variable called guess

            if (guess == this.number) {
                System.out.println("Congratulations on guessing the number! You got it in " + this.guesses + " tries!");
                break;
            } else if (guess < this.number) {
                System.out.println("Too Low, try again");
            } else if (guess > this.number) {
                System.out.println("Too High, try again");
            }

            if (this.guesses >= 10) {
                System.out.println("Incorrect, you are out of guesses. The correct number was " + this.number);
            break;
            }
        
            
            // TODO: Increment the number of guesses by 1
            

            // TODO: Check if the guess equals the secret number
            

            // TODO: If correct, print a congratulations message with the number of guesses
            // TODO: Exit the loop using break

            // TODO: Check if the guess is less than the secret number
            // TODO: If so, print "Too low!"

            // TODO: Check if the guess is greater than the secret number
            // TODO: If so, print "Too high!"

            // TODO: Check if the player has made 10 or more guesses
            // TODO: If so, print a message saying they've run out of guesses and reveal the number
            // TODO: Exit the loop using break
        }
    }

    public static void main(String[] args) {
        TooHighTooLow game = new TooHighTooLow();
        game.play();
    }
}

// Run the game
TooHighTooLow.main(null);

//