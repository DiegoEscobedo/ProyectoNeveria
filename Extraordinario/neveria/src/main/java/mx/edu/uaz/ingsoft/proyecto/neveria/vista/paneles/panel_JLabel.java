package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_JLabel;

import javax.swing.*;

public class panel_JLabel extends JPanel {
    private Campo_JLabel Gi;
    public panel_JLabel(JLabel j1,JLabel j2,JLabel j3,JLabel j4){
        super();
        Gi=new Campo_JLabel(j1,j2,j3,j4);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(Gi);
    }

    public panel_JLabel(JLabel j1) {
        super();
        Gi=new Campo_JLabel(j1);
        add(Gi);
    }
}
