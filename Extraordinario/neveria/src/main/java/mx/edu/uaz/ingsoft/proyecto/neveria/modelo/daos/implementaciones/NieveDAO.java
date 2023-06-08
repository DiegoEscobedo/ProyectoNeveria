package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;

import javax.persistence.EntityManager;



public class NieveDAO extends GenericBaseDAO<ProductoNieve> implements INieveDAO {
    public NieveDAO( EntityManager entityManager) {
        super(ProductoNieve.class, entityManager);
    }
}
