/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoAMuchos_unidireccional_tablaunion;

import UnoAMuchos_Unidireccional.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author cesar
 */
@Entity
public class Departamento55 implements Serializable {
    
    //propietario de la relacion en este caso
    
    @Id
    @Column(length = 4)
    private String coddepart;
    private String nombredep;
    @OneToMany
    @JoinTable(name = "tablaunion_departamento55_usuario55" , 
            joinColumns = @JoinColumn(name="coddep_fk"),
            inverseJoinColumns = @JoinColumn(name = "codusuario_fk"))
    private List<Usuario55> usuarios55;

    public Departamento55(String coddepart, String nombredep) {
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

    public List<Usuario55> getUsuarios55() {
        return usuarios55;
    }

    public void setUsuarios55(List<Usuario55> usuarios55) {
        this.usuarios55 = usuarios55;
    }

    

    
    

}
