package mx.edu.uaz.ingsoft.proyecto.neveria.programas;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.NieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.PaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.implementaciones.VentaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.INieveDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IPaletaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IVentaDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.venta;
import mx.edu.uaz.ingsoft.proyecto.neveria.servicios.VentasService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController.guardar;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.VentaControlador.getVentaId;
import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.VentaControlador.getcontador;
import static mx.edu.uaz.ingsoft.proyecto.neveria.servicios.Sesiones.buscarVentas;
import static mx.edu.uaz.ingsoft.proyecto.neveria.servicios.VentasService.*;

public class llenadoventas {
    private static final String PERSISTENCE_NAME = "neveria";
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    public static final IVentaDAO daoVenta;
    private static final INieveDAO daoNieve;
    private static final IPaletaDAO daoPaleta;

    static{

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        em = emf.createEntityManager();

        daoNieve = new NieveDAO(em);
        daoPaleta = new PaletaDAO(em);
        daoVenta = new VentaDAO(em);

    }
    public static double getPrecio(venta n1){
        Double precio;
        if(n1.getTipo_prod().equals("Nieve")){
            precio = daoNieve.findById(BuscaridN()).getPrecio_nieve();
            return precio;
        }
        if(n1.getTipo_prod().equals("Paleta")){
            precio = daoPaleta.findById(BuscaridP()).getPrecio_paleta();
            return precio;
        }
        return 0;
    }
    public static void llenarVenta(venta n1){
        n1.setId_Venta(getVentaId());
        n1.setTipo_prod(VentasService.getVentanatipo());
        n1.setSabor_prod(VentasService.getVentanasabor());
        n1.setTamaño_prod(VentasService.getVentanatamaño());
        n1.setTipodel_prod(VentasService.getVentanatipodel());
        n1.setContador_id(getcontador());
        n1.setPrecio_prod(getPrecio(n1));
        guardar("Venta", n1);
    }

    public static List<venta> llenarlistaVenta() {

        List<venta> salida=null;
        try {
            salida = buscarVentas();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(salida == null){
            salida = new ArrayList<>();
        }
        return salida;
    }


}
