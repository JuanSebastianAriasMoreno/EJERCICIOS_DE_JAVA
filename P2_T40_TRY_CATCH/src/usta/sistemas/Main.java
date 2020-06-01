package usta.sistemas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 28/05/2020
	  DESCRIPTION:
	 */
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the first number.");
            int number1 = keyboard.nextInt();
            System.out.println("Input the second number.");
            int number2 = keyboard.nextInt();
            int number3 = number1 + number2;
            System.out.println("The sum is: " + number3);
        } catch (Exception e) {
            System.err.println("ERROR: The software allow only number not words (public static void main): " + e.toString());
        }
    }
}
