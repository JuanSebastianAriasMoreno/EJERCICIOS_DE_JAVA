package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 28/04/2020
	  DESCRIPTION: This software ask for 10 numbers. Show the mean of positive numbers, the mean of negative numbers and the number of zeros.
	 */
        f_menu();
        f_operations_numbers();
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftOperationsNumbers USTA 2020         ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static void f_operations_numbers() {
        //Description: This method asks for ten numbers.
        int summatory_positives = 0, summatory_negatives = 0, total_zero = 0, number;
        int total_positives = 0, total_negatives = 0;
        double average_positives = 0, averages_negatives = 0;
        for (int i = 1; i <= 10; i++) {
            number = f_user_number(i);
            if (number < 0) {
                summatory_negatives -= number;
                total_negatives++;
            } else if (number > 0) {
                summatory_positives += number;
                total_positives++;
            } else {
                total_zero++;
            }
        }
        if (total_positives > 0) {
            average_positives = summatory_positives / total_positives;
        }
        if (total_negatives > 0) {
            averages_negatives = summatory_negatives / total_negatives;
        }
        System.out.println("The positive average is: " + average_positives);
        System.out.println("The negative average is: " + averages_negatives);
        System.out.println("The total zero numbers is: " + total_zero);
    }

    public static int f_user_number(int i) {
        //Description: This method return a number from the user.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number " + i);
        int number = keyboard.nextInt();
        return number;
    }
}
