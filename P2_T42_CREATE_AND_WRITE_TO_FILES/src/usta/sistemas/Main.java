package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 28/05/2020
	 */
        try{
            PrintWriter  admin_files = new PrintWriter("C:\\Users\\Gamer\\Documents/prueba.txt");
            admin_files.println("First line");
            admin_files.println("Second line");
            admin_files.close();
        }catch (Exception e){
            System.err.println("ERROR: The software is finish because: ");
            e.printStackTrace();
        }
    }
}
