package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 29/03/2020
	  DESCRIPTION: This software calculates the average height of a group of 5 children
	 */
        System.out.println("----------------------------------------");
        System.out.println("                C5A");
        System.out.println("----------------------------------------");
	double average;
	int c1,c2,c3,c4,c5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This software calculates the average height of a group of 5 children, input the height of the first children in cm");
        c1 = keyboard.nextInt();
        System.out.println("Input the height of the second children in cm");
        c2 = keyboard.nextInt();
        System.out.println("Input the height of the third children in cm");
        c3 = keyboard.nextInt();
        System.out.println("Input the height of the fourth children in cm");
        c4 = keyboard.nextInt();
        System.out.println("Input the height of the five children in cm");
        c5 = keyboard.nextInt();
        average = (c1+c2+c3+c4+c5)/5;
        System.out.println("The average height of the 5 children is: "+average+ "cm");

    }
}
