package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 28/04/2020
	  DESCRIPTION: This software counts the number of digits of a number entered by keyboard.
	 */
        f_menu();
        int total_digits = 0;
        int number = f_user_number();
        if (number != 0) {
            while (number != 0) {
                number = number / 10;
                total_digits++;
            }
        } else {
            total_digits = 1;
        }

        System.out.println("The total digits of the number is " + total_digits);
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftCountDigits USTA 2020               ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: This method return the user number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number.");
        int number = keyboard.nextInt();
        return number;
    }
}
