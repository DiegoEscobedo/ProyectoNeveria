package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBitacoraDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.Bitacora;

import javax.persistence.EntityManager;

public class BitacoraDAO extends GenericBaseDAO<Bitacora> implements IBitacoraDAO {
    public BitacoraDAO( EntityManager entityManager) {
        super(Bitacora.class,entityManager);
    }
}
