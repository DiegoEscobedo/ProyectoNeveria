package mx.edu.uaz.ingsoft.proyecto.neveria.servicios;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;

import java.util.List;

import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoNieves;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoPaletas;
import static mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta.*;

public class VentasService {
    static Long id = 0L;
    public static Long BuscaridN(){
        Long id = null;
        List<ProductoNieve> listaNieves;
        listaNieves = obtenerListadoNieves();
        for(ProductoNieve e : listaNieves) {
            if(getVentanasabor().equals(e.getsabor_nieve()) && getVentanatamaño().equals(e.gettamaño_nieve()) && getVentanatipodel().equals(e.getTipo_nieve())) {
                id = e.getId();
            }
        }
        return id;
    }
    public static Long BuscaridP(){
        Long id = null;
        List<ProductoPaleta> listaPaletas;
        listaPaletas = obtenerListadoPaletas();
        for(ProductoPaleta e : listaPaletas) {
            if(getVentanasabor().equals(e.getsabor_paleta()) && getVentanatamaño().equals(e.gettamaño_paleta()) && getVentanatipodel().equals(e.getTipo_paleta())) {
                id = e.getId();
            }
        }
        return id;
    }
    public static String getVentanasabor(){
        return getsabor();
    }
    public static String getVentanatamaño(){
        return gettamaño();
    }
    public static String getVentanatipodel(){
        return gettipodel();
    }

    public static Long getVentanaid() {
        return id;
    }

    public static String getVentanatipo() {
        return gettipo();
    }
}