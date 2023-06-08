package mx.edu.uaz.ingsoft.proyecto.neveria.servicios;

import static mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta.getlisVenta;
import static mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Ventana_HacerVenta.Ventana_Venta_Ticket.taTicket;

public class Ticket {
    public static void llenarTicket() {
        taTicket.setText(getlisVenta());
    }
}
