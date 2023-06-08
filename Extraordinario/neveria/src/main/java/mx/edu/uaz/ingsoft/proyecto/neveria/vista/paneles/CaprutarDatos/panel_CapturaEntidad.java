package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import static java.awt.BorderLayout.*;

public abstract class panel_CapturaEntidad <T>extends JPanel {
    protected final String TEXTO_VACIO = "";
    protected final double CERODOUBLE = 0.0;
    protected final int CERO = 0;

    protected JPanel pnlSuperior,pnlCentral;
    private T entidad;

    public panel_CapturaEntidad(String textoTitulo) {
        setLayout(new BorderLayout());
        if(Objects.nonNull(textoTitulo)){
            agregarPanelSuperior(textoTitulo);
        }else{
            agregarPanelSuperior();
        }
    }
    public panel_CapturaEntidad() {
        setLayout(new BorderLayout());
        agregarPanelSuperior();
    }
    public void agregarPanelSuperior(){
        agregarPanelSuperior("Captura de Entidad");
    }
    public void agregarPanelSuperior(String textoTitulo){
        pnlSuperior = new JPanel();
        pnlSuperior.add(new JLabel(textoTitulo));
        this.add(pnlSuperior, PAGE_START);
    }

    public T getEntidad() {
        if(Objects.isNull(entidad)){
            crearEntidad();
        }
        return entidad;
    }

    public void setEntidad(T entidad,boolean actualizarCampos) {
        if(Objects.nonNull(entidad)){
            this.entidad = entidad;
            if(actualizarCampos){
                actualizarCamposDesdeEntidad();
            }
        }
    }
    public void setEntidad(T entidad){
        setEntidad(entidad,true);
    }

    protected abstract JPanel crearPanelCentral();
    protected abstract void actualizarCamposDesdeEntidad();
    public abstract void crearEntidad();
    public abstract void limpiarCampos();
}
