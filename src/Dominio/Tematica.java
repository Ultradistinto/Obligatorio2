 package Dominio;

import java.io.Serializable;
import java.util.Set;

public class Tematica implements Serializable{
    private String nombre;
    private String descripcion;

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDescripcion(String unaDescripcion){
        this.descripcion = unaDescripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

    
    public Tematica(String unNombre, String unaDescripcion){
        setDescripcion(unaDescripcion);
        setNombre(unNombre);
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
}
