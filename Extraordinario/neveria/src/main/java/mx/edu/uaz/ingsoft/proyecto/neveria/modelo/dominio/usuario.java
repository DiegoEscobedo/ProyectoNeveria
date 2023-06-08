package mx.edu.uaz.ingsoft.proyecto.neveria.modelo.dominio;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class usuario implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String user_norm;
    @Column
    private String pass_user;
    @Column
    private Boolean activo;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getUser_us() {
        return user_norm;
    }
    public void setUser_us(String user) {
        this.user_norm = user;
    }

    public String getPass_us() {
        return pass_user;
    }

    public void setPass_us(String pass) {
        this.pass_user = pass;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", user=" + user_norm + '\'' +
                ", pass=" + pass_user + '\'' +
                '}';
    }
}
