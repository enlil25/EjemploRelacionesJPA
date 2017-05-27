/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos_bidireccional;

import UnoAMuchos_Unidireccional.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author cesar
 */
@Entity
public class Departamento44 implements Serializable {

    //propietario inverso de la relacion en este caso
    @Id
    @Column(length = 3)
    private String coddepart;
    private String nombredep;
    @OneToMany(mappedBy = "departamento44")
    private List<Usuario44> usuarios44;

    public Departamento44(String coddepart, String nombredep) {
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

    public List<Usuario44> getUsuarios44() {
        return usuarios44;
    }

    public void setUsuarios44(List<Usuario44> usuarios44) {
        this.usuarios44 = usuarios44;
    }

}
