package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;


import mx.edu.uaz.ingsoft.proyecto.neveria.programas.llenarBitacora;

public class BitacoraControlador {
    public static Long id_Bitacora = 1L;



   public static void guardarBitacora(String accion,String catalogo){
       llenarBitacora.llenardeBitacora(accion,catalogo);
   }

    public static Long getId_Bitacora() {
        return id_Bitacora;
    }

    public static void setId_Bitacora() {
        id_Bitacora = id_Bitacora+1;
    }
}
