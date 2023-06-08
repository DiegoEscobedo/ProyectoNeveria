package mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos;

import javax.swing.*;

public class Campo_CapturaDatos extends JPanel {
    private JLabel JL1,JL2,JL3,JL4;
    private JTextField t1,t2,t3,t4;

    public Campo_CapturaDatos(JLabel j1,JLabel j2,JLabel j3,JLabel j4,JTextField tf1,JTextField tf2,JTextField tf3,JTextField tf4) {
        super();
        JL1=j1;
        JL2=j2;
        JL3=j3;
        JL4=j4;

        t1=tf1;
        t2=tf2;
        t3=tf3;
        t4=tf4;

        add(JL1);
        add(t1);
        add(JL2);
        add(t2);
        add(JL3);
        add(t3);
        add(JL4);
        add(t4);
    }
}
