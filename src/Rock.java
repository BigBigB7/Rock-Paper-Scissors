import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = "";
        int computerInt;
        String response;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Let's play Rock, Paper, Scissors! Please enter a move.");

        System.out.println();

        computerInt = generator.nextInt(3) + 1;

        if (computerInt == 1)
            computerPlay = "rock";
        else if (computerInt == 2)
            computerPlay = "paper";
        else if (computerInt == 3)
            computerPlay = "scissors";

        System.out.println("Enter your play: ");
        personPlay = scan.next();
        //System.out.println(personPlay);  for debugging; shows what the user plays

        System.out.println("Computer's play is: " + computerPlay);

        while (!personPlay.equals("rock") && !personPlay.equals("paper") && !personPlay.equals("scissors")) {
            System.out.println("Invalid play, try again.");
            personPlay = scan.next();

        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("rock")) {
            if (computerPlay.equals("scissors"))
                System.out.println("Rock crushes scissors. You win!");
            else if (computerPlay.equals("paper"))
                System.out.println("Paper covers rock. You lose!");
        } else if (personPlay.equals("paper")) {
            if (computerPlay.equals("scissors"))
                System.out.println("scissor cuts paper. You lose!");
            else if (computerPlay.equals("rock"))
                System.out.println("Paper covers rock. You win!");
        } else if (personPlay.equals("scissors")) {
            if (computerPlay.equals("paper"))
                System.out.println("scissor cuts paper. You win!");
            else if (computerPlay.equals("rock"))
                System.out.println("rock breaks scissors. You lose!");
            }
        }
    }
}