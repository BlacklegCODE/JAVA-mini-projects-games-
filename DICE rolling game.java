//dice rolling code in java

import java.util.Scanner;
import java.util.Random;

public class Harsh
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // declare variables

        int numOFdice;
        int total = 0;

        // check number of dice from user
        System.out.print("Enter number of dice to roll :");
        numOFdice = scanner.nextInt();

        // check if number of dice is more than 0

        if(numOFdice>0)
        {
            // roll the dice

            for(int i = 0;i<numOFdice;i++)
            {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled :"+roll);
                total += roll;
            }

            // get the total
            System.out.println("\nThe total is :"+total);

        }
        else
        {
            System.out.println("Number of dice must be greater than zero !");
        }



        //display ascii of dice
        scanner.close();
    }

    static void printDie(int roll)
    {
        String dice1 = """
                -------
               |       |
               |   ֎   |
               |       |
                -------
                """;

        String dice2 = """
                -------
               |       |
               | ֎   ֎ |
               |       |
                -------
                """;

        String dice3 = """
                -------
               | ֎     |
               |   ֎   |
               |     ֎ |
                -------
                """;

        String dice4 = """
                -------
               | ֎   ֎ |
               |       |
               | ֎   ֎ |
                -------
                """;

        String dice5 = """
                -------
               | ֎   ֎ |
               |   ֎   |
               | ֎   ֎ |
                -------
                """;

        String dice6 = """
                -------
               | ֎   ֎ |
               | ֎   ֎ |
               | ֎   ֎ |
                -------
                """;


        switch(roll)
        {
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);

            case 7-> System.out.println("Invalid roll !");


        }
    }
}
