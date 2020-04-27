package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 21/04/2020
	  DESCRIPTION: This software calculates the average salary, total salary and highest salary of N employees, where salary = (salary / 30) * working_days.
	 	 */
        f_menu();
        int N = f_number_employers();
        double highest_salary = 0, total_salary = 0, average_salary = 0, salary_employed;
        for (int i = 1; i <= N; i = i + 1) {
            salary_employed = f_salary(i);
            total_salary = total_salary + salary_employed;
            if (highest_salary < salary_employed) {
                highest_salary = salary_employed;
            }
        }
        average_salary=total_salary/N;
        System.out.println("The total salary is: "+total_salary+" the average salary is: "+average_salary+" and the highest salary is: "+highest_salary);
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSalaryN USTA 2020                   ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_number_employers() {
        //Description: This method return the numbers of employers
        Scanner keyboard = new Scanner(System.in);
        int employes;
        do {
            System.out.println("Input the total employers (input more than 1 employer).");
            employes = keyboard.nextInt();
        } while (employes < 1);
        return employes;
    }

    public static double f_salary(int i) {
        //Description: This method return the salary of one employed.
        Scanner keyboard = new Scanner(System.in);
        double sueldo, diasT, salary;
        do {
            System.out.println("Input the wages (must be more than zero): ");
            sueldo = keyboard.nextDouble();
        } while (sueldo < 1);
        do {
            System.out.println("Input the days worked (the value must be between 1 and 30).");
            diasT = keyboard.nextDouble();
        } while (diasT < 1 || diasT > 30);
        salary = (sueldo / 30) * diasT;
        return salary;
    }
}
