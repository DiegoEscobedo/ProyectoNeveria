package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.campos.Campo_CapturaDatos;

import javax.swing.*;

public class panel_CapturaDatos extends JPanel{
private Campo_CapturaDatos G;
private String tSabor,tTamaño,tTipo,tPrecio;

    public panel_CapturaDatos(JLabel j1, JLabel j2, JLabel j3, JLabel j4, JTextField t1, JTextField t2, JTextField t3, JTextField t4) {
        super();
        G=new Campo_CapturaDatos(j1,j2,j3,j4,t1,t2,t3,t4);
        add(G);
    }

    public String recuperarSabor(JTextField t1, JTextField t2, JTextField t3, JTextField t4){
        tSabor=t1.getText();
        tTamaño=t2.getText();
        tTipo=t3.getText();
        tPrecio=t4.getText();
        return(tSabor);
    }
    public String recuperarTamaño(JTextField t2){
        tTamaño=t2.getText();
        return tTamaño;
    }
}
