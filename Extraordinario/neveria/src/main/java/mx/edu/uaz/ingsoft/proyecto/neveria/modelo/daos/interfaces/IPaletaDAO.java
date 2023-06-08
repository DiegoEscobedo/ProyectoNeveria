package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces;

/*
En esta interfaz establecemos las acciones del DAO para la entidad.
Extiende de la interfaz IBaseDAO, por lo cual de antemano declara
todas las funciones básicas.

Esta interfaz tiene la intención de que aquí se establezcan las acciones que son
específicas para la entidad.
*/

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;

public interface IPaletaDAO extends IBaseDAO<ProductoPaleta>{
    // Ya incluye todas las acciones basicas del DAO
}