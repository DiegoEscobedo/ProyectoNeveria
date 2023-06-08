package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;


import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IVentaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;

import javax.persistence.EntityManager;


public class VentaDAO extends GenericBaseDAO<venta> implements IVentaDAO {
    public VentaDAO(EntityManager entityManager) {
        super(venta.class, entityManager);
    }

}
