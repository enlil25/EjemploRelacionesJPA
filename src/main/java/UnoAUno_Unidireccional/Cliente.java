/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAUno_Unidireccional;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author cesar
 */
@Entity
public class Cliente implements Serializable {
    
    //propietario de la relacion
    @Id
    private String codcli;
    private String nomcli;
    @OneToOne
    @JoinColumn(name="coddir_fk")
    private Direccion direccion;

    public Cliente(String codcli, String nomcli) {
        this.codcli = codcli;
        this.nomcli = nomcli;
    }

    public Cliente(String codcli, String nomcli, Direccion direccion) {
        this.codcli = codcli;
        this.nomcli = nomcli;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
