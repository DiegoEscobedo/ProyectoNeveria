package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;

import javax.swing.*;
import java.util.Objects;

public class InputTextPanel extends AbstractPanelInputValue<String>{
    public InputTextPanel(String texto, JTextField componenteT) {

        super(texto, componenteT);
    }


    @Override
    public void setValue(String value) {
        cValor.setText(Objects.requireNonNullElse(value, Constantes.TEXTO_VACIO));
    }
    @Override
    public String getValue() {
        return cValor.getText().trim();
    }
}
