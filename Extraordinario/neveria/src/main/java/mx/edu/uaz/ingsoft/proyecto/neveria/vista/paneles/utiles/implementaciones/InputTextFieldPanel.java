package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.implementaciones;

import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class InputTextFieldPanel extends InputTextPanel{

    private static JTextField gt=new JTextField(Constantes.NUM_COLUMNAS);
    public InputTextFieldPanel(String texto) {
        super(texto,gt);
    }
    public InputTextFieldPanel(String textoEtiqueta, int numeroColumnas) {
        super(textoEtiqueta, new JTextField(numeroColumnas));
    }
}
