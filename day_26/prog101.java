import java.util.Scanner;
import java.util.Random;

//number guessing game

public class prog101{
    public static void playgame()
    {
        Random rand = new Random();
        int number = rand.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);

        int guess = 0;
        int attempt = 0;
        
        System.out.println("welcome to the number guesing game:");
        System.out.println("guess a number between 1 to 100");

        while(guess!= number)
        {
            System.out.println("enter the guess");
            guess = sc.nextInt();
            attempt++;
        }
         if(guess < number)
         {
            System.out.println(" too low:");
         }
         else if(guess > number)
         {
            System.out.println(" too high");
         }
         else
         {
            System.out.println("Correct! You guessed it in " + attempt + " attempts.");

         }
         sc.close();
    }public static void main(String[] args) {
        playgame();
    }
}