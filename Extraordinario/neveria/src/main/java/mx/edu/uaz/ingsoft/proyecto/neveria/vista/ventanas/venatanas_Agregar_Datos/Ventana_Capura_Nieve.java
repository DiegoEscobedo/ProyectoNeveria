package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.PanelCapturarNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.Panel_Contenedor_Botones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;

import java.awt.event.ActionListener;

public class Ventana_Capura_Nieve extends Ventana_Abstrac_Caputura<PanelCapturarNieve, ProductoNieve>implements ICOntenedorDeBotones {
    public static final String titulo;
    public static final String[] botones;

    static {
        titulo = "Captura de Nieve";
        botones = new String[]{
                "Aceptar",
                "Cancelar"
        };
    }
    private Panel_Contenedor_Botones pnlBotones;
    private PanelCapturarNieve pnlCapturar;

    public Ventana_Capura_Nieve(){
        super(titulo);
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
    public ProductoNieve obtenerEntidad() {
        pnlCapturar.crearEntidad();
        return pnlCapturar.getEntidad();
    }

    @Override
    public void establcerEnty(ProductoNieve nieve) {
        pnlCapturar.setEntidad(nieve);
    }

    @Override
    protected void ponerpaneles() {
        pnlBotones=new Panel_Contenedor_Botones(botones);
        pnlCapturar=new PanelCapturarNieve(titulo);
        agregarPanelAbajo(pnlBotones);
        agregarPanelCentral(pnlCapturar);
    }

    @Override
    public void limpiarCampos() {
        pnlCapturar.limpiarCampos();
    }
}
