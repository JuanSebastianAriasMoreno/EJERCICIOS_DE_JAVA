package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 21/04/2020
	  DESCRIPTION: This software determines the total saved per person in N months.
	 */
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        int N = f_total_months();
        int total_saved = 0, average_saved = 0, money_saved;
        for (int i = 1; i <= N; i = i + 1) {
            do {
                System.out.println("Input the money the " + i + " month (the values must be greater than zero)");
                money_saved = keyboard.nextInt();
            } while (money_saved < 0);
            total_saved = total_saved + money_saved;
        }
        average_saved = total_saved / N;
        System.out.println("The total saved money is: " + total_saved + " and the average is: " + average_saved);
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSavedN USTA 2020                    ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_total_months() {
        //Description: This method return the total months
        Scanner keyboard = new Scanner(System.in);
        int N_months;
        do {
            System.out.println("Input the total months (the value must be greater than zero): ");
            N_months = keyboard.nextInt();
        } while (N_months < 1);
        return N_months;
    }
}