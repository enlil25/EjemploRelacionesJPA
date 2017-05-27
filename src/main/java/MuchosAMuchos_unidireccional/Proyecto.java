/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAMuchos_unidireccional;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author cesar
 */
@Entity
public class Proyecto implements Serializable{
    //propietario inverso de la relacion
    @Id
    @Column(length=3)
    private String codproyecto;
    private String nombreproyecto;

    public Proyecto() {
    }

    public Proyecto(String codproyecto, String nombreproyecto) {
        this.codproyecto = codproyecto;
        this.nombreproyecto = nombreproyecto;
    }

    public String getCodproyecto() {
        return codproyecto;
    }

    public void setCodproyecto(String codproyecto) {
        this.codproyecto = codproyecto;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public void setNombreproyecto(String nombreproyecto) {
        this.nombreproyecto = nombreproyecto;
    }
    
    
}
