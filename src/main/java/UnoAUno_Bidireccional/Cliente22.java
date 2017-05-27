/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAUno_Bidireccional;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author cesar
 */
@Entity
public class Cliente22 implements Serializable {
    
    //propietario de la relacion
    @Id
    @Column(length=3)
    private String codcli;
    private String nomcli;
    @OneToOne
    @JoinColumn(name="coddir_fk")
    private Direccion22 direccion;

    public Cliente22(String codcli, String nomcli) {
        this.codcli = codcli;
        this.nomcli = nomcli;
    }
    
    

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Direccion22 getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion22 direccion) {
        this.direccion = direccion;
    }

   
    
    
}
