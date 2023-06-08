package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.CampoBoton;

import javax.swing.*;

public class panel_boton extends JPanel {
    private CampoBoton B;

    public panel_boton(JButton b1){
        super();
        B=new CampoBoton(b1);
        add(B);
    }

    public panel_boton(JButton b1,JButton b2){
        super();
        B=new CampoBoton(b1,b2);
        add(B);
    }

    public panel_boton(JButton b1,JButton b2,JButton b3){
        super();
        B=new CampoBoton(b1,b2,b3);
        add(B);
    }
}
