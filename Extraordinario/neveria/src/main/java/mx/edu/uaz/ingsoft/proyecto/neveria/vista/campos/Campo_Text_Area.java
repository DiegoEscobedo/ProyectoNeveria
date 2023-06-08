package mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos;

import javax.swing.*;

public class Campo_Text_Area extends JPanel {
    private JTextArea areaListas;

    public Campo_Text_Area(JTextArea listas) {
        super();
        areaListas=listas;
        add(areaListas);

    }
}
