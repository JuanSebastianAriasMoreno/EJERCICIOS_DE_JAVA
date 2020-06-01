package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 26/05/2020
	  DESCRIPTION: This software generates a simulation automatic of 12 salaries in the year for N employees.
	 */
        int rows = f_menu_total_rows();
        int[][] matrix_numbers = new int[rows][12]; //The matrix is empty
        matrix_numbers = f_fill_matrix(matrix_numbers); //Fill the matrix with numbers
        int sum = 0;
        for (int i = 0; i < matrix_numbers.length; i++) {
            for (int j = 0; j < matrix_numbers[0].length; j++) {
                sum += matrix_numbers[i][j];
            }
        }
        double average = 0;
        average = sum / (rows * 12);
        System.out.println("The sum is " + sum + ", and the average is " + average);
    }

    public static int f_menu_total_rows() {
        //Description: This method shows the menu and returns the total rows of a matrix.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ smartPeople.inc USTA 2020               ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input how many employees do you want in the matrix.");
        int total_rows = keyboard.nextInt();
        while (total_rows <= 0) {
            System.err.println("ERROR: The value must be greater than zero.");
            System.out.println("Input again how many employees do you want in the matrix.");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers) {
        //Description: This method fill the matrix.
        for (int i = 0; i < matrix_numbers.length; i++) { //To walk the rows | total rows = matrix_numbers.length
            for (int j = 0; j < matrix_numbers[0].length; j++) { //To walk the columns | total columns = matrix_numbers[0].length
                matrix_numbers[i][j] = (int) Math.floor((Math.random() * (4439015 - 877803 + 1) + 877803)); //Math.random() = (0.00 y 0.99)
                System.out.println("The salaries for the employee " + (i + 1) + " are: ");
                System.out.println(matrix_numbers[i][j]);
            }
        }
        return matrix_numbers; //Return a fill matrix
    }
}

