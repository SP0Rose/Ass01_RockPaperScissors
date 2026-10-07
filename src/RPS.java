import java.util.Scanner;

public class RPS {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        String RPS1;
        String RPS2;
        String YN;
        boolean valid1;
        boolean valid2;
        boolean valid3;
        boolean valid4 = false;

        // Ask question
        System.out.println("Do you wish to play rock, paper, scissors? Put Y for yes and N for no: ");
        YN = scan.nextLine();

        do {

            if (YN.equalsIgnoreCase("Y")){

                do {
                    // Start of game
                    do {
                        System.out.println("Player 1, choose Rock(R), Paper(P), or Scissors(S)");
                        RPS1 = scan.nextLine();

                        if (RPS1.equalsIgnoreCase("R") || RPS1.equalsIgnoreCase("P") || RPS1.equalsIgnoreCase("S")) {

                            do {
                                System.out.println("Player 2, choose Rock(R), Paper(P), or Scissors(S)");
                                RPS2 = scan.nextLine();

                                if (RPS2.equalsIgnoreCase("R") || RPS2.equalsIgnoreCase("P") || RPS2.equalsIgnoreCase("S")) {
                                    System.out.println("\nResults: ");

                                    // Conditionals
                                    if (RPS1.equalsIgnoreCase("R") && RPS2.equalsIgnoreCase("R")) {
                                        System.out.println("You both chose rock, it's a tie.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("R") && RPS2.equalsIgnoreCase("S")) {
                                        System.out.println("Rock beats scissors, player 1 wins.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("R") && RPS2.equalsIgnoreCase("P")) {
                                        System.out.println("Paper beats rocks, player 2 wins.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("P") && RPS2.equalsIgnoreCase("P")) {
                                        System.out.println("You both chose paper, it’s a tie.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("P") && RPS2.equalsIgnoreCase("S")) {
                                        System.out.println("Scissors beats paper, player 2 wins.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("P") && RPS2.equalsIgnoreCase("R")) {
                                        System.out.println("Paper beats rocks, player 1 wins.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("S") && RPS2.equalsIgnoreCase("S")) {
                                        System.out.println("You both chose scissors, it’s a tie.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("S") && RPS2.equalsIgnoreCase("R")) {
                                        System.out.println("Rock beats scissors, player 2 wins.");
                                        //--------------------------------------------------------------------
                                    } else if (RPS1.equalsIgnoreCase("S") && RPS2.equalsIgnoreCase("P")) {
                                        System.out.println("Scissors beats paper, player 1 wins.");
                                    }
                                    valid1 = true;
                                } else {
                                    System.out.println("That is not a valid response. Try again.");
                                    valid1 = false;
                                }
                            } while (!valid1);
                            valid2 = true;
                        } else {
                            System.out.println("That is not a valid response. Try again.");
                            valid2 = false;
                        }
                    } while (!valid2);

                    // Restate question
                    System.out.println("Do you wish to play rock, paper, scissors? Put Y for yes and N for no: ");
                    YN = scan.nextLine();

                    // When "No"
                    if (YN.equalsIgnoreCase("N")) {
                        valid3 = true;
                    } else valid3 = !YN.equalsIgnoreCase("Y");

                } while (!valid3);

            } else if (YN.equalsIgnoreCase("N")) {
                System.out.println("You chose to leave. Goodbye.");
                valid4 = true;
            } else {
                do {
                    System.out.println("That's not a valid response. It must be Y or N. Try again.");
                    System.out.println("Do you want to play? Y or N: ");
                    YN = scan.nextLine();
                } while (!YN.equalsIgnoreCase("Y") && !YN.equalsIgnoreCase("N"));
            }
        } while (!valid4);
    }
}