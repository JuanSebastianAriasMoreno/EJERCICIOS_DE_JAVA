package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 21/04/2020
	  DESCRIPTION: This software calculates gross value and total value = gross value + VAT (19%) for N products.
	 */
        f_menu();
        int N = f_total_products();
        double total_bill = 0;
        for (int i = 1; i <= N; i = i + 1) {
            total_bill = total_bill + f_value_product(i);
        }
        System.out.println("The total bill is: " + total_bill);
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftBillMarkN USTA 2020                 ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_total_products() {
        //Description: This method return the number of total products.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of products: ");
        int total_products = keyboard.nextInt();
        while (total_products < 1) {
            System.err.println("ERROR: The total of the products must be greater than one.");
            System.out.println("Input again the number of products: ");
            total_products = keyboard.nextInt();
        }
        return total_products;
    }

    public static double f_value_product(int i) {
        //Description: This method return the value total of the product.
        System.out.println("Input the value of product (" + i + "): ");
        Scanner keyboard = new Scanner(System.in);
        double value_product = keyboard.nextDouble();
        while (value_product <= 0) {
            System.err.println("ERROR: The value of product must be greater than zero.");
            System.out.println("Input again the value of product (" + i + "): ");
            value_product = keyboard.nextDouble();
        }
        if (value_product > 1000) {
            value_product = value_product * 1.19;
        }
        return value_product;
    }
}
