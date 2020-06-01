package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 07/05/2020
	  DESCRIPTION: Determinate who is skinny or fat in N men */
        int total_people = f_menu_total_people();
        double[] vector_weights = f_fill_vector_weights(total_people);
        f_show_malnourished(vector_weights);
        f_show_skinny(vector_weights);
        f_show_fat(vector_weights);
        f_show_all_weights(vector_weights);
    }

    public static int f_menu_total_people() {
        //This method shows the menu of this software.
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║SoftSkinnyOrFat                         ║");
        System.out.println("║Version 1.0                             ║");
        System.out.println("║Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Input the total people. ");
        Scanner keyboard = new Scanner(System.in);
        int total_number = keyboard.nextInt();
        while (total_number <= 0) {
            System.err.println("ERROR: The value cannot be less than zero.");
            System.out.println("Input again the total people.");
            total_number = keyboard.nextInt();
        }
        return total_number;
    }

    public static double[] f_fill_vector_weights(int total_people) {
        //Description: This method return the N vec weights
        double[] vector_weights = new double[total_people];
        for (int i = 0; i < total_people; i++) {
            vector_weights[i] = (Math.random() * (120 - 21) + 20);
        }
        return vector_weights;
    }

    public static void f_show_malnourished(double[] vector_weights) {
        //Description: This method show the total people are malnourished
        int total_malnourished = 0;
        for (double weight : vector_weights) {
            if (weight < 40) {
                total_malnourished++;
            }
        }
        System.out.println("The total of malnourished people is: " + total_malnourished);
    }

    public static void f_show_skinny(double[] vector_weights) {
        //Description: This method show the total people are skinny
        int total_skinny = 0;
        for (double weight : vector_weights) {
            if (weight >= 40 && weight < 70) {
                total_skinny++;
            }
        }
        System.out.println("The total of skinny people is: " + total_skinny);
    }

    public static void f_show_fat(double[] vector_weights) {
        //Description: This method show the total people are fat
        int total_fat = 0;
        for (double weight : vector_weights) {
            if (weight >= 70) {
                total_fat++;
            }
        }
        System.out.println("The total of fat people is: " + total_fat);
    }

    public static void f_show_all_weights(double[] vector_weights) {
        //Description: This method show all weight
        for (int i = 0; i < vector_weights.length; i++) {
            System.out.println("The weight of the person ( " + (i + 1) + " ) is: " + vector_weights[i]);
        }

    }
}
