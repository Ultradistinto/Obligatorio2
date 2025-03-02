

package Dominio;

import java.io.Serializable;

public class Evaluador implements Serializable{
    private String nombre;
    private int cedula;
    private String direccion;
    private int ingreso;
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCedula(int unaCedula){
        this.cedula = unaCedula;
    }
    
    public int getCedula(){
        return this.cedula;
    }
    
    public void setDireccion(String unaDireccion){
        this.direccion = unaDireccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setIngreso(int unIngreso){
        this.ingreso = unIngreso;
    }
    
    public int getIngreso(){
        return this.ingreso ;
    }
    
    public Evaluador(String unNombre, int unaCedula, String unaDireccion, int unIngreso ){
        setNombre(unNombre);
        setCedula(unaCedula);
        setDireccion(unaDireccion);
        setIngreso(unIngreso);
    }
    
    @Override
    public String toString(){
        return this.nombre + "(" + this.cedula + ")";
    }
}
