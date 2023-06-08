package mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores;

import java.time.LocalTime;

public class AdaptadorTiempo {

    public static String transformar(LocalTime tiempoActual) {
        return tiempoActual.toString();
    }
}
