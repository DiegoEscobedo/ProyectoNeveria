package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBaseDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos.Ventana_Capura_Nieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.PanelCapturarNieve;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.implementaciones.ValidadorNieve;

import javax.swing.*;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.BitacoraControlador.*;
import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController.guardar;

public class NieveControlador extends EntityController<ProductoNieve, PanelCapturarNieve> {
    public NieveControlador(IBaseDAO dao, Ventana_Capura_Nieve ventanaCap){
        super(dao,ventanaCap);
        ventanaCap.setActionListener(e->accionAceptar(),"Aceptar");
        ventanaCap.setActionListener(e->accionCancelar(),"Cancelar");
    }
    private void accionCancelar(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(
                getVentanaCaptura(),
                "¿Quieres salir?");
        if (respuesta ==JOptionPane.OK_OPTION){
            getVentanaCaptura().setVisible(false);
        } else{
            JOptionPane.showMessageDialog(null,"Los datos son incorrectos");
        }
    }

    private void accionAceptar(){
        setEntidad(getVentanaCaptura().obtenerEntidad());
        ValidadorNieve validadorN = new ValidadorNieve();
        if (validadorN.validar(getEntidad())){
            guardar("Nieve", getEntidad());
            getVentanaCaptura().limpiarCampos();
            guardarBitacora(Constantes.ACCION_LLENARB,Constantes.NAME_NIEVE);
        }else{
            JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
            guardarBitacora(Constantes.ACCION_LLENARF,Constantes.NAME_NIEVE);
        }
    }
    @Override
    public void runControlador() {
        getVentanaCaptura().setVisible(true);
    }
}
