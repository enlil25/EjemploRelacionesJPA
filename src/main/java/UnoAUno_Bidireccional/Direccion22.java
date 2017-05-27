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
public class Direccion22 implements Serializable {
    //propietario inverso de la relacion

    @Id
    @Column(length=3)
    private String cod_dir;
    private String nomdir;
    @OneToOne(mappedBy="direccion")
    private Cliente22 cliente;

    public Direccion22(String cod_dir, String nomdir) {
        this.cod_dir = cod_dir;
        this.nomdir = nomdir;
    }

    public String getCod_dir() {
        return cod_dir;
    }

    public void setCod_dir(String cod_dir) {
        this.cod_dir = cod_dir;
    }

    public String getNomdir() {
        return nomdir;
    }

    public void setNomdir(String nomdir) {
        this.nomdir = nomdir;
    }

    public Cliente22 getCliente() {
        return cliente;
    }

    public void setCliente(Cliente22 cliente) {
        this.cliente = cliente;
    }
    
    

}
