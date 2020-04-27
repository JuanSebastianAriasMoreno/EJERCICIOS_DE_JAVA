package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	DATE: 22/04/2020
	DESCRIPTION: This software perform an algorithm that captures the price of each product and adds it until the account reaches the maximum limit (500,000), in the end determine how many products you buy and when it was the total value you paid.
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int summatory = 0, cost_product, total_product=0;
        do {
            total_product+=1;
            System.out.println("Input the cost of the product:("+total_product+")");
            cost_product = keyboard.nextInt();
            summatory+=cost_product;
            System.out.println("The temporarily bill is: ("+summatory+")");
        }while(summatory<=500000);
        summatory-=cost_product;
        total_product-=1;
        System.out.println("The total of the bill is: "+ summatory+", and the total of the product is:"+ total_product);
    }
    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftMarket500 USTA 2020                 ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
}