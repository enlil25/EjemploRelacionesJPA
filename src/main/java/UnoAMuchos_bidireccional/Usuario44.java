/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos_bidireccional;

import UnoAMuchos_Unidireccional.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author cesar
 */
@Entity
public class Usuario44 implements Serializable{
    
    //propietario de la relacion
    
    @Id
    private String codusuario;
    private String nombreusuario;
   
    @ManyToOne
    @JoinColumn(name="coddepart_fk")
    private Departamento44 departamento44;

    public Usuario44() {
    }
    

    public Usuario44(String codusuario, String nombreusuario) {
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

    public Departamento44 getDepartamento44() {
        return departamento44;
    }

    public void setDepartamento44(Departamento44 departamento44) {
        this.departamento44 = departamento44;
    }
    
    

    
    
    
}
