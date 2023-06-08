package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.CampoConboBox;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_JLabel;

import javax.swing.*;

public class panel_ComboBox extends JPanel {
    public CampoConboBox combo;
    public Campo_JLabel tx;

    public panel_ComboBox(JComboBox comboo,JLabel dato) {
        super();
        tx=new Campo_JLabel(dato);
        combo=new CampoConboBox(comboo);
        add(tx);
        add(combo);
    }
}
