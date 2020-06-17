package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_docent extends JDialog {
    /*AUTHOR: Juan Sebastian Arias Moreno
      DATE: 09/06/2020
      DESCRIPTION: This class show all data of file d:/docents.txt
    */
    public form_show_all_docent(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of docents", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel central.
        String[] columnsNames = {"Name", "Lastname", "Faculty", "Identification"};
        file_data_docent file_data_docent1 = new file_data_docent();
        JTable tabla_datos = new JTable(file_data_docent1.f_all_data_docent(), columnsNames);
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
