package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE : 13/04/2020
	  DESCRIPTION: This software convert °C to °F|°F to °C|°F to °K|°K to °C|°C to °K|
	 */
        int kind_from, kind_to;
        f_menu();
        kind_from = f_kind_grades();
        if (kind_from!= 0) {
            kind_to = f_kind_to_grades(kind_from);
            if (kind_to!=0){
                f_convert(kind_from, kind_to);
            }
        }
    }
    public static void f_menu() {
        //Description : This method show the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftConvert USTA 2020                   ║");
        System.out.println("║ Versión 1.0                             ║");
        System.out.println("║ Creado por: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("Input the kind of options grades \n1-Celcius\n2-Fahrenheit\n3-Kelvin");
    }
    public static int f_kind_grades() {
        //Description: This method input the kind of grades
        Scanner keyboard = new Scanner(System.in);
        int opt= keyboard.nextInt();
        if (opt==1||opt==2||opt==3) {
            System.out.println("Started");
        } else {
            System.err.println("ERROR: The class does not exist ");
            opt=0;
        }
        return opt;
    }
    public static int f_kind_to_grades(int kind_from){
        //Description: This method return to kinds grades
        System.out.println("Input the kind of options that you like convert: \n1-Celcius\n2-fahrenheit\n3-Kelvin");
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1||opt==2||opt==3) {
            if (opt==kind_from){
                System.err.println("ERROR: the class are same");
                opt=0;
            }
        }else{
            System.err.println("The class does not exist ");
            opt=0;
        }
        return opt;
    }
    public static void f_convert(int kind_from, int kind_to){
        //Description: This method convert kind grades
        System.out.println("Input the grades");
        Scanner keyboard = new Scanner(System.in);
        int grades= keyboard.nextInt();
        double grades_convert;
        if(kind_from==1 && kind_to==2){
            grades_convert= grades*1.8+32;
            System.out.println("The celsius: "+grades + " is same grades fahrenheit: "+grades_convert);
        }else if (kind_from==1 && kind_to==3){//convert celsius to kelvin
            grades_convert=grades+273.15;
            System.out.println("The celsius: "+grades + " is same grades kelvin: "+grades_convert);
        }else if (kind_from==2 && kind_to==1){
            grades_convert= grades-32/1.8;
            System.out.println("The fahrenheit: "+grades + " is same grades celcius: "+grades_convert);
        }else if (kind_from==2 && kind_to==3){
            grades_convert= ((grades -32)*5/9)+273.15;
            System.out.println("The fahrenheit: "+grades + " is same grades Kelvin: "+grades_convert);
        }else if (kind_from==3 && kind_to==1){
            grades_convert= grades - 273.15;
            System.out.println("The kelvin: "+grades + " is same grades celcius: "+grades_convert);
        }else if (kind_from==3 && kind_to==2){
            grades_convert= ((grades-273.15)*9/5)+32;
            System.out.println("The kelvin: "+grades + " is same grades fahrenheit: "+grades_convert);
        }
    }
}


