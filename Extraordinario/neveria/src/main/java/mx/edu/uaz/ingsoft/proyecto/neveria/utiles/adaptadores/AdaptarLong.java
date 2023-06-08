package mx.edu.uaz.ingsoft.proyecto.neveria.utiles.adaptadores;


public class AdaptarLong{
    private static Long valor;
    public static Long tranformarLONG(String n){
        valor = Long.parseLong(n);
        return valor;
    }
}
