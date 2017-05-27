/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAMuchos_bidireccional;

import MuchosAMuchos_unidireccional.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author cesar
 */
@Entity
public class Empleado22 implements Serializable{
    
    //propietario de la relacion
    //un empleado puede estar asignado a muchos proyectos
    //en un proyecto se asignan a muchos empleados
    @Id
    @Column(length=3)
    private String codemple;
    private String nomemple;
    @ManyToMany
    @JoinTable(name="tabla_union_emplado22_proyecto22", 
            joinColumns = @JoinColumn(name="codemple22_fk"),
            inverseJoinColumns = @JoinColumn(name="codproyecto22_fk")
            )
    private List<Proyecto22> proyectos22;

    public Empleado22(String codemple, String nomemple) {
        this.codemple = codemple;
        this.nomemple = nomemple;
    }

    public String getCodemple() {
        return codemple;
    }

    public void setCodemple(String codemple) {
        this.codemple = codemple;
    }

    public String getNomemple() {
        return nomemple;
    }

    public void setNomemple(String nomemple) {
        this.nomemple = nomemple;
    }

    public List<Proyecto22> getProyectos22() {
        return proyectos22;
    }

    public void setProyectos22(List<Proyecto22> proyectos22) {
        this.proyectos22 = proyectos22;
    }

   

    
    
    

   

   
    
    
}
