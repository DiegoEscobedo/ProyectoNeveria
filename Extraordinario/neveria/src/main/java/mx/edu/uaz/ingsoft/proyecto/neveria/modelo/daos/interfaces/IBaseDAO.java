package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces;

import java.util.List;

/**
 *
 * @author yo

 * En esta interfaz, declaramos las acciones CRUD
 * de nuestra base de datos de forma genérica
 *  Declara las operaciones base de todo DAO
 */
public interface IBaseDAO<T> {
    T findById(Long id);

    T findByIdV(Long id_Venta);

    List<T> findAll();
    void save(T entidad);
    void update(T entidad);
    void delete(T entidad);
}
