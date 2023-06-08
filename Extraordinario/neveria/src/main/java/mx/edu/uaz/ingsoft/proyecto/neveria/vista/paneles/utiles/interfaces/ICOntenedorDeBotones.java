package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces;

import java.awt.event.ActionListener;

public interface ICOntenedorDeBotones {
    void setActionListener(ActionListener action, int indiceBoton);
    void setActionListener(ActionListener action, String nombreBoton);
}
