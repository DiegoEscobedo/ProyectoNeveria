package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

import javax.swing.*;

public class InputNumberPanel<T extends Number> extends AbstractPanelInputValue<T> {
    public InputNumberPanel( String texto, T valor) {
        super(texto, new JFormattedTextField() );
        setValue(valor);
    }

    protected JFormattedTextField getCampoValor(){
        return (JFormattedTextField) cValor;
    }

    @Override
    public void setValue(T value) {
        getCampoValor().setValue(value);
    }

    @Override
    public T getValue() {
        return (T) getCampoValor().getValue();
    }
}
