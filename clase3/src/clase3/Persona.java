/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Maka
 */
public class Persona {
    //atributos
    private  String nombre;
    private  String apellido;
    private int anoNac;
    
    //propiedades en forma de metodo
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre (String value) {
        this.nombre = value;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido (String value) {
        this.apellido = value;
    }
    
    public int getAnoNac(){
        return anoNac;
    }
    
    public void setAnoNac (int value) {
        this.anoNac = value;
    }
    
    //metodos
    public String nombreCompleto(){
        return nombre + ", " +apellido;
    }
    
    public String toString(){
        return nombre + ", " + apellido + ". " + anoNac;
    }
    
    //constructores
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido, int anoNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.anoNac = anoNac;
    }
}
