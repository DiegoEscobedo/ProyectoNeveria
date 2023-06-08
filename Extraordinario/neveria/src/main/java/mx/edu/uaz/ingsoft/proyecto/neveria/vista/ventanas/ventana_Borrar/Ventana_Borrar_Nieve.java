package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.ventana_Borrar;

import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores.AdaptarLong;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base_Borrar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController;


public class Ventana_Borrar_Nieve extends Ventana_Base_Borrar {

    private static JTextField areaT=new JTextField(20);
    private static JButton b1=new JButton("Aceptar");

    public Ventana_Borrar_Nieve() {
        super("Borrar Nieve", areaT,b1);

        ActionListener tomarTexto=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SesionController.borrar("Nieve", AdaptarLong.tranformarLONG(areaT.getText()));
            }
        };

        b1.addActionListener(tomarTexto);
    }
}
