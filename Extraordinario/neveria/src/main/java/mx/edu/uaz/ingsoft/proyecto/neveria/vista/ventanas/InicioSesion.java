package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas;

import javax.swing.*;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController.ControladorSesiones;

public class InicioSesion extends JFrame {
    static JTextField userText = new JTextField(20);
    static JPasswordField passwordText = new JPasswordField(20);


    public InicioSesion(){
        setVisible(true);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents();
    }

    private void placeComponents() {
        setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);


        userText.setBounds(100, 10, 160, 25);
        add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        add(passwordLabel);


        passwordText.setBounds(100, 40, 160, 25);
        add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        add(loginButton);
        
        loginButton.addActionListener(e -> {
            ControladorSesiones();
            setVisible(false);
        });
    }
    public static String getUser(){
        return userText.getText();
    }
    public static String getPass(){
        return String.valueOf(passwordText.getPassword());
    }


}
