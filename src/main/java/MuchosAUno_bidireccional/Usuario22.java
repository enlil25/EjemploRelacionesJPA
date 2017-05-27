/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAUno_bidireccional;


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
public class Usuario22 implements Serializable{
    //propietario de la relacion
    @Id
    private String codusuario;
    private String nombreusuario;
    @ManyToOne
    @JoinColumn(name="coddep_fk")
    private Departamento22 departamento;

    public Usuario22() {
    }

    public Usuario22(String codusuario, String nombreusuario) {
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

    public Departamento22 getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento22 departamento) {
        this.departamento = departamento;
    }

  
    
    
}
