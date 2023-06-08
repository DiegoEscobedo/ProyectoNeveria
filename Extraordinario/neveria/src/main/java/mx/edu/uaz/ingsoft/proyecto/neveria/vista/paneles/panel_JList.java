package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_JList;

import javax.swing.*;

public class panel_JList extends JPanel {

    private Campo_JList E;

    public panel_JList(JList e) {
        super();
        E=new Campo_JList(e);
        add(E);
    }
}
