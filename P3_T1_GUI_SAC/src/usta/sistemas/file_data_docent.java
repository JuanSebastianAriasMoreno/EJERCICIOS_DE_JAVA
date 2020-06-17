package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_docent {
    /*AUTHOR: Juan Sebastian Arias Moreno
      DATE: 09/06/2020
      DESCRIPTION: This class creates and show data of a file d:/docent.txt
     */
    public static boolean f_add_student(String p_name, String p_lastname, String p_faculty, String p_card) {
        //Description: This method create new line into a file d:/docent.txt
        boolean result;
        try {
            File myFile = new File("d:/docent.txt");
            if (myFile.exists()) {
                // Instanciamos el archivo con TRUE para agregar nuevas lineas.
                FileWriter myFile2 = new FileWriter(myFile, true);
                // Cargar la data del archivo.
                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" + p_name + "|" + p_lastname + "|" + p_faculty + "|" + p_card);
                dataMyFile.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_all_data_docent() {
        //description: This method returns all data (all lines) of file d:/docent.txt
        String[][] matrix_docent;
        String linea_texto, linea_tmp, linea_tmp2;
        int row = 0, total_lines = 0, separador1, separador2, separador3;
        try {
            File myFile = new File("d:/docent.txt");
            if (myFile.exists()) {
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();
                myFile2 = null;
                matrix_docent = new String[total_lines][4];
                myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    linea_texto = myFile2.nextLine();
                    separador1 = linea_texto.indexOf("|");
                    if (separador1 != -1) {  // Garantizamos que la linea de texto tenga datos.
                        matrix_docent[row][0] = linea_texto.substring(0, separador1);  // Solo el nombre del docente.
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_docent[row][1] = linea_tmp.substring(0, separador2);   // Solo el apellido del docente.
                        linea_tmp2 = linea_tmp.substring(separador2 + 1);
                        separador3 = linea_tmp2.indexOf("|");
                        matrix_docent[row][2] = linea_tmp2.substring(0, separador3);   // Solo la facultad del docente.
                        matrix_docent[row][3] = linea_tmp2.substring(separador3 + 1);   // Solo la identidad del docente.
                        row++;
                    }
                }
                myFile2.close();
                return matrix_docent;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
