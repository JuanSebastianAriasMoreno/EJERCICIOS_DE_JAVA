package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal() {
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel izquierdo.
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5, 1));
        // Creamos el primer boton.
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //
                form_estudent form_estudent1 = new form_estudent();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        // Creamos el segundo boton.
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        // Creamos el tercer boton.
        JButton boton_formulario3 = new JButton("New docent");
        boton_formulario3.setBounds(0, 0, 100, 30);
        boton_formulario3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_docent form_docent1 = new form_docent();
            }
        });
        panel_izquierdo.add(boton_formulario3);
        // Creamos el cuarto boton.
        JButton boton_formulario4 = new JButton("List all docents");
        boton_formulario4.setBounds(0, 0, 100, 30);
        boton_formulario4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_docent(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario4);
        // Creamos el quinto boton.
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setBounds(0, 0, 100, 30);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acercade form_acercade1 = new form_acercade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        // Creamos el panel inferior.
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Created by: Juan Arias Moreno"));
        // Agregar los paneles al formulario.
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);

        // Parametros generales del formularios.
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);
    }

    private void f_abrir_form_show_all_docent(java.awt.event.ActionEvent evt) {
        form_show_all_docent form_show_all_docent1 = new form_show_all_docent(this);
    }

}
