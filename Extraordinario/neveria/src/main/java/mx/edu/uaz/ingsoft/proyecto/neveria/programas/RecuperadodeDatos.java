package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.NieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.PaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import static mx.edu.uaz.ingsoft.proyecto.neveria.servicios.Sesiones.buscarNieve;
import static mx.edu.uaz.ingsoft.proyecto.neveria.servicios.Sesiones.buscarPaleta;

public class RecuperadodeDatos {
    private static final String PERSISTENCE_NAME = "neveria";
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final INieveDAO daoNieve;
    private static final IPaletaDAO daoPaleta;

    static{

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        em = emf.createEntityManager();

        daoNieve = new NieveDAO(em);
        daoPaleta = new PaletaDAO(em);

    }
    public static void main(String[] args) {
        Logger.getAnonymousLogger().info("Ejecutando el programa");

            llenarInformacionBD();

            mostrarInformacion();
        em.close();
        emf.close();

    }

    private static void mostrarInformacion() {

            mostrarListadoNieves();
            mostrarListadoPaletas();

    }

    private static void mostrarListadoNieves() {
        var ln = obtenerListadoNieves();
        for(var v :ln){
            System.out.println(v);
        }
    }

    private static void mostrarListadoPaletas() {
        var lp = obtenerListadoPaletas();
        for(var v : lp){
            System.out.println(v);
        }
    }

    public static void llenarInformacionBD(){
        llenar_Nieves();
        List<ProductoNieve> listaNieves;

        listaNieves = obtenerListadoNieves();

        llenar_Paletas();
        List<ProductoPaleta> listaPaletas;
        listaPaletas = obtenerListadoPaletas();
    }

    public static List<ProductoNieve> obtenerListadoNieves() {

        List<ProductoNieve> salida=null;
        try {
            salida= buscarNieve();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }

    private static void llenar_Paletas(){
        ProductoPaleta n1,n2,n3;
        n1 = new ProductoPaleta();
        n2 = new ProductoPaleta();
        n3 = new ProductoPaleta();
        n1.setsabor_paleta("Choco");
        n2.setsabor_paleta("Fresa");
        n3.setsabor_paleta("Limon");
        n1.setTipo_paleta("Leche");
        n2.setTipo_paleta("Leche");
        n3.setTipo_paleta("Agua");
        n1.settamaño_paleta("Mediano");
        n2.settamaño_paleta("Mediano");
        n3.settamaño_paleta("Mediano");
        n1.setPrecio_paleta(30.00);
        n2.setPrecio_paleta(30.00);
        n3.setPrecio_paleta(30.00);
        n1.setActivo(true);
        n2.setActivo(true);
        n3.setActivo(true);

        daoPaleta.save(n1);
        daoPaleta.save(n2);
        daoPaleta.save(n3);

    }


    public static List<ProductoPaleta> obtenerListadoPaletas() {
        List<ProductoPaleta> salida=null;
        try {
            salida= buscarPaleta();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }


    private static void llenar_Nieves(){
        ProductoNieve n1,n2,n3;
        n1 = new ProductoNieve();
        n2 = new ProductoNieve();
        n3 = new ProductoNieve();
        n1.setsabor_nieve("Choco");
        n2.setsabor_nieve("Fresa");
        n3.setsabor_nieve("Limon");
        n1.setTipo_nieve("Leche");
        n2.setTipo_nieve("Leche");
        n3.setTipo_nieve("Agua");
        n1.settamaño_nieve("Mediano");
        n2.settamaño_nieve("Grande");
        n3.settamaño_nieve("Mediano");
        n1.setPrecio_nieve(30.00);
        n2.setPrecio_nieve(30.00);
        n3.setPrecio_nieve(30.00);
        n1.setActivo(true);
        n2.setActivo(true);
        n3.setActivo(true);

        daoNieve.save(n1);
        daoNieve.save(n2);
        daoNieve.save(n3);


    }
}