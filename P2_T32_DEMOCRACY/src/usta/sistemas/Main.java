package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*AUTHOR: Juan Sebastian Arias Moreno
      DATE: 07/05/2020
      DESCRIPTION: This software Randomly generate the number of votes (values ​​between 1 and 5000) for N candidates, the vote must be saved in a vector and the program must solve the following question
                   -Who was the winning candidate and how many votes did he get?
                   -Who was the candidate who was second and how many votes did he have to win?
                   -What was the total number of votes?
                   */

    public static void main(String[] args) {
        f_menu();
        int total_candidates = f_total_candidates();
        int[] vector_votes = f_fill_vector_votes(total_candidates);
        f_show_winner(vector_votes);
    }

    public static void f_menu() {
        //Description: This method shows menu of this software.
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║SoftSalaryTurns                        ║");
        System.out.println("║Version 1.0                            ║");
        System.out.println("║Created by: Juan Sebastian Arias Moreno║");
        System.out.println("╚═══════════════════════════════════════╝");
    }

    public static int f_total_candidates() {
        //Description: This method return the total candidates, that the user input.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total candidates:");
        int total_candidates = keyboard.nextInt();
        while (total_candidates < 2) {
            System.err.println("ERROR: You must input at least 2 candidates");
            System.out.println("Input again the total candidates:");
            total_candidates = keyboard.nextInt();
        }
        return total_candidates;
    }

    public static int[] f_fill_vector_votes(int total_votes) {
        //Description: this method return the fill vector of the votes
        int[] vector_votes = new int[total_votes];
        for (int i = 0; i < vector_votes.length; i++) {
            vector_votes[i] = (int) Math.floor((Math.random() * 5000) + 1);
        }
        return vector_votes;
    }

    public static void f_show_winner(int[] vector_votes) {
        //Description: This method dhow the winner candidate.
        int winner_votes = 0, winner_number = 0;
        for (int i = 0; i < vector_votes.length; i++) {
            if (i == 0) {
                winner_votes = vector_votes[i];
            } else if (vector_votes[i] > winner_votes) {
                winner_votes = vector_votes[i];
                winner_number = i;
            }
        }
        System.out.println("The winner candidate was: " + winner_number);
        System.out.println("With the total votes: " + winner_votes);
    }
}

