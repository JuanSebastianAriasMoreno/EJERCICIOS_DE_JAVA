package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 13/05/2020
	  DESCRIPTION: This software let USTA learn how students rate food in the Giordano Bruno building cafeteria. For this, a scale of 1 to 10 was defined (1 denotes horrible and 10 denotes excellent). The software will perform a simulation where you randomly generate these grades for a month (20 days) for a number of students (the user will determine how many students will be surveyed).
	 */
        int total_students = f_menu_total_students();
        int[][] rates_matrix = f_fill_rates_matrix(total_students);
        f_show_bad_rates(rates_matrix);
        f_show_regular_rates(rates_matrix);
        f_show_excellent_rates(rates_matrix);
    }

    public static int f_menu_total_students() {
        //Description: This method shows the menu and returns the total students.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftRatingFood USTA 2020                ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input how many students do you want to rate the food.");
        int total_students = keyboard.nextInt();
        while (total_students <= 0) {
            System.err.println("Error: The value must be greater than zero.");
            System.out.println("Input again how many students do you want to rate the food.");
            total_students = keyboard.nextInt();
        }
        return total_students;
    }

    public static int[][] f_fill_rates_matrix(int total_students) {
        //Description: This method returns a matrix with rates of N students.
        int[][] rates_matrix = new int[total_students][20];
        for (int i = 0; i < total_students; i++) { //Recorrer las filas
            for (int j = 0; j < 20; j++) {
                rates_matrix[i][j] = (int) Math.floor((Math.random() * 10) + 1);
            }
        }
        return rates_matrix;
    }

    public static void f_show_bad_rates(int[][] rates_matrix) {
        //Description: This method shows the bad rates (<=3).
        int total_bad_rates = 0;
        for (int e = 0; e < rates_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (rates_matrix[e][r] <= 3) {
                    total_bad_rates++;

                }
            }
        }
        double percent = (total_bad_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total bad rates (<=3): " + total_bad_rates + ", percent: %" + percent);
    }

    public static void f_show_regular_rates(int[][] rates_matrix) {
        //Description: This method shows the regular rates (between 4 to 6).
        int total_regular_rates = 0;
        for (int e = 0; e < rates_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (rates_matrix[e][r] >= 4 && rates_matrix[e][r] <= 6) {
                    total_regular_rates++;

                }
            }
        }
        double percent = (total_regular_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total regular rates (between 4 to 6): " + total_regular_rates + ", percent: %" + percent);
    }

    public static void f_show_excellent_rates(int[][] rates_matrix) {
        //Description: This method shows the excellent rates (greater or equal than 7).
        int total_excellent_rates = 0;
        for (int e = 0; e < rates_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (rates_matrix[e][r] >= 7) {
                    total_excellent_rates++;

                }
            }
        }
        double percent = (total_excellent_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total excellent rates (greater or equal than 7): " + total_excellent_rates + ", percent: %" + percent);
    }
}
