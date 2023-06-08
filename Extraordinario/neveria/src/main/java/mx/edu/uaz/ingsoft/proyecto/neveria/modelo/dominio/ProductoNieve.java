package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class ProductoNieve implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String tamaño_nieve;
    @Column
    private String sabor_nieve;
    @Column
    private Boolean activo;
    @Column
    private String tipo_nieve;
    @Column
    private Double precio_nieve;

    public String getTipo_nieve() {
        return tipo_nieve;
    }

    public void setTipo_nieve(String tipo_nieve) {
        this.tipo_nieve = tipo_nieve;
    }

    public Double getPrecio_nieve() {
        return precio_nieve;
    }

    public void setPrecio_nieve(Double precio_nieve) {
        this.precio_nieve = precio_nieve;
    }

   // @OneToMany(mappedBy = "Nieve", fetch=FetchType.EAGER)

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

    public String gettamaño_nieve() {
        return tamaño_nieve;
    }

    public void settamaño_nieve(String tamaño_nieve) {
        this.tamaño_nieve = tamaño_nieve;
    }

    public String getsabor_nieve() {
        return sabor_nieve;
    }

    public void setsabor_nieve(String sabor_nieve) {
        this.sabor_nieve = sabor_nieve;
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
                ", sabor_nieve=" + sabor_nieve+ '\'' +
                ", tipo_nieve=" + tipo_nieve+ '\'' +
                ", tamaño_nieve='" + tamaño_nieve + '\'' +
                ", precio_nieve=" + precio_nieve +
                '}';
    }


}
