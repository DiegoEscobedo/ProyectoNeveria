package mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class ListaButton {
    private List<JButton> listaBotones;
    public ListaButton(){
        listaBotones = new ArrayList<>();
    }
    public void crearBotones(List<String> nombresBotones){
        listaBotones=nombresBotones.stream()
                .filter(Objects::nonNull)
                .map(titulo -> new JButton(titulo))
                .collect(Collectors.toList());
    }
    public void crearBotones(String[] nombresBotones){
        if(Objects.nonNull(nombresBotones)){
            crearBotones(Arrays.asList(nombresBotones));
        }
    }
    public void agregarBoton(String tituloBoton){
        if(! existeBoton(tituloBoton)){
            listaBotones.add(new JButton(tituloBoton));
        }
    }
    public void agregarBotones(List<String> titulosBotones){
        if(Objects.nonNull(titulosBotones)){
            listaBotones.addAll(
                    titulosBotones.stream()
                            .filter(Objects::nonNull)
                            .map(titulo->new JButton(titulo))
                            .collect(Collectors.toList())
            );
        }
    }
    public void agregarBotones (String[] titulosBotones){
        if(Objects.nonNull(titulosBotones)){
            agregarBotones(Arrays.asList(titulosBotones));
        }
    }
    public boolean existeBoton(String tituloBoton) {
        return listaBotones.stream()
                .map(boton->boton.getText())
                .anyMatch(titulo->titulo.equalsIgnoreCase(tituloBoton));
    }
    public List<JButton> getBotones(){
        return List.copyOf(listaBotones);
    }
    public Optional<JButton> getButton(int indice){
        return (indice < 0 || indice >= listaBotones.size()) ?
                Optional.empty() : Optional.of(listaBotones.get(indice));
    }
    public Optional<JButton> getButton(String titulo){
        return listaBotones.stream()
                .filter(boton -> boton.getText().equalsIgnoreCase(titulo))
                .findFirst();
    }
    public int size(){
        return listaBotones.size();
    }
}
