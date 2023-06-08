package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_Text_Area;

import javax.swing.*;

public class panel_TextArea extends JPanel {
    private Campo_Text_Area G;

    public panel_TextArea(JTextArea areaTexto) {
        super();
        G=new Campo_Text_Area(areaTexto);
        add(G);

    }
}
