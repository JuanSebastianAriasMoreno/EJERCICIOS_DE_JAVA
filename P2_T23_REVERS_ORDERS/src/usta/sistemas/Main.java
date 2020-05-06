package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 29/04/2020
	  DESCRIPTION: This software read 5 numbers and show them in reverse order to the one entered.
	 */
        f_menu();
        f_number_user();;
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftReversOrder USTA 2020               ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static void f_number_user() {
        //Description: This method return a number
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        double average;
        System.out.println("Input a number 1.");
        num1 = keyboard.nextInt();
        System.out.println("Input a number 2.");
        num2 = keyboard.nextInt();
        System.out.println("Input a number 3.");
        num3 = keyboard.nextInt();
        System.out.println("Input a number 4.");
        num4 = keyboard.nextInt();
        System.out.println("Input a number 5.");
        num5 = keyboard.nextInt();
        System.out.println("The inverted numbers are: " + num5 + ", " + num4 + ", " + num3 + ", " + num2 + ", " + num1);
        average = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("The average of the five numbers is: " + average);
    }
}
