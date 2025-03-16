import java.util.Random;
import java.util.Scanner;


public class NUMBERGUESSING {
    public static void main (String [] args){
    

     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
        int guess;
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(1, 11) ;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10");

        System.out.println("Enter a guess: ");
        guess = scanner.nextInt();

        while( guess != randomNumber){
            if (guess < min || guess > max) {
                System.out.println("Your guess is out of bounds! Please enter a number between 1 and 100.");
            }else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }else if( guess < randomNumber){

                System.out.println("TOO LOW! Try again");
            }
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            }   
                
            System.out.println("Correct! You guessed the number.");
            
        scanner.close();
        }

    }



