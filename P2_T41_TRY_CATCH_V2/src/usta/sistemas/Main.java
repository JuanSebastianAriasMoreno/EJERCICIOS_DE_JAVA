package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 28/05/2020
	  DESCRIPTION:
	 */
        boolean b_function = false;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input the total people.");
                int total_people = keyboard.nextInt();
                b_function = true;
            } catch (Exception e) {
                System.err.println("ERROR: This software allow only numbers.");
            }

        } while (b_function == false);
    }
}
