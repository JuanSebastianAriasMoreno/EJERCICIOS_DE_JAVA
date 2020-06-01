package usta.sistemas;

public class Main {
    public static int[][] matrix_votes = new int[123][2];
    public static int winner; //Column 0 (no) or 1 (yes)
    public static int loser; //Column 0 (no) or 1 (yes)

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 19/05/2020
	  DESCRIPTION: This software must visualize which was the result of the vote: showing the winner and the loser with their percentage. Additionally, you must view the rows that have the most voted for the winner and those that least vote for the loser.
	 */
        f_menu();
        f_fill_matrix();
        f_show_winner();
        f_show_row_winner();
        f_show_all_votes();
    }

    public static void f_menu() {
        //Description: This method shows the menu and returns the total rows of a matrix.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftVotesClubsAndBars USTA 2020         ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static void f_fill_matrix() {
        //Description: This method fill the matrix.
        for (int i = 0; i < matrix_votes.length; i++) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 5000) + 1); //Vote NO
            matrix_votes[i][1] = (int) Math.floor((Math.random() * 5000) + 1); //Vote YES
        }
    }

    public static void f_show_winner() {
        //Description: This method show the winner
        int total_yes = 0, total_no = 0;
        for (int i = 0; i < matrix_votes.length; i++) {
            total_no += matrix_votes[i][0];
            total_yes += matrix_votes[i][1];
        }
        if (total_no == total_yes) {
            System.out.println("YES and NO are the same with: " + total_no);
            winner = -1;
        } else if (total_no > total_yes) {
            System.out.println("The winner is the NO with: " + total_no + ", and the loser is YES with: " + total_yes + " with the %" + (total_no * 100 / (total_no + total_yes)));
            winner = 0;
            loser = 1;
        } else {
            System.out.println("The winner is the YES with: " + total_yes + ", and the loser is NO with: " + total_no + "  with the %" + (total_yes * 100 / (total_no + total_yes)));
            winner = 1;
            loser = 0;
        }
    }

    public static void f_show_row_winner() {
        //Description: Whit this method you must view the rows that have the most voted for the winner and those that least.
        int more_votes_winner = matrix_votes[0][winner], more_votes_winner_row = 0;
        int more_votes_loser = 0, more_votes_loser_row = 0;
        for (int i = 0; i < matrix_votes.length; i++) { //To walk the matrix | row to row
            if (more_votes_winner < matrix_votes[i][winner]) {
                more_votes_winner = matrix_votes[i][winner];
                more_votes_winner_row = i;
            }
            if (winner == 1) {
                if (more_votes_loser < matrix_votes[i][loser]) {
                    more_votes_loser = matrix_votes[i][loser];
                    more_votes_loser_row = i;
                }
            }
        }
        System.out.println("The municipality with the more votes by winner was: " + (more_votes_winner_row + 1) + " total votes: " + more_votes_winner);
        System.out.println("The municipality with the more votes by loser was: " + (more_votes_loser_row + 1) + " total votes: " + more_votes_loser);
    }

    public static void f_show_all_votes() {
        //Description:: This method shows all the votes
        System.out.println(" NO | YES ");
        for (int i = 0; i < matrix_votes.length; i++) {
            System.out.println(matrix_votes[i][0] + " | " + matrix_votes[i][1]);
        }
    }
}
