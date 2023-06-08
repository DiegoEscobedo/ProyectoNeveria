package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;

import javax.persistence.EntityManager;



public class PaletaDAO extends GenericBaseDAO<ProductoPaleta> implements IPaletaDAO {
    public PaletaDAO( EntityManager entityManager) {
        super(ProductoPaleta.class, entityManager);
    }
}
