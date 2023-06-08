package mx.edu.uaz.ingsoft.proyecto.neveria.controladores;

import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.daos.interfaces.IBaseDAO;
import mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio.ProductoPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.Constantes;
import mx.edu.uaz.ingsoft.proyecto.neveria.utiles.validadores.implementaciones.ValidadorPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.PanelCapturaPaleta;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos.Ventana_Captura_Paleta;


import javax.swing.*;

import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.BitacoraControlador.guardarBitacora;
import static mx.edu.uaz.ingsoft.proyecto.neveria.controladores.SesionController.guardar;

public class PaletaControlador extends EntityController<ProductoPaleta, PanelCapturaPaleta>{

    public PaletaControlador(IBaseDAO dao, Ventana_Captura_Paleta ventanaCP){
        super(dao,ventanaCP);
        ventanaCP.setActionListener(e->accionAceptar(),"Aceptar");
        ventanaCP.setActionListener(e->accionCancelar(),"Cancelar");
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
        ValidadorPaleta validarP=new ValidadorPaleta();
        if (validarP.validar(getEntidad())){
            guardar("Paleta", getEntidad());
            getVentanaCaptura().limpiarCampos();
            guardarBitacora(Constantes.ACCION_LLENARB, Constantes.NAME_PALETA);
        }else {
            JOptionPane.showMessageDialog(null,"Los datos son incorrectos");
            guardarBitacora(Constantes.ACCION_LLENARF,Constantes.NAME_PALETA);
        }
    }
    @Override
    public void runControlador() {
        getVentanaCaptura().setVisible(true);
    }
}
