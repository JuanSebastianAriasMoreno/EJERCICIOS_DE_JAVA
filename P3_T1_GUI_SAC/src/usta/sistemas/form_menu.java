package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    // This is constructor

    public form_menu() {
        // Etiqueta de nombre del software.
        JLabel label_menu = new JLabel("SAC versión JAVA", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 30));
        label_menu.setBounds(0, 10, 600, 50);
        add(label_menu);
        // Etiqueta de quien lo creo.
        JLabel label_maker = new JLabel("Created by: Juan Arias Moreno", SwingConstants.LEFT);
        label_maker.setBounds(5, 300, 590, 20);
        add(label_maker);
        JButton boton_iniciar = new JButton("Iniciar");
        boton_iniciar.setBounds(250, 200, 100, 50);
        // Crearle una acción para cuando le de clic.
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Crear una instancia del formulario principal.
                form_principal form_principal1 = new form_principal();
            }
        });
        add(boton_iniciar);
        // Propiedades del formulario.
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
