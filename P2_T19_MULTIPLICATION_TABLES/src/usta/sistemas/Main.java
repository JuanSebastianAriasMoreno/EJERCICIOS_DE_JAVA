package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 27/04/2020
	  DESCRIPTION: This software build a program that prints the multiplication tables from number 1 to number 10 in the range from 1 to 10.
	 */
        f_menu();
        int user_number = f_user_number();
        while (user_number != 0) {
            f_generate_multiplication_table(user_number);
            user_number = f_user_number();
        }
        System.out.println("Thanks for use this software.");

    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftMultTables USTA 2020                  ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: This method ask for the user what multiply table want and return this number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the multiply table that you want (0 to exit): ");
        int user_numb = keyboard.nextInt();
        while (user_numb < 0 || user_numb > 99) {
            System.err.println("ERROR: You only have the multiply tables between 0 and 99.");
            System.out.println("Input again the multiply table that you want(0 to exit): ");
            user_numb = keyboard.nextInt();

        }
        return user_numb;
    }

    public static void f_generate_multiplication_table(int user_number) {
        //Description: This method show the multiplication tables.
        System.out.println("The multiplication table is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(user_number + " X " + i + " = " + user_number * i);
        }
    }
}
