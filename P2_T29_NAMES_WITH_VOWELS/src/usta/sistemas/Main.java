package usta.sistemas;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
      DATE: 6/05/2020
      DESCRIPTION: This software ask N number of people's names and determine how may names have the letter "a" and how many have the letter "e"
	 */
        int Total_person = f_menu_total_person();
        String[] vector_names = f_fill_vector(Total_person);
        f_show_letter_a(vector_names);
        f_show_letter_e(vector_names);
    }

    public static int f_menu_total_person() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftAskNamesPeopleN USTA 2020           ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input the total person do you need.");
        Scanner keyboard = new Scanner(System.in);
        int total_person = keyboard.nextInt();
        while (total_person < 0) {
            System.err.println("ERROR: The total person must be greater than zero.");
            System.out.println("Input again the total person do you need");
            total_person = keyboard.nextInt();
        }
        return total_person;
    }

    public static String[] f_fill_vector(int total_person) {
        //DESCRIPTION: This method return a fill vector
        String[] vector_names = new String[total_person];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < total_person; i++) {
            System.out.println("Input the name by person. " + (i + 1));
            vector_names[i] = keyboard.nextLine();
        }
        return vector_names;

    }

    public static void f_show_letter_a(String[] vector_name) {
        //DESCRIPTION: This method counts the names that have the letter a
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i++) {
            if (vector_name[i].indexOf("a") >= 0) {
                total_words++;
            }
        }
        System.out.println("The total letters a are: " + total_words);
    }

    public static void f_show_letter_e(String[] vector_name) {
        //DESCRIPTION: This method counts the names that have the letter e
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i++) {
            if (vector_name[i].indexOf("e") >= 0) {
                total_words++;
            }
        }
        System.out.println("The total letters e are: " + total_words);
    }
}
