package mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles;

import javax.swing.*;
import java.awt.*;

import static java.util.Objects.nonNull;

public class SwingUtiles {
    public static JPanel crearBoxPanel(boolean vertical) {
        JPanel unpanel = new JPanel();
        var orientacion = vertical ? BoxLayout.PAGE_AXIS : BoxLayout.LINE_AXIS;
        unpanel.setLayout(new BoxLayout(unpanel,orientacion));
        return unpanel;
    }
    public static JPanel crearVerticalBoxPanel(){
        return crearBoxPanel(true);
    }
    public static void addComPanel(JPanel panel, Component[] components){
        for(var componente:components ){
            if(nonNull(componente)){
                panel.add(componente);
            }
        }
    }
    public static JPanel crearVerticalBoxPanel(Component ...components){
        var componenteS = crearVerticalBoxPanel();
        addComPanel(componenteS, components);
        return componenteS;
    }
    public static JPanel crearHorizontalBoxPanel(){
        return crearBoxPanel(false);
    }
    public static JPanel crearHorizontalBoxPanel(Component ...components){
        var componenteS = crearVerticalBoxPanel();
        addComPanel(componenteS, components);
        return componenteS;

    }
    public static JPanel crearBorderLayoutPanel(){
        return new JPanel(new BorderLayout());
    }
}
