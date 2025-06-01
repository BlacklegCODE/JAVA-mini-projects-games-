import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        //JAVA quiz games


        // array of question
        String[] questions = {"What is full form of RGB?",
                                "What is full form of LED?",
                                "Which is the national bird of india ?",
                                "What is the population of India ? ( to the nearest billion )",
                                "Who wrote national anthem of India ?"};

        //options array[][]

        String[][] options = {  {"1. Red Green Blue","2. Right Great Bro!","3.Rock Green Black","4.Red Blue Green"},
                                {"1. Light Emitting Died","2. Light Exerting Disk","3.Lighty shit fr","4.Light Emitting Diode"},
                                {"1.Hen","2.Crow","Peacock","Pelicon"},
                                {"1. 1.48","2.69","1.32","2.68"},
                                {"1. Rabindranath Thakur","2.Rabindranath Tagore","3. Harsh Raundal","4. Thara Bhai Jogindar"}};



        //declare variables

        int[] answers = {1,4,3,1,1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        //welcome message

        System.out.println("**********************");
        System.out.println("WELCOME TO JAVA QUIZ !");
        System.out.println("**********************");
        System.out.println();

        for(int i = 0;i < questions.length;i++)
        {
            //questions (loop)
            System.out.println(questions[i]);

            //Options

            for(String option : options[i])
            {
                System.out.print(option +"   ");
            }
            System.out.println();

            //get guess from user

            System.out.print("Enter your answer :");
            guess = scanner.nextInt();

            if(guess == answers[i])
            {
                System.out.println("***************");
                System.out.println("Correct ! 😎");
                System.out.println("***************");
                System.out.println();
                System.out.println();
                score++;

            }
            else
            {
                System.out.println("***************");
                System.out.println("Wrong ! 🤦‍♂️");
                System.out.println("***************");
                System.out.println();
                System.out.println();
            }
        }

        // Display final score

        System.out.println("Your final score is :"+score+" out of "+questions.length);

        if(score>4)
        {
            System.out.println("You are a genius 🥰😎");
        }
        else if(score == 2|| score == 3 || score ==4)
        {
            System.out.println("You are pretty meh... 😐");
        }
        else
        {
            System.out.println("Cant lie, you're pretty stupid 😭😭");
        }

        scanner.close();
    }
}
