package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces;

public interface IPanelValues <T>{
    void setValue(T value);
    T getValue();
    void setEditable(boolean editable);
    void setHorientacionVertical(boolean horientacionVertical);
}
