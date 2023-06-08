package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

public class InputDoublePanel extends InputNumberPanel<Double>{
    public InputDoublePanel(String textoEtiqueta, Double valorI){
        super(textoEtiqueta, valorI);
    }
    public InputDoublePanel(String textoEtiqueta){
        this(textoEtiqueta, 0.0);
    }
}