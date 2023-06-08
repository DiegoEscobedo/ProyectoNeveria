package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana_Base_Borrar extends Ventana_Base {
    private JPanel p1,p2,p3;
    private JButton bAceptar,bCancelar;
    private JLabel ltexto;
    private Container cristal;

    public Ventana_Base_Borrar(String titulo,JTextField idABorrar,JButton bA){
        super(titulo,350,150);
        ltexto= new JLabel("ID= ");
        bAceptar=new JButton("Aceptar");
        bCancelar=new JButton("Cancelar");

        p1=new JPanel();
        p1.add(ltexto);
        p1.add(idABorrar);

        p2=new JPanel();
        p2.add(bA);
        p2.add(bCancelar);

        p3=new JPanel();

        cristal=posiciones1(cristal,p1,p2,p3);

        ActionListener cerrarV=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        };

        bCancelar.addActionListener(cerrarV);


    }
}
