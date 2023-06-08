package mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Inicio;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Ver_Catalogos_Nieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Ver_Catalogos_Paletas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.LLenarNieve.mandarCapN;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.LLenarPaletas.mandarCapP;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.ventana_Borrar.Ventana_Borrar_Nieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.ventana_Borrar.Ventana_Borrar_Paletas;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.ventana_Borrar.Ventana_Borrar_Ventas;

public class invocar_Ventanas {
    public static ActionListener abrir_borrarV=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Borrar_Ventas bV=new Ventana_Borrar_Ventas();
            bV.setVisible(true);
        }
    };
    public static ActionListener abrir_BorradorN=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Borrar_Nieve bN=new Ventana_Borrar_Nieve();
            bN.setVisible(true);
        }
    };

    public static ActionListener abrir_BorradorP=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Borrar_Paletas bN=new Ventana_Borrar_Paletas();
            bN.setVisible(true);
        }
    };

    public static ActionListener abrirl_Catalogosnieve=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Ver_Catalogos_Nieve nie=new Ventana_Ver_Catalogos_Nieve();
            nie.setVisible(true);
        }
    };

    public static ActionListener abrir_VentanaI=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Inicio in=new Ventana_Inicio("Inicio");
            in.setVisible(true);
        }
    };

    public static ActionListener abrir_CatalogoP=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Ver_Catalogos_Paletas pal=new Ventana_Ver_Catalogos_Paletas();
            pal.setVisible(true);
            Ventana_Inicio in=new Ventana_Inicio("Inicio");
            in.setVisible(true);
            in.setVisible(false);
        }
    };

    public static ActionListener capturarDatosP=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mandarCapP();
        }
    };

    public static ActionListener capturarDatosN=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mandarCapN();
        }
    };

    public static ActionListener abrir_Venta=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana_Venta VnV = new Ventana_Venta();
            VnV.setVisible(true);
        }
    };
}
