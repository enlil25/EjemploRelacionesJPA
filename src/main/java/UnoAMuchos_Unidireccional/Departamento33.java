/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos_Unidireccional;

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
public class Departamento33 implements Serializable {
    
    //propietario de la relacion en este caso
    
    @Id
    @Column(length = 3)
    private String coddepart;
    private String nombredep;
    @OneToMany
    @JoinColumn(name="coddepart_fk")
    private List<Usuario33> usuarios33;

    public Departamento33(String coddepart, String nombredep) {
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

    public List<Usuario33> getUsuarios33() {
        return usuarios33;
    }

    public void setUsuarios33(List<Usuario33> usuarios33) {
        this.usuarios33 = usuarios33;
    }
    
    

}
