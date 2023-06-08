package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;

import java.util.ArrayList;
import java.util.List;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.BitacoraControlador.guardarBitacora;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoNieves;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.RecuperadodeDatos.obtenerListadoPaletas;
import static mx.edu.uaz.ingsoft.proyecto.neveria.programas.llenadoventas.llenarlistaVenta;

public class mandarListas {


    public static String mandarLisN() {
        List<ProductoNieve> listanieves;
        List<String> listaN = new ArrayList();
        listanieves = obtenerListadoNieves();
        for (ProductoNieve e : listanieves) {
            String tipo ="ID= "+e.getId()+ "Sabor= " + e.getsabor_nieve() + "| Tamaño= " + e.gettamaño_nieve() + "| Tipo= " + e.getTipo_nieve();
            listaN.add(tipo + "\n");
            //as.setText(listaN.toString());
        }
        guardarBitacora(Constantes.ACCION_MOSTRAR,"Nieve");
        return listaN.toString();
    }

    public static String mandarLisP() {
        List<ProductoPaleta> listapaletas;
        List<String> listaP = new ArrayList();
        listapaletas = obtenerListadoPaletas();
        for (ProductoPaleta e : listapaletas) {
            String tipo ="ID= "+e.getId()+ "Sabor= " + e.getsabor_paleta() + "| Tamaño= " + e.gettamaño_paleta() + "| Tipo= " + e.getTipo_paleta();
            listaP.add(tipo + "\n");
            //as.setText(listaN.toString());
        }
        guardarBitacora(Constantes.ACCION_MOSTRAR,"Paleta");
        return listaP.toString();
    }
public static String mandarListV(){
        List<venta> listaVenta;
        List<String> listaV=new ArrayList();
        listaVenta= llenarlistaVenta();
        for (venta e: listaVenta){
            String tipo= "ID= "+e.getId()+"ID Venta= "+e.getId_Venta()+"Contador ID= "+e.getContador_id()+ "Activo= "+e.getActivo()+"Producto= "+e.getTipo_prod();
            listaV.add(tipo+"\n");
        }
        guardarBitacora(Constantes.ACCION_MOSTRAR,Constantes.NAME_VENTA);
        return listaV.toString();
}
}
