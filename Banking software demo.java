//Banking program mini project

import java.util.Scanner ;

public class Harsh
{

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {

        // java banking program
// declare variables
        double balance = 0;

        boolean isRunning = true;

        int choice;



        while(isRunning)
        {
            //display menu
            System.out.println("*****************");
            System.out.println("Banking program");
            System.out.println("*****************");

            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            //get and process user choice
            System.out.print("Enter your choice (1-3)");
            choice = scanner.nextInt();

            switch(choice)
            {


                case 1 -> showBalence(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid choice !");
            }
        }
        System.out.println("*****************");

        System.out.println("Thank you !");

        System.out.println("*****************");

        //Exit message


        scanner.close();
    }

    static void showBalence(double balance)
    {
        //showBalence() to the user
        System.out.println("*****************");

        System.out.printf("$ %.2f\n",balance);

        System.out.println("*****************");

    }

    static double deposit()
    {
        //deposit() funds
        double amount;

        System.out.print("Enter an amount to deposit :");
        amount = scanner.nextDouble();

        if(amount < 0)
        {
            System.out.println("Amount cant be negative !");
            return 0;
        }
        else
        {
            return amount;
        }
    }

    static double withdraw(double balance)
    {
        //withdraw() funds
        double amount;

        System.out.println("Enter amount to be withdrawn :");
        amount = scanner.nextDouble();

        if(amount > balance)
        {
            System.out.println("Insufficient funds !");
        }
        else if (amount < 0)
        {
            System.out.println("Amount cant be negative !");
        }
        else
        {
            return amount;
        }
        return 0;
    }
}
