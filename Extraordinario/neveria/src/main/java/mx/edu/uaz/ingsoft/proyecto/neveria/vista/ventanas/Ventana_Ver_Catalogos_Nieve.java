package mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas;


import mx.edu.uaz.ingsoft.proyecto.neveria.vista.utiles.invocar_Ventanas;
import mx.edu.uaz.ingsoft.proyecto.neveria.vista.ventanas.Bases_Para_Ventanas.Ventana_Ver_Catalogos;
import mx.edu.uaz.ingsoft.proyecto.neveria.programas.mandarListas;


import javax.swing.*;



public class Ventana_Ver_Catalogos_Nieve extends Ventana_Ver_Catalogos {

    private static JTextArea M=new JTextArea(20,20);
    private static JButton bAgregar=new JButton("Agregar");
    private static JButton bEliminar=new JButton("Eliminar");


    public Ventana_Ver_Catalogos_Nieve() {
        super("Catalogos Nieve",M,bAgregar,bEliminar);
        M.setText(mandarListas.mandarLisN());
        M.setEditable(false);
        bAgregar.addActionListener(invocar_Ventanas.capturarDatosN);
        bEliminar.addActionListener(invocar_Ventanas.abrir_BorradorN);
    }
}