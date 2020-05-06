package usta.sistemas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 4/05/2020
	  DESCRIPTION: This software saves the salaries of 5 employees using an arrangement (vector), where the salaries are a random value between $ 1,000,000 and $ 2,000,000,
	 */
        f_menu();
        int[] salary_of_employees = f_sueldos();
        f_show_sueldos(salary_of_employees);
    }


    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSalaries5 USTA 2020                 ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int[] f_sueldos() {
        //Description: This method returns the salaries of 5 employees
        int[] salary = new int[5]; //This var to save the salaries
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 1000000 + 1) + 1000000);
        }
        return salary;
    }

    public static void f_show_sueldos(int[] salary) {
        //Description: This method show the vector with the salary
        System.out.println("------The list of the salaries is------ ");
        for (int i = 0; i < 5; i++) {
            System.out.println("The salary of employed (" + (i + 1) + ") is : " + salary[i]);
        }
    }
}
