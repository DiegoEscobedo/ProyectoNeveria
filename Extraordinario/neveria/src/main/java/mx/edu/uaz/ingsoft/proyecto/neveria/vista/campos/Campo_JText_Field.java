package mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos;

import javax.swing.*;

public class Campo_JText_Field extends JPanel {
    private JTextField t1,t2,t3,t4;

    public Campo_JText_Field(JTextField tf1,JTextField tf2,JTextField tf3,JTextField tf4) {
        super();
        t1=tf1;
        t2=tf2;
        t3=tf3;
        t4=tf4;

        add(t1);
        add(t2);
        add(t3);
        add(t4);
    }
}
