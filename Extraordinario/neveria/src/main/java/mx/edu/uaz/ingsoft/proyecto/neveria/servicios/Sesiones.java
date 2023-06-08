package mx.edu.uaz.ingsoft.proyecto.neveria.servicios;

import java.util.ArrayList;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.UsuarioDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IUsuarioDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.usuario;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.InicioSesion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.swing.JOptionPane;
import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.BitacoraControlador.guardarBitacora;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.NieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.PaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.VentaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IVentaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;

public class Sesiones {
    private static final String PERSISTENCE_NAME = "neveria";
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    private static final IUsuarioDAO daoUser;
    private static final INieveDAO daoNieve;
    private static final IPaletaDAO daoPaleta;
    private static final IVentaDAO daoVenta;


    public static List<usuario> listaUsuarios;
        
    static{

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        em = emf.createEntityManager();

        daoUser = new UsuarioDAO(em);
        daoNieve = new NieveDAO(em);
        daoPaleta = new PaletaDAO(em);
        daoVenta = new VentaDAO(em);


    }

    public static void guardarEntidadVenta(venta n){
        if(buscar_existente().equals("Existe")){
                daoVenta.save(n);
        }else{
            JOptionPane.showMessageDialog(null, "Tu usuario no exixtse");
        }
    }
    public static void guardarEntidadNieve(ProductoNieve n){
        if(buscar_existente().equals("Existe")){
                daoNieve.save(n);
        }else{
            JOptionPane.showMessageDialog(null, "Tu usuario no exixtse");           
        }
    }
    public static void guardarEntidadPaleta(ProductoPaleta n){
        if(buscar_existente().equals("Existe")){
                daoPaleta.save(n);
        }else{
            JOptionPane.showMessageDialog(null, "Tu usuario no exixtse");           
        }
    }
    
    public static void borrarEntidadVenta(Long i1){
        if(buscar_existente().equals("Existe")){
                daoVenta.delete(daoVenta.findById(i1));
                guardarBitacora(Constantes.ACCION_ELIMINAR,Constantes.NAME_VENTA);
        }
    }
    public static void borrarEntidadNieve(Long i1){
        if(buscar_existente().equals("Existe")){
            daoNieve.delete(daoNieve.findById(i1));
            guardarBitacora(Constantes.ACCION_ELIMINAR,Constantes.NAME_NIEVE);
        }
    }
    public static void borrarEntidadPaleta(Long i1){
        if(buscar_existente().equals("Existe")){
                daoPaleta.delete(daoPaleta.findById(i1));
                guardarBitacora(Constantes.ACCION_ELIMINAR,Constantes.NAME_PALETA);
        }
    }
    
    public static List<venta> buscarVentas(){
        if(buscar_existente().equals("Existe")){
                return daoVenta.findAll();
        }else{
            //Do algo
        }
        return null;
    }
    public static List<ProductoNieve> buscarNieve(){
        if(buscar_existente().equals("Existe")){
                return daoNieve.findAll();
        }
        return null;
    }
    public static List<ProductoPaleta> buscarPaleta(){
        if(buscar_existente().equals("Existe")){
                return daoPaleta.findAll();
        }
        return null;
    }
    
    private static List<usuario> obtenerListadoUsuarios() {
        List<usuario> salida=null;
        try {
            salida= daoUser.findAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }
    
    public static String buscar_existente(){
        listaUsuarios = obtenerListadoUsuarios();
        String text = InicioSesion.getUser();
        String pass = InicioSesion.getPass();
        String val = "No Existe";
        for (usuario e : listaUsuarios) {
            String user = e.getUser_us();
            String passUs = e.getPass_us();
            if (text.equals(user) && pass.equals(passUs)) {
                val = "Existe";
                break;
            }
        }
        System.out.println(val);
        return val;
    }
    
    private static void mostrarListadoUsuarios() {
        var lp = obtenerListadoUsuarios();
        for(var v : lp){
            System.out.println(v);
        }
    }
    
    private static void mostrarInformacion() {

        mostrarListadoUsuarios();
        
    }
}
