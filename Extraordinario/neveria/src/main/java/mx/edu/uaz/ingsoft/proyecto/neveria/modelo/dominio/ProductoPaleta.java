package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ProductoPaleta implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String tamaño_paleta;
    @Column
    private String sabor_paleta;
    @Column
    private Boolean activo;
    @Column
    private String tipo_paleta;
    @Column
    private Double precio_paleta;

    public String getTipo_paleta() {
        return tipo_paleta;
    }

    public void setTipo_paleta(String tipo_paleta) {
        this.tipo_paleta = tipo_paleta;
    }

    public Double getPrecio_paleta() {
        return precio_paleta;
    }

    public void setPrecio_paleta(Double precio_paleta) {
        this.precio_paleta = precio_paleta;
    }

    //@OneToMany(mappedBy = "paleta", fetch=FetchType.EAGER)

    /*public Producto(){
        Inventaio=new ArrayList<>();
        activo = true;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettamaño_paleta() {
        return tamaño_paleta;
    }

    public void settamaño_paleta(String tamaño_paleta) {
        this.tamaño_paleta = tamaño_paleta;
    }

    public String getsabor_paleta() {
        return sabor_paleta;
    }

    public void setsabor_paleta(String sabor_paleta) {
        this.sabor_paleta = sabor_paleta;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", sabor_paleta=" + sabor_paleta+ '\'' +
                ", tipo_paleta=" + tipo_paleta +'\''+
                ", tamaño_paleta='" + tamaño_paleta + '\'' +
                ", precio_paleta=" + precio_paleta +
                '}';
    }

}
