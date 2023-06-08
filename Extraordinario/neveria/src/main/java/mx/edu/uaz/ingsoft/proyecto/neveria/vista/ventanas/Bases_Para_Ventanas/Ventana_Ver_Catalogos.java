package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.*;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.invocar_Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Ver_Catalogos extends Ventana_Base {

    private JPanel p1,p2,p3;
    private JPanel p2_1,p2_2,p2_3;
    private JLabel tituloV;
    private JButton bNieve,bPaletas,bSalir,bBorrar;
    private JTextArea Alista;
    private Container cristal;

    public Ventana_Ver_Catalogos(String titulo,JTextArea El,JButton bAgregar,JButton beli) {
        super(titulo, 350, 400);
        tituloV=new JLabel(titulo);
        bNieve=new JButton("Nieves");
        bPaletas=new JButton("Paletas");
        bSalir=new JButton("Salir");
        bBorrar=new JButton("Eliminar");
        Alista=new JTextArea(20,25);

        bNieve.addActionListener(invocar_Ventanas.abrirl_Catalogosnieve

        );
        bPaletas.addActionListener(invocar_Ventanas.abrir_CatalogoP);

        p1= new panel_titulo(tituloV);

        p2= generarBoxLayout(p2);

        p2_1=new panel_boton(bNieve,bPaletas);
        p2_2=new panel_TextArea(El);

        p2.add(p2_1);
        p2.add(p2_2);

        p3=new panel_boton(bAgregar,beli,bSalir);

        ActionListener cerrar_Ventana=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        };

        bPaletas.addActionListener(cerrar_Ventana);
        bNieve.addActionListener(cerrar_Ventana);
        bSalir.addActionListener(cerrar_Ventana);
        bSalir.addActionListener(invocar_Ventanas.abrir_VentanaI);

        cristal=posiciones1(cristal,p1,p2,p3);
    }
}
