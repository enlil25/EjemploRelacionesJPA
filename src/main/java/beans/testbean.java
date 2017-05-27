/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import MuchosAMuchos_bidireccional.Empleado22;
import MuchosAMuchos_bidireccional.Proyecto22;
import MuchosAMuchos_unidireccional.Empleado;
import MuchosAMuchos_unidireccional.Proyecto;
import MuchosAUno_unidireccional.Departamento;
import MuchosAUno_unidireccional.Usuario;
import MuchosAUno_bidireccional.Departamento22;
import MuchosAUno_bidireccional.Usuario22;
import UnoAUno_Bidireccional.Cliente22;
import UnoAUno_Bidireccional.Direccion22;
import UnoAUno_Unidireccional.Cliente;
import UnoAUno_Unidireccional.Direccion;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author cesar
 */
@Named
@RequestScoped
@Transactional
public class testbean {

    @PersistenceContext(unitName = "runoamuchos_pu")
    private EntityManager em;

    public void unoauno() {

        //bidireccional
        Direccion22 direccion22 = new Direccion22("001", "av las flores 123");
        Cliente22 cliente22 = new Cliente22("001", "jose perez");
        cliente22.setDireccion(direccion22);
        em.persist(direccion22);
        em.persist(cliente22);

        //unidireccional
        Direccion direccion = new Direccion("001", "av las flores 123");
        Cliente cliente = new Cliente("001", "jose perez");
        cliente.setDireccion(direccion);
        em.persist(direccion);
        em.persist(cliente);
    }

    public void unoamuchos() {

        //unidireccional
        Departamento departamento = new Departamento("001", "ventas");
        Departamento departamento2 = new Departamento("002", "sistemas");

        Usuario usuario = new Usuario("001", "jose perez");
        usuario.setDepartamento(departamento);
        Usuario usuario2 = new Usuario("002", "maria flores");
        usuario2.setDepartamento(departamento);
        Usuario usuario3 = new Usuario("003", "andres garcia");
        usuario3.setDepartamento(departamento2);

        em.persist(departamento);
        em.persist(departamento2);
        em.persist(usuario);
        em.persist(usuario2);
        em.persist(usuario3);

        //bidireccional
        Departamento22 departamento22 = new Departamento22("001", "ventas");
        Departamento22 departamento33 = new Departamento22("002", "sistemas");
        Usuario22 usuario22 = new Usuario22("001", "jose perez");
        usuario22.setDepartamento(departamento22);
        Usuario22 usuario33 = new Usuario22("002", "maria flores");
        usuario33.setDepartamento(departamento22);
        Usuario22 usuario44 = new Usuario22("003", "andres garcia");
        usuario44.setDepartamento(departamento33);

        em.persist(departamento22);
        em.persist(departamento33);
        em.persist(usuario22);
        em.persist(usuario33);
        em.persist(usuario44);
    }

    public void muchosamuchos() {

        //unidireccional
        Proyecto proyecto = new Proyecto("001", "control de cartas de garantia");
        Proyecto proyecto2 = new Proyecto("002", "construccion de ERP");
        Proyecto proyecto3 = new Proyecto("003", "sistematizacion de documentos");
        List<Proyecto> proyectos = new ArrayList();
        proyectos.add(proyecto);
        proyectos.add(proyecto2);
        proyectos.add(proyecto3);
        Empleado empleado = new Empleado("001", "Jose perez");
        empleado.setProyectos(proyectos);

        em.persist(proyecto);
        em.persist(proyecto2);
        em.persist(proyecto3);
        em.persist(empleado);

        //bidireccional
        Proyecto22 proyecto22 = new Proyecto22("001", "control de cartas de garantia");
        Proyecto22 proyecto33 = new Proyecto22("002", "construccion de ERP");
        Proyecto22 proyecto44 = new Proyecto22("003", "sistematizacion de documentos");
        List<Proyecto22> proyectos22 = new ArrayList();
        proyectos22.add(proyecto22);
        proyectos22.add(proyecto33);
        proyectos22.add(proyecto44);
        Empleado22 empleado22 = new Empleado22("001", "Jose perez");
        empleado22.setProyectos22(proyectos22);
        Empleado22 empleado33 = new Empleado22("002", "ruben rojas");
        empleado33.setProyectos22(proyectos22);

        em.persist(proyecto22);
        em.persist(proyecto33);
        em.persist(proyecto44);
        em.persist(empleado22);
        em.persist(empleado33);
    }

    //agrear una accion de consulta para el toque final
//    public void mostrar() {
//        Usuario usuario = em.find(Usuario.class, "001");
//        System.out.println("se encuentra en el departamento:" + usuario.getDepartamento().toString());
//
//        //B) que usuarios tiene el departamento 001
//        System.out.println("El departamento 001 tiene los usuarios :");
//        List<Usuario> usuarios = null;
//        Departamento dep = em.find(Departamento.class, "001");
//        usuarios = dep.getUsuarios();
//        for (Usuario usr : usuarios) {
//            System.out.println(usr.toString());
//        }
//
//        System.out.println("-------------");
//        System.out.println("El departamento 002 tiene los usuarios :");
//        usuarios = null;
//        dep = em.find(Departamento.class, "002");
//        usuarios = dep.getUsuarios();
//        for (Usuario usr : usuarios) {
//            System.out.println(usr.toString());
//        }
//    }
}
