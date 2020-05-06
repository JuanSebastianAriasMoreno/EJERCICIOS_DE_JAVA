package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 4/05/2020
	  DESCRIPTION: This software allows storing the salaries of the employees grouped by shift. With such information:
	  	  -Print the expenses of each employee per shift.
	  	  -Total salary paid on each shift.
	  	  -Total salary paid in both shifts
	 */
        f_menu();
        int[] turn_morning = f_salary_turn();//This vector is by turn of morning (8 employees)
        int[] turn_afternoon = f_salary_turn();//This vector is by turn of afternoon (8 employees)
        int salary_total_morning = f_show_salary_morning(turn_morning);
        int salary_total_afternoon = f_show_salary_afternoon(turn_afternoon);
        System.out.println("The total salary (morning + afternoon)= " + (salary_total_afternoon + salary_total_morning));
    }

    public static void f_menu() {
        //Description: This method shows the menu of this software.
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftSalaryTwoTurns USTA 2020            ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int[] f_salary_turn() {
        //Description: This method returns the salary of 8 employees
        int[] salary = new int[8];
        for (int i = 0; i < 8; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 980658) + 980658);
        }
        return salary;
    }

    public static int f_show_salary_morning(int[] turn_morning) {
        //Description: This method show the salary by turn morning
        System.out.println("------Turn of morning-------");
        int total_salary = 0;
        for (int i = 0; i < 8; i++) {
            total_salary += turn_morning[i];
            System.out.println("The salary of employed (" + (i + 1) + ") : " + turn_morning[i]);
        }
        System.out.println("The total salary by turn morning is: " + total_salary);
        return total_salary;
    }

    public static int f_show_salary_afternoon(int[] turn_afternoon) {
        //Description: This method show the salary by turn afternoon
        System.out.println("------Turn of afternoon-------");
        int total_salary = 0;
        for (int i = 0; i < 8; i++) {
            total_salary += turn_afternoon[i];
            System.out.println("The salary of employed (" + (i + 1) + ") : " + turn_afternoon[i]);
        }
        System.out.println("The total salary by turn morning is: " + total_salary);
        return total_salary;
    }
}
