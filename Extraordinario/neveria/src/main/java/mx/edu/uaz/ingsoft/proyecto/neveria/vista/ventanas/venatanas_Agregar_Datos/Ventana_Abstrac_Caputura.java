package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.venatanas_Agregar_Datos;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.CaprutarDatos.panel_CapturaEntidad;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.IContenedorEnty;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public abstract class Ventana_Abstrac_Caputura<T extends panel_CapturaEntidad,U>extends JFrame implements IContenedorEnty<U> {
    protected T panel1;
    protected JPanel p1,p2,p3,p4,p5;
    public Ventana_Abstrac_Caputura(String titulo){
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        panel1=null;
        p1=null;
        p2=null;
        p3=null;
        p4=null;
        p5=null;
        ponerpaneles();

    }
    protected abstract void ponerpaneles();

    protected void fijarPaneles(){
        //Panel inicio
        if(Objects.nonNull(p1)){
            getContentPane().add(p1,BorderLayout.PAGE_START);
        }
        //Panel izq
        if(Objects.nonNull(p2)){
            getContentPane().add(p2,BorderLayout.LINE_START);
        }
        //Panel centro
        if(Objects.nonNull(p3)){
            getContentPane().add(p3,BorderLayout.CENTER);
        }
        //panel derecha
        if(Objects.nonNull(p4)){
            getContentPane().add(p4,BorderLayout.LINE_END);
        }
        //panel abajo
        if(Objects.nonNull(p5)){
            getContentPane().add(p5,BorderLayout.PAGE_END);
        }
        //cap
        if(Objects.nonNull(panel1)) {
            getContentPane().add(panel1, BorderLayout.CENTER);
        }
    }

    protected void agregarPanelIzq(JPanel panelIzquierdo){
        p2 = panelIzquierdo;
    }
    protected void agregarPanelDer(JPanel panelDerecho){
        p4 = panelDerecho;
    }
    protected void agregarPanelArriba(JPanel panelSuperior){
        p1 = panelSuperior;
    }
    protected void agregarPanelAbajo(JPanel panelInferior){
        p5 = panelInferior;
    }
    protected void agregarPanelCentral(T panelCentral){
        panel1 = panelCentral;
    }
    protected void agregarPanelCentralP(JPanel panelCentralP) {
        p3 = panelCentralP;
    }

    public abstract void limpiarCampos();
}
