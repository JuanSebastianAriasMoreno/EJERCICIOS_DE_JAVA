package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE:15/04/2020
	  DESCRIPTION: Write two functions that allow you to calculate:
                      o The number of seconds in a given time in hours.
                      o The number of seconds in a given time in minutes.
                      o The number of hours, minutes of a given time in seconds.
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {//Convert hours to seconds
            f_convert_hours_to_seconds();
        } else if (option == 2) {//Convert minutes to seconds
            f_convert_minutes_to_seconds();
        } else {
            f_convert_seconds_to_hours_and_minutes();
        }
    }

    public static void f_menu() {
        //Description : This method show the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftConvertTime USTA 2020               ║");
        System.out.println("║ Versión 1.0                             ║");
        System.out.println("║ Creado por: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_option() {
        //Description: This method return the option
        System.out.println("Input the option of the convert: \n1-Hours to seconds.\n2-Minutes to seconds.\n3-Seconds to hours and minutes.");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) { //If option is less to one or greater than 3
            System.err.println("ERROR: This option does not exist.");
            System.out.println("Input the option of the convert: \n1-Hours to seconds.\n2-Minutes to seconds.\n3-Seconds to hours and minutes.");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_convert_hours_to_seconds() {
        //Description: Convert the number of seconds in a given time in hours.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers hours to convert: ");
        int hours = keyboard.nextInt();
        int seconds = hours * 60 * 60;
        System.out.println("The number hours : " + hours + " have " + seconds + " seconds");
    }

    public static void f_convert_minutes_to_seconds() {
        //Description: Convert the number of seconds in a given time in minutes.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the minutes to convert: ");
        int minutes = keyboard.nextInt();
        int seconds = minutes * 60;
        System.out.println("The number minutes : " + minutes + " have " + seconds + " seconds");
    }

    public static void f_convert_seconds_to_hours_and_minutes() {
        //Description: Convert seconds to hours and minutes.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the seconds to convert: ");
        int seconds = keyboard.nextInt();
        int hours = seconds*3600;
        int minutes = (seconds%3600)/60;
        System.out.println("The number seconds : "+seconds+" is same to "+hours+ " with "+minutes+ " minutes");
    }
}

