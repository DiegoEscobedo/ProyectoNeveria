package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.EntityController;
import mx.edu.uaz.ingsoft.proyecto.neveria.controladores.PaletaControlador;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.PaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos.Ventana_Captura_Paleta;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LLenarPaletas {
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final IPaletaDAO dao;
    private static final Ventana_Captura_Paleta vcm;
    private static final EntityController controller;

    static {
        emf = Persistence.createEntityManagerFactory(Constantes.PERSISTENCE_NAME);
        em = emf.createEntityManager();
        dao = new PaletaDAO(em);
        vcm = new Ventana_Captura_Paleta();
        controller = new PaletaControlador(dao, vcm);
    }

    public static void mandarCapP() {
        controller.runControlador();
    }
}

