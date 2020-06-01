package usta.sistemas;

public class Main {
    public static int[][] matrix_votes = new int[123][8]; // 123 rows x 8 columns
    public static int[] total_votes = new int[8]; // Total votes per party
    public static String[] vector_parties = {"Liberal", "Conservador", "Alianza verde", "La U", "Cambio radical", "Centro democrático", "MIRA", "Polo"};
    public static int winner_votes = 0;
    public static int winner_columns = 0;

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 21/05/2020
	  DESCRIPTION: This software perform the simulation of a voting process for the Boyacá governorate where there are seven (8) candidates from the main political parties in Colombia:
                   ..0-liberal, 1-Conservador, 2- Alianza verde, 3- La U, 4- cambio radical, 5-Centro democrático, 6-MIRA, 7-Polo.
                   Generation of the vote for the 123 municipalities: bearing in mind that the votes must be between 1 and 1000 but cannot be repeated.
                   In turn, get the total votes per party and determine who is the winner and who is second.
	 */
        f_menu();
        f_fill_matrix(); // Fill the votes
        f_total_votes(); // Calculates the total votes
        for (int i = 0; i < total_votes.length; i++) {
            System.out.println("Political party " + vector_parties[i] + " total votes: " + total_votes[i]);
        }
        f_show_winner_and_second();
    }

    public static void f_menu() {
        //Description: This method shows the menu.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftDemocracyCol USTA 2020              ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static void f_fill_matrix() {
        //Description: This method fill the matrix with votes.
        for (int i = 0; i < matrix_votes.length; i++) { //To walk rows matrix from 0 to 122
            for (int p = 0; p < matrix_votes[0].length; p++) { //To walk the columns matrix from 0 to 7
                matrix_votes[i][p] = (int) Math.floor((Math.random() * 1000) + 1); // Random numbers between 1 to 1000
            }
        }
    }

    public static void f_total_votes() {
        //Description: This method calculates the total votes for every parties
        for (int p = 0; p < matrix_votes[0].length; p++) { //To walk the columns matrix from 0 to 7
            for (int i = 0; i < matrix_votes.length; i++) { //To walk rows matrix from 0 to 122
                total_votes[p] += matrix_votes[i][p]; // Sum every row (i) for any column
            }
        }
    }

    public static void f_show_winner_and_second() {
        //Description: This method walks the vector total_votes
        winner_votes = total_votes[0];
        int loser_votes = total_votes[0], loser_column = 0;
        for (int p = 1; p < total_votes.length; p++) {
            if (winner_votes < total_votes[p]) {
                winner_votes = total_votes[p];
                winner_columns = p;
            }
        }
        // Second place
        for (int p = 0; p < total_votes.length; p++) {
            if (winner_columns != p) { //Without the winner column
                if (loser_votes < total_votes[p]) {
                    loser_votes = total_votes[p];
                    loser_column = p;
                }
            }
        }
        System.out.println("\nThe winner is: " + vector_parties[winner_columns] + " total votes: " + total_votes[winner_columns]);
        System.out.println("The second place is: " + vector_parties[loser_column] + " total votes: " + total_votes[loser_column]);
    }
}