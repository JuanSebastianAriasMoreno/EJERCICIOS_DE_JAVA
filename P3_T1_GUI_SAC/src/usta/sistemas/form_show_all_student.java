package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_student extends JDialog {
    /*AUTHOR: Juan Sebastian Arias Moreno
      DATE: 09/06/2020
      DESCRIPTION: This class show all data of file d:/students.txt
    */
    public form_show_all_student(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of Students", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel central.
        String[] columnsNames = {"Name", "Lastname", "Faculty"};
        file_data_student file_data_student1 = new file_data_student();
        JTable tabla_datos = new JTable(file_data_student1.f_all_data_students(), columnsNames);
        tabla_datos.setBounds(10, 50, 590, 300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        // Añadimos los dos paneles al formulario.
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        // Parametros generales del formulario.
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // Modal

    }
}
