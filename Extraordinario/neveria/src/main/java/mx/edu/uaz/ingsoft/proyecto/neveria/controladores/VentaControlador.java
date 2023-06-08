package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;


import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.programas.llenadoventas;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta_Ticket;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Inicio;

import java.util.ArrayList;
import java.util.List;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.BitacoraControlador.guardarBitacora;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.llenadoventas.llenarlistaVenta;
import static mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta.*;
public class VentaControlador {
    public static Long id_Ventaa = 0L;
    public static Long contador = 0L;
    public static void añadiropciones() {
        if (gettipo().equals("Nieve")) {
            c2.removeAllItems();
            c3.removeAllItems();
            c4.removeAllItems();
            llenarSaborN();
            llenartamañoN();
            llenartipoN();
        }
        if (gettipo().equals("Paleta")) {
            c2.removeAllItems();
            c3.removeAllItems();
            c4.removeAllItems();
            llenarSaborP();
            llenartamañoP();
            llenartipoP();
        }
    }
    public static void setVentaid(){
        id_Ventaa = id_Ventaa+1;
    }
    public static Long getVentaId(){
        return id_Ventaa;
    }
    public static void setContador(){
        contador = contador+1;
    }
    public static Long getcontador(){
        return contador;
    }
    public static void GuardarProducto() {
        venta n1 = new venta();
        List<venta> listaVenta;
        llenadoventas.llenarVenta(n1);
        System.out.println(n1);
        listaVenta = llenarlistaVenta();
        System.out.println(listaVenta);
        List<String>listaS=new ArrayList();
        String salida;
        guardarBitacora(Constantes.ACCION_LLENARB,Constantes.NAME_VENTA);
        for(venta e : listaVenta){
            if(e.getId_Venta() == getcontador()) {
                String tipo = e.getTipo_prod();
                String sabor = e.getSabor_prod();
                String tamaño = e.getTamaño_prod();
                String tipodel = e.getTipodel_prod();
                String precio = String.valueOf(e.getPrecio_prod());
                salida = tipo + sabor + tamaño + tipodel + precio;
                System.out.println(salida);
                listaS.add(salida + "\n");
                ta1.setText(listaS.toString());
            }
        }
    }
    public static void mostrarVentana(){
        Ventana_Venta_Ticket miv = new Ventana_Venta_Ticket();
        miv.setVisible(true);
    }
    public static void VolveraInicio(){
        Ventana_Inicio miv = new Ventana_Inicio("INICIO");
        miv.setVisible(true);
    }
}
