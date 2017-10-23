/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Daniel
 */
@ManagedBean(name = "form")
@RequestScoped
public class FormularioBean {

   private String nombre;
   private String clave;
   private String edad;
   private String ciudad;
   private String sexo;
   private String[]hobbie;
   
    public FormularioBean() {
        
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String[] getHobbie() {
        return hobbie;
    }

    public void setHobbie(String[] hobbie) {
        this.hobbie = hobbie;
    }
    
    public ArrayList<String> getCiudades(){
    
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Caracas");
        lista.add("Mexico");
        lista.add("Chile");
    
    return lista;
    }
    
    public String getHobbieToString(){
        return Arrays.toString(hobbie);
    
    }
    
    
    public String registrar(){
    
     return "registroOK";
    }
    
}
