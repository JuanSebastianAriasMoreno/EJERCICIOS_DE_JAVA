package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 12/05/2020
	  DESCRIPTION: This software store in a matrix the number of students (10) with which a subject has, with their respective four notes (P1: 20%, P2:25%, P3:25%, P4:30%.... Notes are random values between 0.0 and 5.0):
	 */
        f_menu();
        double[][] matrix_grades = f_fill_matrix();
        f_show_final_grades(matrix_grades);
    }

    public static void f_menu() {
        //Description: This method shows the menu.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftEstudentsGrades USTA 2020           ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static double[][] f_fill_matrix() {
        //DESCRIPTION: This method returns the fill matrix (10 x 4)
        double[][] matrix = new double[10][4];
        for (int i = 0; i < 10; i++) {
            matrix[i][0] = Math.floor((Math.random() * 5) + 1); //Generates random values between 0.0 to 5.0
            matrix[i][1] = Math.floor((Math.random() * 5) + 1);
            matrix[i][2] = Math.floor((Math.random() * 5) + 1);
            matrix[i][3] = Math.floor((Math.random() * 5) + 1);
        }
        return matrix;
    }

    public static void f_show_final_grades(double[][] matrix_grades) {
        //Description: This method show the final grades
        double final_grade = 0;
        for (int i = 0; i < 10; i++) {
            final_grade = matrix_grades[i][0] * 0.2 + matrix_grades[i][1] * 0.25 + matrix_grades[i][2] * 0.25 + matrix_grades[i][3] * 0.3;
            System.out.println("Student (" + (i + 1) + "), grade 1: " + matrix_grades[i][0] + ", grade 2: " + matrix_grades[i][1]
                    + ", grade 3: " + matrix_grades[i][2] + ", grade 4: " + matrix_grades[i][3] + " -> final grade: " + final_grade);
        }
    }
}