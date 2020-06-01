package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR:JUan Sebastian Arias Moreno
	  DATE: 25/05/2020
	  DESCRIPTION: This software allow to simulate the data of a swimming competition where the four times are stored for each competitor and also determine based on all the times of the competitors who is the winner. The user must specify how many times
      (competitors) he wants to enter and the times must be generated randomly between 6.0 and 10 sec per lap.
      -Additionally, you must view all the times of each competitor.
	 */
        int total_competitors = f_menu_total_competitors();
        double[][] matrix_competition = f_fill_matrix_competition(total_competitors);
        String texto = "";
        System.out.println("------------------The times competition-------------------");
        System.out.println("Player | T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10 |");
        for (int i = 0; i < total_competitors; i++) { //Recorrer filas
            texto += "\n" + (i + 1);
            for (int j = 0; j < 10; j++) { //Recorrer columnas
                texto += " | " + matrix_competition[i][j] + " ";
            }

        }
        System.out.println(texto);
    }

    public static int f_menu_total_competitors() {
        //Description: This method shows the  menu and returns the total competitors.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSwimmingCompetition USTA 2020       ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input who many competitors do you want.");
        int total_competitors = keyboard.nextInt();
        while (total_competitors <= 0) {
            System.err.println("ERROR: The value must be greater than zero.");
            System.out.println("Input again who many competitors do you want.");
        }
        return total_competitors;
    }

    public static double[][] f_fill_matrix_competition(int total_competitors) {
        //Description: This method returns a fill matrix of times competition.
        double[][] matrix_competition = new double[total_competitors][10];
        for (int i = 0; i < total_competitors; i++) { //Para recorrer las filas.
            for (int j = 0; j < 10; j++) { //Para recorrer las columnas (timpos).
                matrix_competition[i][j] = Math.floor(Math.random() * (10 - 6) + 6);// Randomicos entre 6.0 y 10.0.
            }
        }
        return matrix_competition;
    }
}