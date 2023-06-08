package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_JText_Field;

import javax.swing.*;

public class panel_JTextField extends JPanel {
    private Campo_JText_Field A;

    public panel_JTextField(JTextField t1,JTextField t2,JTextField t3,JTextField t4){
        super();
        A=new Campo_JText_Field(t1,t2,t3,t4);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(A);
    }
}
