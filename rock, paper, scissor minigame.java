import java.util.Random;
import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        //ROCK PAPER SCISSORS GAME !!

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //declare variables

        String[] choices = {"rock","paper","scissors"};
        String playerchoice;
        String compChoice;
        String playAgain = "yes";

        // get choice from user

        do
        {
            
        System.out.print("Enter your move :");
        playerchoice = scanner.nextLine().toLowerCase();



        if(!playerchoice.equals("rock") &&
                !playerchoice.equals("paper") &&
                !playerchoice.equals("scissors") )
        {
            System.out.println("Invalid choice !");
            continue;
        }

        // get random choice form computer

        compChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice :"+compChoice);

        //check win conditions


            if(playerchoice.equals(compChoice))
            {
                System.out.println("Its a tie !");
            }
            else if((playerchoice.equals("rock") && compChoice.equals("scissors")) || (playerchoice.equals("scissors") && compChoice.equals("paper")) || (playerchoice.equals("paper") && compChoice.equals("rock")))
            {
                System.out.println("You win !");
            }
            else
            {
                System.out.println("You lose !");
            }

            // ask to play again

            System.out.println("Yould like to play again ? (yes/no) :");
            playAgain = scanner.nextLine().toLowerCase();


        }while( playAgain.equals("yes"));

        // exit message

        System.out.println("Thanks for playing this game !");

        scanner.close();
    }
}
