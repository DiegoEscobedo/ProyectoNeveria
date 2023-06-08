package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones;


import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IUsuarioDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.usuario;

import javax.persistence.EntityManager;

public class UsuarioDAO extends GenericBaseDAO<usuario> implements IUsuarioDAO {
    public UsuarioDAO(EntityManager entityManager) {
        super(usuario.class, entityManager);
    }
}
