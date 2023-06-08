package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Bitacora implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String fecha;
    @Column
    private String hora;
    @Column
    private String accion;
    @Column
    private String catalogo;
    @Column
    private Boolean activo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getActivo() {
        return activo;
    }

    @Override
    public String toString(){
        return "Bitacora{ "+
                "id="+id+
                " ,Fecha= "+fecha+
                " ,Hora= "+hora+
                " ,Accion= "+accion+
                " ,Catalogo= "+catalogo+
                " ,Activo= "+ activo;
    }
}
