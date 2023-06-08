package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.ventana_Borrar;

import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores.AdaptarLong;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base_Borrar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Borrar_Ventas extends Ventana_Base_Borrar {
    private static JTextField area1=new JTextField(20);
    private static JButton b1=new JButton("Aceptar");

    public Ventana_Borrar_Ventas() {
        super("Borrar Venta", area1, b1);

        ActionListener eliminarVentana=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SesionController.borrar("Venta", AdaptarLong.tranformarLONG(area1.getText()));
            }
        };
        b1.addActionListener(eliminarVentana);
    }
}
