package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form_docent extends JFrame {

    JTextField text_name, text_lastname, text_faculty, text_card;

    public form_docent() {
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("New docent", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel central.
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(6, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("LastName: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        panel_central.add(new JLabel("Identification card: "));
        panel_central.add(text_card = new JTextField(""));

        // Panel inferior.
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_crear_nuevo_docente(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);

        // Agregar paneles al formulario.
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);


    }

    public void f_crear_nuevo_docente(java.awt.event.ActionEvent evt) {
        // Description: This method saves the data into file.
        final JDialog ventana_emergente = new JDialog(this, "Save data", true);
        if (text_name.getText().length() < 3 ||
                text_lastname.getText().length() < 3 ||
                text_card.getText().length() < 3 ||
                text_faculty.getText().length() < 3) {
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo 3 caracteres exepto la tarjeta de identificacion, esa debe tener minimo 7 caracteres."));
        } else {
            // Grabaremos en un archivo.
            file_data_docent file_data_docent1 = new file_data_docent();
            boolean rpta = file_data_docent1.f_add_student(text_name.getText(), text_lastname.getText(), text_faculty.getText(), text_card.getText());
            if (rpta == true) {
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
                text_card.setText("");
            } else {
                ventana_emergente.add(new JLabel("Los datos NO se pueden guardar en el archivo d:/docent.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }

}
