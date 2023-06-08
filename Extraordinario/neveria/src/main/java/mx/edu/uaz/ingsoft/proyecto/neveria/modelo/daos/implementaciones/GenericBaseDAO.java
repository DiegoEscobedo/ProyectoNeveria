package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBaseDAO;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.logging.Logger;

public class GenericBaseDAO<T> implements IBaseDAO<T> {

    private EntityManager entityManager;
    private static final Logger loggerBaseDAO;

    private final Class<T> clazz;


    static {
        loggerBaseDAO = Logger.getLogger("GenericBaseDAO");
    }

    protected GenericBaseDAO(Class<T> tipoClase, EntityManager entityManager){
        this.clazz = tipoClase;
        setEntityManager(entityManager);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        if(this.entityManager == null) {
            this.entityManager = entityManager;
        }
    }

    @Override
    public T findById(Long id) {
        return entityManager.find(clazz,id);
    }

    @Override
    public T findByIdV(Long id_Venta) {
        return entityManager.find(clazz,id_Venta);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(clazz);
        criteriaQuery.select(criteriaQuery.from(clazz));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public void save(T entidad) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entidad);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            loggerBaseDAO.severe("Error al guardar la entidad");
            loggerBaseDAO.severe(e.getMessage());
        }
    }

    @Override
    public void update(T entidad) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entidad);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            loggerBaseDAO.severe("Error al actualizar la entidad");
        }
    }

    @Override
    public void delete(T entidad) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entidad);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            loggerBaseDAO.severe("Error al borrar la entidad");
        }
    }
}
