package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_titulo;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.invocar_Ventanas;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_SeleccionCatalogos extends Ventana_Base {

    private JPanel p1,p2,p3;
    private JPanel p2_1,p2_2,p2_3;
    private JButton BNieve,BPaleta,BVentas;
    private JLabel tutiloV;
    private Container cristal;

    public Ventana_SeleccionCatalogos(String titulo) {
        super(titulo, 350, 150);
        tutiloV=new JLabel("Seleccion Del Catalogo");
        BNieve=new JButton("Nieves");
        BPaleta=new JButton("Paletas");
        BVentas=new JButton("");

        p1= new panel_titulo(tutiloV);

        p2=generarBoxLayoutX(p2);
        p2_1=new JPanel();


        p2_2=new JPanel();
        p2_2.add(BNieve);
        p2_2.add(BPaleta);
        p2_2.add(BVentas);

        p2_3=new JPanel();

        p2.add(p2_1);
        p2.add(p2_2);
        p2.add(p2_3);

        p3=new JPanel();

        ActionListener cerrar_Ventana=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        };


        BNieve.addActionListener(invocar_Ventanas.abrirl_Catalogosnieve);
        BNieve.addActionListener(cerrar_Ventana);
        BPaleta.addActionListener(invocar_Ventanas.abrir_CatalogoP);
        BPaleta.addActionListener(cerrar_Ventana);

        cristal=posiciones1(cristal,p1,p2,p3);
    }

}
