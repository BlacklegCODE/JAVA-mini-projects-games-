//Java slots game

import java.util.Random;
import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);

         //DECLARE VARIABLES

        int balance = 100;

        int bet = 0;
        
        int payout;
        
        String[] row;

        //DISPLAY WELCOME MESSAGE

        System.out.println("*********************************");
        System.out.println("WELCOME TO JAVA SLOTS GAME !!");
        System.out.println("Symbols :  🍵 ❤️ 🤖 🦆 💥 ");
        System.out.println("*********************************");


        //PLAY IF BALANCE > 0

        while (balance > 0)
        {
            System.out.println("Current balance : $" + balance);

            // ENTER BET AMOUNT

            System.out.print("Place your bet amount :");
            
            bet = scanner.nextInt();
            
            scanner.nextLine();
            

            // VERIFY IF BET > BALANCE

            if(bet>balance)
            {
                System.out.println("Insufficient funds !");
                continue;

            }

            // VERIFY IF BET > 0

            else if(bet <= 0)
            {
                System.out.println("Bet cant be this low !");
                continue;
            }

            // VERIFY IF BET > 0

            else
            {
                balance -= bet;
                System.out.println(balance);
            }

            System.out.println("Spinning...");
            
            row = spinRow();
            
            printRow(row);
            
            payout = getPayout(row,bet);
            

            if(payout >0)
            {
                System.out.println("You won $"+payout);
                
                balance += payout;
            }
            else
            {
                System.out.println("You lost !");
            }

            //ASK TO PLAY AGAIN

            System.out.println("Do you want to play again ?");
            
            String playagain = scanner.nextLine().toUpperCase();

            if(!playagain.equals("Y"))
            {
                break;
            }

        }



        //EXIT MESSAGE

        System.out.println("GAME OVER ! You final balance is :"+balance);
        
        scanner.close();
    }


    // SPIN ROW


    static String[] spinRow()
    {
        String[] symbols = {"🍵 ","❤️"," 🤖", "🦆", "💥"};
        String[] row = new String[3];

        Random random = new Random();



        for(int i = 0;i<3;i++)
        {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // PRINT ROW

    static void printRow(String[] row)
    {
        System.out.println("***************************");
        System.out.println(" "+String.join(" | ",row));
        System.out.println("***************************");
    }

    // GET PAYOUT

    static int getPayout(String[] row, int bet)
    {

    if(row[0].equals(row[1]) && row[1].equals(row[2]))
    {
        return switch(row[0])
        {
            case "🍵" -> bet * 3;

            case "❤️" -> bet * 4;

            case "🤖" -> bet * 6;

            case "🦆" -> bet * 10;

            case "💥" -> bet * 20;

            default -> 0;

        };

    }
    else if(row[0].equals(row[1]))
    {
        return switch(row[0])
        {
            case "🍵" -> bet * 3;

            case "❤️" -> bet * 4;

            case "🤖" -> bet * 6;

            case "🦆" -> bet * 10;

            case "💥" -> bet * 20;

            default -> 0;

        };

    }
    else if(row[1].equals(row[2]))
{
    return switch(row[1])
    {
        case "🍵" -> bet * 3;

        case "❤️" -> bet * 4;

        case "🤖" -> bet * 6;

        case "🦆" -> bet * 10;

        case "💥" -> bet * 20;

        default -> 0;

    };

}

    return 0;
}
}
