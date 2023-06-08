package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones.InputDoublePanel;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones.InputTextFieldPanel;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.SwingUtiles;

import javax.swing.*;
import java.util.Objects;
import static java.awt.BorderLayout.CENTER;

public class PanelCapturaPaleta extends panel_CapturaEntidad<ProductoPaleta>{
    private final InputTextFieldPanel pnlSabor;
    private final InputTextFieldPanel pnlTamaño;
    private final InputTextFieldPanel pnlTipo;
    private final InputDoublePanel pnlPRecio;

    public PanelCapturaPaleta(String titulo) {
        super(titulo);
        pnlSabor=new InputTextFieldPanel("Sabor:",Constantes.NUM_MIN_COL);
        pnlTamaño=new InputTextFieldPanel("Tamaño:",Constantes.NUM_MIN_COL);
        pnlTipo=new InputTextFieldPanel("Tipo");
        pnlPRecio=new InputDoublePanel("Precio:");
        pnlCentral=crearPanelCentral();
        this.add(pnlCentral,CENTER);
    }

    @Override
    protected JPanel crearPanelCentral() {
        return SwingUtiles.crearVerticalBoxPanel(pnlSabor,pnlTamaño,pnlTipo,pnlPRecio);
    }

    @Override
    protected void actualizarCamposDesdeEntidad() {
        if (Objects.nonNull(getEntidad())) {
            pnlSabor.setValue(getEntidad().getsabor_paleta());
            pnlTipo.setValue(getEntidad().getTipo_paleta());
            pnlTamaño.setValue(getEntidad().gettamaño_paleta());
            pnlPRecio.setValue(getEntidad().getPrecio_paleta());
        }
    }

    @Override
    public void crearEntidad() {
        ProductoPaleta paletaE=new ProductoPaleta();
        paletaE.setsabor_paleta(pnlSabor.getValue());
        paletaE.settamaño_paleta(pnlTamaño.getValue());
        paletaE.setTipo_paleta(pnlTipo.getValue());
        paletaE.setPrecio_paleta(pnlPRecio.getValue());
        setEntidad(paletaE,true);
    }

    @Override
    public void limpiarCampos() {
        pnlSabor.setValue(Constantes.TEXTO_VACIO);
        pnlTipo.setValue(Constantes.TEXTO_VACIO);
        pnlTamaño.setValue(Constantes.TEXTO_VACIO);
        pnlPRecio.setValue(Constantes.VALOR_CERO_DOUBLE);
    }

}
