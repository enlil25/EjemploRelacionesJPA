/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAUno_bidireccional;

import UnoAMuchos_Unidireccional.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author cesar
 */
@Entity
public class Departamento22 implements Serializable {
//propietario inverso de la relacion
    @Id
    @Column(length = 3)
    private String coddepart;
    private String nombredep;
    @OneToMany(mappedBy = "departamento")
    private List<Usuario22> usuarios;

    public Departamento22(String coddepart, String nombredep) {
        this.coddepart = coddepart;
        this.nombredep = nombredep;
    }

    public String getCoddepart() {
        return coddepart;
    }

    public void setCoddepart(String coddepart) {
        this.coddepart = coddepart;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    public List<Usuario22> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario22> usuarios) {
        this.usuarios = usuarios;
    }
    
    

}
