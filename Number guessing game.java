
//number guessing game using java

import java.util.Scanner;
import java.util.Random;
public class Harsh
{
    public static void main(String[] args)
    {
      //This game is a slight variation of a pre-existing version of number guessing game ( also made by me, Harsh)
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;

        int attempts = 0;

        int min = 1;

        int max = 100;

        int randomNo = random.nextInt(min,max+1);

        System.out.println("Number guessing game !");
        System.out.println("Enter a number between "+min+" and "+max+" :");

        do {
            System.out.println("Enter a guess :");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNo)
            {
                System.out.println("Too low, try again !");
            }
            else if(guess>randomNo)
            {
                System.out.println("Too high, try again !");
            }
            else
            {
                System.out.println("Correct ! The number was "+randomNo);
                System.out.println("You took "+attempts+" attempts !");
            }
        }while(guess != randomNo);


        scanner.close();

    }

}
