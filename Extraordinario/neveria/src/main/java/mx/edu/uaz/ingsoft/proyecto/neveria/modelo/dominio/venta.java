package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class venta implements Serializable{

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String tipo_prod;
    @Column
    private String sabor_prod;
    @Column
    private String tamaño_prod;
    @Column
    private String tipodel_prod;
    @Column
    private Boolean activo;
    @Column
    private Double precio_prod;
    @Column
    private Long id_Venta;
    @Column
    private Long contador_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_prod() {
        return tipo_prod;
    }

    public void setTipo_prod(String tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public String getSabor_prod() {
        return sabor_prod;
    }

    public void setSabor_prod(String sabor_prod) {
        this.sabor_prod = sabor_prod;
    }

    public String getTamaño_prod() {
        return tamaño_prod;
    }

    public void setTamaño_prod(String tamaño_prod) {
        this.tamaño_prod = tamaño_prod;
    }

    public String getTipodel_prod() {
        return tipodel_prod;
    }

    public void setTipodel_prod(String tipodel_prod) {
        this.tipodel_prod = tipodel_prod;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(Double precio_prod) {
        this.precio_prod = precio_prod;
    }

    public Long getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(Long id_Venta) {
        this.id_Venta = id_Venta;
    }

    public Long getContador_id() {
        return contador_id;
    }

    public void setContador_id(Long contador_id) {
        this.contador_id = contador_id;
    }

    @Override
    public String toString() {
        return "venta{" +
                "id=" + id +
                ", tipo_prod='" + tipo_prod + '\'' +
                ", sabor_prod='" + sabor_prod + '\'' +
                ", tamaño_prod='" + tamaño_prod + '\'' +
                ", tipodel_prod='" + tipodel_prod + '\'' +
                ", activo=" + activo +
                ", precio_prod=" + precio_prod +
                ", id_Venta=" + id_Venta +
                ", contador_id=" + contador_id +
                '}';
    }

}
