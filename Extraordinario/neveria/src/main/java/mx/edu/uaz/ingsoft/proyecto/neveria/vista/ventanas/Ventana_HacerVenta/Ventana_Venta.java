package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_TextArea;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_titulo;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.Panel_Contenedor_Botones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Base;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.panel_ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.VentaControlador.*;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoNieves;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoPaletas;
import static mx.edu.uaz.ingsoft.proyecto.neveria.servicios.Ticket.llenarTicket;

public class Ventana_Venta extends Ventana_Base implements ICOntenedorDeBotones {
    private JPanel p1,p2,p3;
    private JPanel p2_1,p2_2;
    private JPanel p2_1_1,p2_1_2,p2_1_3,p2_1_4;
    private JLabel tituloV,lProducto,lSabor,lTamaño,lTipo;

    public static JTextArea ta1;

    public static JComboBox<String> c1;
    public static JComboBox<String> c2;
    public static JComboBox<String> c3;
    public static JComboBox<String> c4;

    private JButton Actualizar;

    public static final String[] botones;
    public static final String titulo;
    Container cristal;
    private Panel_Contenedor_Botones pnlBotones;
    static {
        titulo = "Captura de Nieve";
        botones = new String[]{
                "Añadir",
                "Finalizar",
        };
    }

    public Ventana_Venta() {
        super(titulo, 500, 500);

        Actualizar = new JButton("Actualizar listas");
        lProducto=new JLabel("Producto");
        lSabor=new JLabel("Sabor");
        lTamaño=new JLabel("Tamaño");
        lTipo=new JLabel("Tipo");

        ta1=new JTextArea(20,20);

        c1=new JComboBox<>();
        c3=new JComboBox<>();
        c2=new JComboBox<>();
        c4=new JComboBox<>();

        tituloV=new JLabel(titulo);
        p1=new panel_titulo(tituloV);

        p2=generarBoxLayout(p2);

        p2_1=generarBoxLayoutX(p2_1);

        c1.addItem("Paleta");
        c1.addItem("Nieve");


        p2_1_1= new panel_ComboBox(c1,lProducto);
        p2_1_2= new panel_ComboBox(c2,lSabor);
        p2_1_3= new panel_ComboBox(c3,lTamaño);
        p2_1_4= new panel_ComboBox(c4,lTipo);

        p2_1.add(p2_1_1);
        p2_1.add(p2_1_2);
        p2_1.add(p2_1_3);
        p2_1.add(p2_1_4);

        pnlBotones=new Panel_Contenedor_Botones(botones);

        p2.add(p2_1);
        p2.add(pnlBotones);
        p2_1_1.add(Actualizar);

        ActionListener Actualize = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent x) {
                añadiropciones();            }
        };
        Actualizar.addActionListener(Actualize);

        ta1.setEditable(false);

        ActionListener AñadiraText  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuardarProducto();
            }
        };
        setActionListener(AñadiraText, "Añadir");

        ActionListener Fin  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                setVentaid();
                setContador();
                mostrarVentana();
                llenarTicket();
                setVisible(false);
            }
        };
        setActionListener(Fin, "Finalizar");

        p3=new panel_TextArea(ta1);

        cristal=posiciones1(cristal,p1,p2,p3);
    }

    @Override
    public void setActionListener(ActionListener action, int indiceBoton) {
        pnlBotones.setActionListener(action,indiceBoton);
    }
    @Override
    public void setActionListener(ActionListener action, String nombreBoton) {
        pnlBotones.setActionListener(action, nombreBoton);
    }
    public static void llenarSaborN(){
        List<ProductoNieve> listanieves;
        listanieves = obtenerListadoNieves();
        for(ProductoNieve e : listanieves){
            String sabor = e.getsabor_nieve();
            c2.addItem(sabor);
        }
    }
    public static void llenartamañoN(){
        List<ProductoNieve> listanieves;
        listanieves = obtenerListadoNieves();
        for(ProductoNieve e : listanieves){
            String tamaño = e.gettamaño_nieve();
            c3.addItem(tamaño);
        }
    }
    public static void llenartipoN(){
        List<ProductoNieve> listanieves;
        listanieves = obtenerListadoNieves();
        for(ProductoNieve e : listanieves){
            String tipo = e.getTipo_nieve();
            c4.addItem(tipo);
        }
    }
    public static void llenarSaborP(){
        List<ProductoPaleta> listapaletas;
        listapaletas = obtenerListadoPaletas();
        for(ProductoPaleta e : listapaletas){
            String sabor = e.getsabor_paleta();
            c2.addItem(sabor);
        }
    }
    public static void llenartamañoP(){
        List<ProductoPaleta> listapaletas;
        listapaletas = obtenerListadoPaletas();
        for(ProductoPaleta e : listapaletas){
            String tamaño = e.gettamaño_paleta();
            c3.addItem(tamaño);
        }
    }
    public static void llenartipoP(){
        List<ProductoPaleta> listapaletas;
        listapaletas = obtenerListadoPaletas();
        for(ProductoPaleta e : listapaletas){
            String tipo = e.getTipo_paleta();
            c4.addItem(tipo);
        }
    }
    public static String gettipo(){
        return (String) c1.getSelectedItem();
    }
    public static String getsabor(){
        return (String) c2.getSelectedItem();
    }
    public static String gettamaño(){
        return (String) c3.getSelectedItem();
    }
    public static String gettipodel(){
        return (String) c4.getSelectedItem();
    }
    public static String getlisVenta(){
        return ta1.getText();
    }
}

