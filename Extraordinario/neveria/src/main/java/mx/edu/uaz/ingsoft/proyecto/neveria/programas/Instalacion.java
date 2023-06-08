package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.NieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.PaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.UsuarioDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IUsuarioDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Instalacion {
    private static final String PERSISTENCE_NAME = "neveria";
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final INieveDAO daoNieve;
    private static final IPaletaDAO daoPaleta;

    private static final IUsuarioDAO daoUsuario;


    static{

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        em = emf.createEntityManager();

        daoNieve = new NieveDAO(em);
        daoPaleta = new PaletaDAO(em);
        daoUsuario = new UsuarioDAO(em);

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

        llenar_Usuarios();
        
    }

    public static List<ProductoNieve> obtenerListadoNieves() {

        List<ProductoNieve> salida=null;
        try {
            salida= daoNieve.findAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }

    private static void llenar_Paletas(){
        ProductoPaleta n1,n2,n3,n4,n5,n6;
        n1 = new ProductoPaleta();
        n2 = new ProductoPaleta();
        n3 = new ProductoPaleta();
        n4 = new ProductoPaleta();
        n5 = new ProductoPaleta();
        n6 = new ProductoPaleta();
        n1.setsabor_paleta("Choco");
        n2.setsabor_paleta("Fresa");
        n3.setsabor_paleta("Limon");
        n1.setTipo_paleta("Leche");
        n2.setTipo_paleta("Leche");
        n3.setTipo_paleta("Leche");
        n1.settamaño_paleta("Grande");
        n2.settamaño_paleta("Grande");
        n3.settamaño_paleta("Grande");
        n1.setPrecio_paleta(30.00);
        n2.setPrecio_paleta(30.00);
        n3.setPrecio_paleta(30.00);
        n1.setActivo(true);
        n2.setActivo(true);
        n3.setActivo(true);
        n4.setsabor_paleta("Choco");
        n5.setsabor_paleta("Fresa");
        n6.setsabor_paleta("Limon");
        n4.setTipo_paleta("Leche");
        n5.setTipo_paleta("Leche");
        n6.setTipo_paleta("Leche");
        n4.settamaño_paleta("Mediano");
        n5.settamaño_paleta("Mediano");
        n6.settamaño_paleta("Mediano");
        n4.setPrecio_paleta(20.00);
        n5.setPrecio_paleta(20.00);
        n6.setPrecio_paleta(20.00);
        n4.setActivo(true);
        n5.setActivo(true);
        n6.setActivo(true);

        daoPaleta.save(n1);
        daoPaleta.save(n2);
        daoPaleta.save(n3);
        daoPaleta.save(n4);
        daoPaleta.save(n5);
        daoPaleta.save(n6);

    }


    public static List<ProductoPaleta> obtenerListadoPaletas() {
        List<ProductoPaleta> salida=null;
        try {
            salida= daoPaleta.findAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }

    private static void llenar_Nieves(){
        ProductoNieve n1,n2,n3,n4,n5,n6;
        n1 = new ProductoNieve();
        n2 = new ProductoNieve();
        n3 = new ProductoNieve();
        n4 = new ProductoNieve();
        n5 = new ProductoNieve();
        n6 = new ProductoNieve();
        n1.setsabor_nieve("Choco");
        n2.setsabor_nieve("Fresa");
        n3.setsabor_nieve("Limon");
        n1.setTipo_nieve("Leche");
        n2.setTipo_nieve("Leche");
        n3.setTipo_nieve("Leche");
        n1.settamaño_nieve("Grande");
        n2.settamaño_nieve("Grande");
        n3.settamaño_nieve("Grande");
        n1.setPrecio_nieve(30.00);
        n2.setPrecio_nieve(30.00);
        n3.setPrecio_nieve(30.00);
        n1.setActivo(true);
        n2.setActivo(true);
        n3.setActivo(true);
        n4.setsabor_nieve("Choco");
        n5.setsabor_nieve("Fresa");
        n6.setsabor_nieve("Limon");
        n4.setTipo_nieve("Leche");
        n5.setTipo_nieve("Leche");
        n6.setTipo_nieve("Leche");
        n4.settamaño_nieve("Mediano");
        n5.settamaño_nieve("Mediano");
        n6.settamaño_nieve("Mediano");
        n4.setPrecio_nieve(20.00);
        n5.setPrecio_nieve(20.00);
        n6.setPrecio_nieve(20.00);
        n4.setActivo(true);
        n5.setActivo(true);
        n6.setActivo(true);


        daoNieve.save(n1);
        daoNieve.save(n2);
        daoNieve.save(n3);
        daoNieve.save(n4);
        daoNieve.save(n5);
        daoNieve.save(n6);


    }

    private static void llenar_Usuarios(){
        usuario n1,n2,n3,n4;
        n1 = new usuario();
        n2 = new usuario();
        n3 = new usuario();
        n4 = new usuario();
        n1.setUser_us("Admin");
        n1.setPass_us("Admin123");
        n1.setActivo(true);
        n2.setUser_us("Diego");
        n2.setPass_us("Diego1312");
        n2.setActivo(true);
        n3.setUser_us("Empleado");
        n3.setPass_us("Empleado123");
        n3.setActivo(true);
        n4.setUser_us("Angel");
        n4.setPass_us("Angel72");
        n4.setActivo(true);
        daoUsuario.save(n1);
        daoUsuario.save(n2);
        daoUsuario.save(n3);
        daoUsuario.save(n4);
    }
}
