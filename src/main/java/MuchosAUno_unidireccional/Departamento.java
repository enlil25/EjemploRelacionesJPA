/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAUno_unidireccional;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author cesar
 */
@Entity
public class Departamento implements Serializable {

    @Id
    @Column(length = 3)
    private String coddepart;
    private String nombredep;

    public Departamento(String coddepart, String nombredep) {
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

}
