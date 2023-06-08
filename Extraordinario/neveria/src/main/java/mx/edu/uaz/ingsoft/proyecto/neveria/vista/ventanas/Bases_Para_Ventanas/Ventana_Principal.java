package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas;

import javax.swing.*;
import java.awt.*;

public class Ventana_Principal extends JFrame {
    public Ventana_Principal(String titulo,int ancho,int largo){
        super();
        setTitle(titulo);
        setSize(ancho,largo);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public JPanel generarBoxLayout(JPanel J){
        J=new JPanel();
        J.setLayout(new BoxLayout(J,BoxLayout.PAGE_AXIS));
        return J;
    }

    public JPanel generarBoxLayoutX(JPanel J){
        J=new JPanel();
        J.setLayout(new BoxLayout(J,BoxLayout.X_AXIS));
        return J;
    }

    public Container posiciones1(Container cristal, JPanel pn1, JPanel pn2, JPanel pn3){
        cristal=getContentPane();
        cristal.add(pn1,BorderLayout.NORTH);
        cristal.add(pn2,BorderLayout.CENTER);
        cristal.add(pn3,BorderLayout.SOUTH);
        return cristal;
    }
}
