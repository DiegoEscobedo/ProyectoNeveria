package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.EntityController;
import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.NieveControlador;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.NieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos.Ventana_Capura_Nieve;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LLenarNieve {
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final INieveDAO dao;
    private static final Ventana_Capura_Nieve vcm;
    private static final EntityController controller;

    static {
        emf=Persistence.createEntityManagerFactory(Constantes.PERSISTENCE_NAME);
        em=emf.createEntityManager();
        dao=new NieveDAO(em);
        vcm=new Ventana_Capura_Nieve();
        controller=new NieveControlador(dao,vcm);
    }

    public static void mandarCapN(){
        controller.runControlador();
    }

}
