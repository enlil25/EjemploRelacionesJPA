/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAMuchos_bidireccional;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author cesar
 */
@Entity
public class Proyecto22 implements Serializable{
    //propietario inverso de la relacion
    @Id
    @Column(length=3)
    private String codproyecto;
    private String nombreproyecto;
    @ManyToMany(mappedBy = "proyectos22")
    private List<Empleado22> empleados22;

    public Proyecto22(String codproyecto, String nombreproyecto) {
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

    public List<Empleado22> getEmpleados22() {
        return empleados22;
    }

    public void setEmpleados22(List<Empleado22> empleados22) {
        this.empleados22 = empleados22;
    }
    
    
    
   
    
    
    
    
}
