/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Santi
 */
public class Evaluador {
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
        this.nombre = unaDireccion;
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
}
