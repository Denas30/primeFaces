/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Daniel
 */
@ManagedBean(name = "people")
@RequestScoped
public class PersonaBean {
    
    private String nombre;
    private int edad;
    private String saludo;

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
   
    public String saludar(){
         saludo= "Hola " + nombre+ " La edad que tienes es: " +edad+ " años"; 
         FacesMessage miMensaje = new FacesMessage(FacesMessage.SEVERITY_INFO,"aviso", saludo);
         FacesContext.getCurrentInstance().addMessage(null,miMensaje);
         
         return "";//request.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
