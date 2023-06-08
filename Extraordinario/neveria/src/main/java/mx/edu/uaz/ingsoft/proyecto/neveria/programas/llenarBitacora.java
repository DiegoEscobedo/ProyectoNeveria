package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.BitacoraDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBitacoraDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.Bitacora;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores.AdaptadorTiempo;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores.AdaptarFecha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

public class llenarBitacora {
    private static final String PERSISTENCE_NAME = "neveria";
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final IBitacoraDAO daoBitacora;

    private static final LocalDate fecha=LocalDate.now();
    private static final LocalTime hora=LocalTime.now();

    static{

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        em = emf.createEntityManager();

        daoBitacora=new BitacoraDAO(em);
    }



    public static void llenardeBitacora(String accion, String catalogo){
        Bitacora b1 = new Bitacora();
        b1.setFecha(AdaptarFecha.transformarF(fecha));
        b1.setHora(AdaptadorTiempo.transformar(hora));
        b1.setAccion(accion);
        b1.setCatalogo(catalogo);
        daoBitacora.save(b1);
    }
    public static void llenar(){
        Bitacora b1 = new Bitacora();
        b1.setFecha(AdaptarFecha.transformarF(fecha));
        b1.setHora(AdaptadorTiempo.transformar(hora));
        b1.setAccion("hola");
        b1.setCatalogo("main");
        daoBitacora.save(b1);
    }
    public static void main(String[] args) {
        Logger.getAnonymousLogger().info("Ejecutando el programa");

        llenar();

        em.close();
        emf.close();

    }

}
