package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_JLabel;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_TextArea;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.Panel_Contenedor_Botones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.VentaControlador.*;

public class Ventana_Venta_Ticket extends Ventana_Base implements ICOntenedorDeBotones {
    public JPanel p1,p2,p3;
    public JPanel p3_1,p3_2;
    public JLabel tituloV,precioTotal;
    public static JTextArea taTicket;

    public Container cristal;
    public static final String[] botones;
    public static final String titulo;
    private Panel_Contenedor_Botones pnlBotones;
    static {
        titulo = "TICKET";
        botones = new String[]{
                "Salir"
        };
    }

    public Ventana_Venta_Ticket() {
        super("Ticket", 300, 400);
        tituloV=new JLabel("Ticket");
        precioTotal=new JLabel("");
        taTicket=new JTextArea(20,20);

        p1=new panel_JLabel(tituloV);

        p2=new panel_TextArea(taTicket);
        taTicket.setEditable(false);

        p3=generarBoxLayout(p3);

        p3_1=new panel_JLabel(precioTotal);
        pnlBotones=new Panel_Contenedor_Botones(botones);

        p3.add(p3_1);
        p3.add(pnlBotones);

        cristal=posiciones1(cristal,p1,p2,p3);

        ActionListener SAlir  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                VolveraInicio();
            }
        };
        setActionListener(SAlir, "Salir");
    }

    @Override
    public void setActionListener(ActionListener action, int indiceBoton) {
        pnlBotones.setActionListener(action,indiceBoton);
    }
    @Override
    public void setActionListener(ActionListener action, String nombreBoton) {
        pnlBotones.setActionListener(action, nombreBoton);
    }
}
