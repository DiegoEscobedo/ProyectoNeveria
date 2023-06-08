package mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos;

import javax.swing.*;

public class CampoBoton extends JPanel{
    private JButton Boton;
    private JButton Boton2,Boton3,Boton4;

    public CampoBoton(JButton boton1) {
        super();
        Boton=boton1;
        add(Boton);
    }

    public CampoBoton(JButton boton1,JButton boton2) {
        super();
        Boton=boton1;
        Boton2=boton2;
        add(Boton);
        add(Boton2);
    }

    public CampoBoton(JButton boton1, JButton boton2, JButton boton3) {
        super();
        Boton=boton1;
        Boton2=boton2;
        Boton3=boton3;
        add(Boton);
        add(Boton2);
        add(Boton3);
    }
}
