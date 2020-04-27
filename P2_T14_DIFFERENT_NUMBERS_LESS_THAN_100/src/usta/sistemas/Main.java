package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 22/04/2020
	  DESCRIPTION: This software read from the keyboard a series of numbers until you get one lower than 100, in the end determine the sum and average of the numbers entered.
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int total_number = 0;
        double summatory = 0, average = 0, number;
        System.out.println("Input a number: ");
        number = keyboard.nextDouble();
        while (number > 100) {
            summatory = summatory + number;
            total_number += 1;
            System.out.println("Input another number: ");
            number = keyboard.nextDouble();
        }
        if (total_number != 0) {
            average = summatory / total_number;
        }
        System.out.println("The summatory of " + total_number + " is " + summatory + " and the average is " + average);
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftLess100 USTA 2020                   ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
}


