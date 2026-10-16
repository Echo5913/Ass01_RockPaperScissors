
import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String playerA;
        String playerB;
        String playAgain;

        do {
            // Get a valid move from Player A
            do {
                System.out.print("Player A, enter R, P, or S: ");
                playerA = input.nextLine();

                if (!playerA.equalsIgnoreCase("R")
                        && !playerA.equalsIgnoreCase("P")
                        && !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            } while (!playerA.equalsIgnoreCase("R")
                    && !playerA.equalsIgnoreCase("P")
                    && !playerA.equalsIgnoreCase("S"));

            // Get a valid move from Player B
            do {
                System.out.print("Player B, enter R, P, or S: ");
                playerB = input.nextLine();

                if (!playerB.equalsIgnoreCase("R")
                        && !playerB.equalsIgnoreCase("P")
                        && !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            } while (!playerB.equalsIgnoreCase("R")
                    && !playerB.equalsIgnoreCase("P")
                    && !playerB.equalsIgnoreCase("S"));

            // Display the results
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a Tie!");
            } else if (playerA.equalsIgnoreCase("R")
                    && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else if (playerA.equalsIgnoreCase("P")
                    && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            } else if (playerA.equalsIgnoreCase("S")
                    && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else if (playerB.equalsIgnoreCase("R")
                    && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player B wins!");
            } else if (playerB.equalsIgnoreCase("P")
                    && playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player B wins!");
            } else {
                System.out.println("Scissors cuts Paper. Player B wins!");
            }

            // Ask whether to play again
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = input.nextLine();

                if (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y")
                    && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");

        input.close();
    }
}
