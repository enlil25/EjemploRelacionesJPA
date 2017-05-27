/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos_Unidireccional;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author cesar
 */
@Entity
public class Usuario33 implements Serializable{
    
    @Id
    private String codusuario;
    private String nombreusuario;

    public Usuario33() {
    }
    

    public Usuario33(String codusuario, String nombreusuario) {
        this.codusuario = codusuario;
        this.nombreusuario = nombreusuario;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    
    
    
}
