package mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos;

import javax.swing.*;


public class Campo_JLabel extends JPanel{
    private JLabel JL1,JL2,JL3,JL4;

    public Campo_JLabel(JLabel j1){
        super();
        JL1=j1;
        add(JL1);
    }

    public Campo_JLabel(JLabel j1,JLabel j2,JLabel j3,JLabel j4) {
        super();
        JL1=j1;
        JL2=j2;
        JL3=j3;
        JL4=j4;

        add(JL1);
        add(JL2);
        add(JL3);
        add(JL4);
    }
}
