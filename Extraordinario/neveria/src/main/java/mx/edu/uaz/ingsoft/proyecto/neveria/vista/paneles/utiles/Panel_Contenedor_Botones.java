package mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles;

import mx.edu.uaz.ingsoft.proyecto.neveria.vista.paneles.utiles.interfaces.ICOntenedorDeBotones;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.ListaButton;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class Panel_Contenedor_Botones extends JPanel implements ICOntenedorDeBotones {
    private final ListaButton listaBotones;
    public Panel_Contenedor_Botones(boolean orienHorizontal){
        listaBotones = new ListaButton();
        setLayout(new BoxLayout(this, (orienHorizontal)?BoxLayout.LINE_AXIS:BoxLayout.PAGE_AXIS));
    }
    public Panel_Contenedor_Botones(){
        this(true);
    }
    public Panel_Contenedor_Botones(String ...nombreBotones){
        this();
        agregarBotones(nombreBotones);
    }
    public void agregarBotones(List<String> nombresBotones){
        removeAll();
        listaBotones.agregarBotones(nombresBotones);
        for(var boton:listaBotones.getBotones()){
            add(boton);
        }
    }
    public void agregarBotones(String[] nombresBotones){
        agregarBotones(Arrays.asList(nombresBotones));
    }
    public void agregarBoton(String textoBoton){
        listaBotones.agregarBoton(textoBoton);
        var unBoton = listaBotones.getButton(textoBoton);
        if(unBoton.isPresent()){
            add(unBoton.get());
        }
    }

    @Override
    public void setActionListener(ActionListener action, int indiceBoton) {
        var unBoton = listaBotones.getButton(indiceBoton);
        if(unBoton.isPresent()){
            unBoton.get().addActionListener(action);
        }
    }

    @Override
    public void setActionListener(ActionListener action, String nombreBoton) {
        var unBoton = listaBotones.getButton(nombreBoton);
        if(unBoton.isPresent()){
            unBoton.get().addActionListener(action);
        }
    }
}
