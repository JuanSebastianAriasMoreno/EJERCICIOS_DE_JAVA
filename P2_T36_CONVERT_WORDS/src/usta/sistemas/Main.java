package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 12/05/2020
	  DESCRIPTION: This software have a matrix 4x5 with certain names, and replace some letters */


    public static void main(String[] args) {
        f_menu();
        String[][] matrix_names = {{"Maria", "Pedro", "Jose", "Camilo", "Rodrigo"},
                {"Ana", "Lucia", "Martha", "Juliana", "Patricia"},
                {"Felipe", "ALEXANDER", "Soffy", "Carmen", "Augusto"},
                {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
        matrix_names = f_replace_vowels(matrix_names);
        System.out.println("--------- show matrix -----------");
        for (int i = 0; i < matrix_names.length; i++) {
            System.out.print("\n(" + (i + 1) + ") =");
            for (int c = 0; c < matrix_names[0].length; c++) {
                System.out.print(" | " + matrix_names[i][c] + " | ");
            }
        }
    }

    public static void f_menu() {
        //Description: This method show the menu of this software.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║SoftGradeStudents                       ║");
        System.out.println("║Version 1.0                             ║");
        System.out.println("║Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("This program creates a 4x5 matrix with the people names");
    }

    public static String[][] f_replace_vowels(String[][] matrix_names) {
        //Description: This method replace the vowel for alternative characters.
        for (int i = 0; i < matrix_names.length; i++) {
            for (int c = 0; c < 5; c++) {
                matrix_names[i][c] = matrix_names[i][c].toUpperCase().replace("A", "@").
                        replace("E", "3").replace("I", "1").
                        replace("O", "0").replace("U", "⌂");
            }
        }
        return matrix_names;
    }

}
