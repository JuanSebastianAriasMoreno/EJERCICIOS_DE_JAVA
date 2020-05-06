package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 29/04/2020
	  DESCRIPTION: This software asks us for a number n, and tells us how many numbers there are between 1 and n that are prime.
	 */
        f_menu();
        int number = f_user_number();
        int total_primes = 0;
        for (int i=1;i<=number;i++){
            if (f_if_primes_number(i)==true){
                total_primes++;
                System.out.println("Number "+i+" is prime.");
            }
        }
        System.out.println("The total prime is: "+total_primes);
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftPrimeN USTA 2020                    ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: This method return for a number greater than 1.
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Input a number greater than 1.");
        number = keyboard.nextInt();
        while (number <= 1) {
            System.err.println("ERROR: The number must be greater than 1.");
            System.out.println("Input again a number greater than 1.");
            number = keyboard.nextInt();
        }
        return number;
    }

    public static boolean f_if_primes_number(int number) {
        //Description: This method contain the function of n_primes.
        int count = 0, n = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
