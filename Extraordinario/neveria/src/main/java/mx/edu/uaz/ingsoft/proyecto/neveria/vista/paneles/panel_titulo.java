package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_Titulo;

import javax.swing.*;


public class panel_titulo extends JPanel {
    private Campo_Titulo ti;

    public panel_titulo(JLabel tituloo) {
        super();
        ti=new Campo_Titulo(tituloo);
        add(ti);
        //setBackground(Color.red);
    }
}
