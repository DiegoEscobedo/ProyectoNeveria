package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

public class InputIntegerPanel extends InputNumberPanel<Integer>{
    public InputIntegerPanel(String texto, Integer valorI) {
        super(texto, valorI);
        setHorientacionVertical(false);
    }
    public InputIntegerPanel(String texto) {
        this(texto, 0);
    }
}
