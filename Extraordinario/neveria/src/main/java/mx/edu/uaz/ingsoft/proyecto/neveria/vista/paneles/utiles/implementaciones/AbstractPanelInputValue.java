package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.IPanelValues;

import javax.swing.*;

import javax.swing.text.JTextComponent;

public class AbstractPanelInputValue<T> extends JPanel implements IPanelValues<T> {
    private final JLabel etiqueta;
    protected final JTextComponent cValor;

    public AbstractPanelInputValue(String texto,JTextComponent componenteT) {
        super();
        setHorientacionVertical(false);
        etiqueta=new JLabel(texto);
        cValor=componenteT;
        add(etiqueta);
        add(cValor);
    }

    @Override
    public void setValue(T value) {

    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public void setEditable(boolean editable) {
        cValor.setEditable(editable);
    }

    @Override
    public void setHorientacionVertical(boolean horientacionVertical) {
        if (horientacionVertical) {
            setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        }else{
            setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        }
    }
}
