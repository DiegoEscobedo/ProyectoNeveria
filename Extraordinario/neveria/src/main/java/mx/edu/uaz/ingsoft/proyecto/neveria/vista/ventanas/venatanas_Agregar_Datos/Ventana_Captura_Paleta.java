package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.PanelCapturaPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.Panel_Contenedor_Botones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;

import java.awt.event.ActionListener;

public class Ventana_Captura_Paleta extends Ventana_Abstrac_Caputura<PanelCapturaPaleta, ProductoPaleta>implements ICOntenedorDeBotones {
    public static final String tituloPaletas;
    public static final String[] botonesPaletas;

    static {
        tituloPaletas = "Agregar Paleta";
        botonesPaletas = new String[]{
                "Aceptar",
                "Cancelar"
        };
    }
    private Panel_Contenedor_Botones pnlBotones;
    private PanelCapturaPaleta pnlCapturas;

    public Ventana_Captura_Paleta(){
        super(tituloPaletas);
        fijarPaneles();
        pack();
    }
    @Override
    public void setActionListener(ActionListener action, int indiceBoton) {
        pnlBotones.setActionListener(action,indiceBoton);
    }

    @Override
    public void setActionListener(ActionListener action, String nombreBoton) {
        pnlBotones.setActionListener(action,nombreBoton);
    }

    @Override
    public ProductoPaleta obtenerEntidad() {
        pnlCapturas.crearEntidad();
        return pnlCapturas.getEntidad();
    }

    @Override
    public void establcerEnty(ProductoPaleta entidad) {
        pnlCapturas.setEntidad(entidad);
    }

    @Override
    protected void ponerpaneles() {
        pnlBotones=new Panel_Contenedor_Botones(botonesPaletas);
        pnlCapturas=new PanelCapturaPaleta(tituloPaletas);
        agregarPanelAbajo(pnlBotones);
        agregarPanelCentral(pnlCapturas);
    }

    @Override
    public void limpiarCampos() {
        pnlCapturas.limpiarCampos();
    }
}
