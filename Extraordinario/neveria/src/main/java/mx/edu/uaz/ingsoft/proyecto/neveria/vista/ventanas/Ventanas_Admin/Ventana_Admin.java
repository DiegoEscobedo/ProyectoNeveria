package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventanas_Admin;

import mx.edu.uaz.ingsoft.proyecto.neveria.programas.mandarListas;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.*;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.Panel_Contenedor_Botones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.invocar_Ventanas;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana_Admin extends Ventana_Base implements ICOntenedorDeBotones {

    private JPanel pnlTitulo,pnlIzq,pnlDer,pnlCentro,pnlSur;

    private JPanel pnlIz_1,pnlIz_2,pnlCentro_1,pnlCentro_2,pnlder_1,pnlder_2;
    private JList L1,L2,L3;
    private JLabel tituloV,lNieve,lPaletas,lVentana;

    private JButton b1;

    public static final String titulo;
    public static final String[] botones;
    public static final String[] botones2;
    private static JTextArea as;
    private JTextArea as2;
    private JTextArea as3;
    public static Container cristal;
    static {
        titulo = "Ventana Del Administrador";
        botones = new String[]{
                "Agregar",
                "Borrar"
        };
        botones2 = new String[]{
                "Agregar Paleta",
                "Borrar"
        };

    }
    private Panel_Contenedor_Botones pnlBotones;
    private Panel_Contenedor_Botones pnlBotones2,pnlBotones3;
    public Ventana_Admin() {
        super(titulo, 1000, 400);

        lNieve=new JLabel(Constantes.NAME_NIEVE);
        lPaletas=new JLabel(Constantes.NAME_PALETA);
        lVentana=new JLabel(Constantes.NAME_VENTA);

        b1=new JButton(Constantes.SALIR);

        as=new JTextArea(Constantes.NUM_COLUMNAS,Constantes.NUM_COLUMNAS);
        as2=new JTextArea(Constantes.NUM_COLUMNAS,Constantes.NUM_COLUMNAS);
        as3=new JTextArea(Constantes.NUM_COLUMNAS,Constantes.NUM_COLUMNAS);
        as.setEditable(false);
        as2.setEditable(false);
        as3.setEditable(false);
        tituloV=new JLabel(titulo);
        pnlTitulo=new panel_titulo(tituloV);

        as.setText(mandarListas.mandarLisN());
        as2.setText(mandarListas.mandarLisP());
        as3.setText(mandarListas.mandarListV());

        pnlIzq=generarBoxLayout(pnlIzq);
        pnlIz_1=new panel_TextArea(as);
        pnlIz_2=new panel_JLabel(lNieve);
        pnlBotones=new Panel_Contenedor_Botones(botones);
        pnlIzq.add(pnlIz_2);
        pnlIzq.add(pnlIz_1);
        pnlIzq.add(pnlBotones);
        setActionListener(invocar_Ventanas.capturarDatosN,"Agregar");
        setActionListener(invocar_Ventanas.abrir_BorradorN,"Borrar");


        pnlCentro=generarBoxLayout(pnlCentro);
        pnlCentro_1=new panel_JLabel(lPaletas);
        pnlCentro_2=new panel_TextArea(as2);
        pnlBotones2=new Panel_Contenedor_Botones(botones);
        pnlCentro.add(pnlCentro_1);
        pnlCentro.add(pnlCentro_2);
        pnlCentro.add(pnlBotones2);
        setActionListener2(invocar_Ventanas.capturarDatosP,"Agregar");
        setActionListener2(invocar_Ventanas.abrir_BorradorP,"Borrar");


        pnlDer=generarBoxLayout(pnlDer);
        pnlder_1=new panel_JLabel(lVentana);
        pnlder_2=new panel_TextArea(as3);
        pnlBotones3=new Panel_Contenedor_Botones(botones);
        pnlDer.add(pnlder_1);
        pnlDer.add(pnlder_2);
        pnlDer.add(pnlBotones3);
        setActionListener3(invocar_Ventanas.abrir_Venta,"Agregar");
        setActionListener3(invocar_Ventanas.abrir_borrarV,"Borrar");

        pnlSur=new panel_boton(b1);

        cristal=posiciones2(cristal,pnlTitulo,pnlIzq,pnlCentro,pnlDer,pnlSur);

        ActionListener cerrarV=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Ventana_Inicio in=new Ventana_Inicio("Inicio");
                in.setVisible(true);
            }
        };

        b1.addActionListener(cerrarV);
    }

    @Override
    public void setActionListener(ActionListener action, int indiceBoton) {
        pnlBotones.setActionListener(action,indiceBoton);
    }

    @Override
    public void setActionListener(ActionListener action, String nombreBoton) {
        pnlBotones.setActionListener(action,nombreBoton);
    }


    public void setActionListener2(ActionListener action, String nombreBoton) {
        pnlBotones2.setActionListener(action,nombreBoton);
    }

    public void setActionListener3(ActionListener action, String nombreBoton) {
        pnlBotones3.setActionListener(action,nombreBoton);
    }
}
