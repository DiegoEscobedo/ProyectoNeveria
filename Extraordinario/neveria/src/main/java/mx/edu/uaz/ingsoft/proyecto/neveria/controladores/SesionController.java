package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.InicioSesion;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_Inicio;

import javax.swing.*;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.servicios.*;

public class SesionController {
    public static void guardar(String Clase, Object o){
        if(Clase.equals("Venta")){
            Sesiones.guardarEntidadVenta((venta) o);
        }
        if(Clase.equals("Paleta")){
            Sesiones.guardarEntidadPaleta((ProductoPaleta) o);
        }
        if(Clase.equals("Nieve")){
            Sesiones.guardarEntidadNieve((ProductoNieve) o);
        }
        
    }
    
    public static void borrar(String Clase, Long o){
        if(Clase.equals("Venta")){
            Sesiones.borrarEntidadVenta(o);
        }
        if(Clase.equals("Paleta")){
            Sesiones.borrarEntidadPaleta(o);
        }
        if(Clase.equals("Nieve")){
            Sesiones.borrarEntidadNieve(o);
        }
        
    }
    
    
    
    public static void ControladorSesiones(){
        String text = InicioSesion.getUser();
        JOptionPane.showMessageDialog(null, "Has iniciado sesion como:" + " " + text );
        Ventana_Inicio vAd=new Ventana_Inicio("INICIO");
        vAd.setVisible(true);
    }
}
