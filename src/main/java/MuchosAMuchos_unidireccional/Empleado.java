/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuchosAMuchos_unidireccional;

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
public class Empleado implements Serializable{
    
    //propietario de la relacion
    //un empleado puede estar asignado a muchos proyectos
    //en un proyecto se asignan a muchos empleados
    @Id
    @Column(length=3)
    private String codemple;
    private String nomemple;
    @ManyToMany
    @JoinTable(name="tabla_union_emplado_proyecto", 
            joinColumns = @JoinColumn(name="codemple_fk"),
            inverseJoinColumns = @JoinColumn(name="codproyecto_fk")
            )
    private List<Proyecto> proyectos;

    public Empleado(String codemple, String nomemple) {
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

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    
}
