package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	/*AUTHOR: JUan Sebastian Arias Moreno
	  DATE: 19/05/2020
	  DESCRIPTION: This software ask the user to enter a value between 1 to N (number of rows) and the software will display the sum, average, largest and smallest of the numbers that are in that row.
                   When the user enters a value equal to zero (0) it must be finished.
	 */
        int rows = f_menu_total_rows();
        int columns = f_total_columns();
        int[][] matrix_numbers = new int[rows][columns]; //The matrix is empty
        matrix_numbers = f_fill_matrix(matrix_numbers); //Fill the matrix with numbers
        System.out.println("Input the number of the row.");
        int number_row = keyboard.nextInt();
        int sum = 0;
        double average = 0;
        while (number_row >= 0 && number_row < matrix_numbers.length - 1) {
            for (int j = 0; j < matrix_numbers[0].length; j++) {
                System.out.print(" | " + matrix_numbers[number_row][j]);
                sum += matrix_numbers[number_row][j];
            }
            average = sum / matrix_numbers[0].length;
            System.out.println("\nBy number row " + number_row + ", the sum is " + sum + ", and the average is " + average);
            System.out.println("Input other number of the row.");
            number_row = keyboard.nextInt();
        }
        System.out.println("----------Thanks----------");
    }

    public static int f_menu_total_rows() {
        //Description: This method shows the menu and returns the total rows of a matrix.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftNumbersOfRow USTA 2020              ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input how many rows do you want in the matrix.");
        int total_rows = keyboard.nextInt();
        while (total_rows <= 0) {
            System.err.println("ERROR: The value must be greater than zero.");
            System.out.println("Input again how many rows do you want in the matrix.");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }

    public static int f_total_columns() {
        //Description: This method returns the total columns of a matrix.
        System.out.println("Input how many columns do you want in the matrix.");
        int total_columns = keyboard.nextInt();
        while (total_columns <= 0) {
            System.err.println("ERROR: The value must be greater than zero.");
            System.out.println("Input again how many columns do you want in the matrix.");
            total_columns = keyboard.nextInt();
        }
        return total_columns;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers) {
        //Description: This method fill the matrix.
        for (int i = 0; i < matrix_numbers.length; i++) { //To walk the rows | total rows = matrix_numbers.length
            for (int j = 0; j < matrix_numbers[0].length; j++) { //To walk the columns | total columns = matrix_numbers[0].length
                matrix_numbers[i][j] = (int) Math.floor((Math.random() * 1000) + 1); //Math.random() = (0.00 y 0.99)
            }
        }
        return matrix_numbers; //Return a fill matrix
    }
}
