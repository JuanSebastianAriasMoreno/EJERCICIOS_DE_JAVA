package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 23/04/2020
	  DESCRIPTION: This software records the times of each lap of training and determines the best lap, the average and the number of laps per training (the laps will be until the athlete gets tired / exhausted)
	 */
        int total_laps = 0;
        double best_lap = 0, average, time_lap, summatory_time = 0;
        f_menu();
        while (f_continue() == true) {
            total_laps += 1;
            time_lap = f_value_lap(total_laps);
            summatory_time += time_lap;
            if (total_laps == 1) {
                best_lap = time_lap;
            }
            if (time_lap < best_lap) {
                best_lap = time_lap;

            }
        }
        average = summatory_time / total_laps;
        System.out.println("The best lap: " + best_lap + ", total laps: " + total_laps + ", average time: " + average);
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSportTime USTA 2020                 ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static boolean f_continue() {
        //Description: This method returns one boolean value true/false
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to continue the training (true/false):");
        boolean rpta = keyboard.nextBoolean();
        return rpta;
    }

    public static double f_value_lap(int lap) {
        //Description: This method return the time of a lap.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the time (" + lap + ") lap (seconds): ");
        double time = keyboard.nextDouble();
        while (time < 1) {
            System.err.println("ERROR: The time must be greater than one. ");
            System.out.println("Input again  the time (" + lap + ") lap (seconds): ");
            time = keyboard.nextDouble();
        }
        return time;
    }
}