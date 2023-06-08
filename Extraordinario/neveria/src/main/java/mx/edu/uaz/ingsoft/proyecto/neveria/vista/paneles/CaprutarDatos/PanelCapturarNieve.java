package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones.InputDoublePanel;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones.InputTextFieldPanel;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.SwingUtiles;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;

import javax.swing.*;
import java.util.Objects;
import static java.awt.BorderLayout.CENTER;

public class PanelCapturarNieve extends panel_CapturaEntidad<ProductoNieve>{
    private final InputTextFieldPanel pnlSabor;
    private final InputTextFieldPanel pnlTamaño;
    private final InputTextFieldPanel pnlTipo;
    private final InputDoublePanel pnlPRecio;


    public PanelCapturarNieve(String titulo) {
        super(titulo);
        pnlSabor=new InputTextFieldPanel("Sabor:",10);
        pnlTamaño=new InputTextFieldPanel("Tamaño:",10);
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
            pnlSabor.setValue(getEntidad().getsabor_nieve());
            pnlTipo.setValue(getEntidad().getTipo_nieve());
            pnlTamaño.setValue(getEntidad().gettamaño_nieve());
            pnlPRecio.setValue(getEntidad().getPrecio_nieve());
        }
    }

    @Override
    public void crearEntidad() {
        ProductoNieve nievec=new ProductoNieve();
        nievec.setsabor_nieve(pnlSabor.getValue());
        nievec.setTipo_nieve(pnlTipo.getValue());
        nievec.settamaño_nieve(pnlTamaño.getValue());
        nievec.setPrecio_nieve(pnlPRecio.getValue());
        setEntidad(nievec,true);
    }

    @Override
    public void limpiarCampos() {
        pnlSabor.setValue(Constantes.TEXTO_VACIO);
        pnlTipo.setValue(Constantes.TEXTO_VACIO);
        pnlTamaño.setValue(Constantes.TEXTO_VACIO);
        pnlPRecio.setValue(Constantes.VALOR_CERO_DOUBLE);
    }
}
