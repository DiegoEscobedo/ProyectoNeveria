package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBaseDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.panel_CapturaEntidad;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos.Ventana_Abstrac_Caputura;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class EntityController <T,U extends panel_CapturaEntidad>{
    private final IBaseDAO<T> dao;
    private final Ventana_Abstrac_Caputura<U,T> ventanaCaptura;
    protected final Logger logger;
    private T entidad;
    private List<T> listaEntidades;

    public EntityController(IBaseDAO dao, Ventana_Abstrac_Caputura ventanaCaptura) {
        this.dao = dao;
        this.ventanaCaptura = ventanaCaptura;
        entidad=null;
        listaEntidades=new ArrayList<>();
        logger=Logger.getLogger("Controlador");
    }
    public abstract void runControlador();

    public IBaseDAO<T> getDao(){
        return dao;
    }
    public Ventana_Abstrac_Caputura<U,T> getVentanaCaptura(){
        return ventanaCaptura;
    }
    public T getEntidad(){
        return entidad;
    }
    public void setEntidad(T entidad){
        this.entidad = entidad;
    }
    public List<T> getListaEntidades(){
        return listaEntidades;
    }
    public void setListaEntidades(List<T> listaEntidades){
        this.listaEntidades = listaEntidades;
    }
}
