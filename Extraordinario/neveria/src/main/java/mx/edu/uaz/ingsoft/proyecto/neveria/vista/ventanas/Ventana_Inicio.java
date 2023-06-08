package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_titulo;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventanas_Admin.Ventana_Admin;

public class Ventana_Inicio extends Ventana_Base {

    private JPanel p1,p2,p2_1,p2_2,p2_3,p3;
    private JLabel tituloV;
    private  JButton Bventa,Bproductos, Badmin;
    private Container cristal;

    public Ventana_Inicio(String titulo) {
        super(titulo, 250, 200);

        tituloV=new JLabel("Principal");

        p1=new panel_titulo(tituloV);


        p2=generarBoxLayout(p2);
        Bventa=new JButton("Venta");
        Bproductos=new JButton("Catalogos");
        Badmin=new JButton("Admin");

        p2_1=new JPanel();
        p2_1.add(Bventa);

        p2_2=new JPanel();
        p2_2.add(Bproductos);

        p2_3=new JPanel();
        p2_3.add(Badmin);

        p2.add(p2_1);
        p2.add(p2_2);
        p2.add(p2_3);

        p3=new JPanel();

        ActionListener abrir_Catalogos=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_SeleccionCatalogos cat=new Ventana_SeleccionCatalogos("Seleccionar Catalogo");
                cat.setVisible(true);
                setVisible(false);
            }
        };


        Bproductos.addActionListener(abrir_Catalogos);
        Bventa.addActionListener(e -> {
            Ventana_Venta VnV = new Ventana_Venta();
            VnV.setVisible(true);
            setVisible(false);}
        );
        Badmin.addActionListener(e -> {
            Ventana_Admin VnA = new Ventana_Admin();
            VnA.setVisible(true);
            setVisible(false);}
        );
        cristal=posiciones1(cristal,p1,p2,p3);

    }
}
