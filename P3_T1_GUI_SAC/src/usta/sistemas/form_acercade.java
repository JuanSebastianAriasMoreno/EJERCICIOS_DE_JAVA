package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_acercade extends JFrame {
    public form_acercade() {
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Acerca de", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel central.
        JPanel panel_central = new JPanel();
        JLabel label_maker = new JLabel("This software was make by: Juan Sebastian Arias Moreno ", SwingConstants.CENTER);
        JLabel label_maker1 = new JLabel("Juan studies in the university Santo Tomas, he studies systems engineer and he is in the first semester", SwingConstants.LEFT);
        panel_central.add(label_maker);
        panel_central.add(label_maker1);
        // Agregamos los paneles al formulario.
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        // Parametros del formulario.

        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }
}
