package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 27/04/2020
	  DESCRIPTION: This software generates a random number from 1 to 100 is required. An assistant will say a number, if it is equal to the random number you are informed that you have won, otherwise change the assistant with a new number until the winning number is found.
	 */
        f_menu();
        int random_number = f_random_number();
        int number_user = f_input();
        int attempts = 5;
        while (number_user != random_number && attempts > 1) {
            attempts--;
            System.err.println("The number is different than the generated number ( Attempts = " + attempts + ")");
            number_user = f_input();
        }
        if (attempts > 1) {
            System.out.println("Congratulations you win a Olimpo hamburger with the number " + random_number);
        } else {
            System.out.println("Sorry, you lost, the random number was " + random_number);
        }
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftRandomBurgers USTA 2020             ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_random_number() {
        //Description: This method create a aleatory number.
        int number = (int) Math.floor(Math.random() * 100 + 1);
        if (number < 50) {
            System.out.println("Hint 1: The number is minor than 50.");
        } else {
            System.out.println("Hint 1: The number is greater than 50.");
        }
        if (number % 2 == 0) {
            System.out.println("Hint 2: The number is pair.");
        } else {
            System.out.println("Hint 2: The number is odd.");
        }
        return number;
    }

    public static int f_input() {
        //Description: This method ask the user for the number.
        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.println("Input the number (0 - 100).");
        input = keyboard.nextInt();
        while (input < 0 || input > 100) {
            System.err.println("ERROR: The number must be between 0 and 100");
            input = keyboard.nextInt();
        }
        return input;
    }
}
