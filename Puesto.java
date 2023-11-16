package Logica;

import java.util.ArrayList;


public class Puesto {
    private String nombre;
    private String tipo;
    private ArrayList<String> ListaTemas;
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTipo(String unTipo){
        this.tipo = unTipo;
    }
    public void addTema(String unTema){
        this.ListaTemas.add(unTema);
    }
    public String getTema(){
        String retorno = "";
        for(int i = 0; i<this.ListaTemas.size(); i++){
            if((i-1)==this.ListaTemas.size()){
                retorno += this.ListaTemas.get(i);
            }
            else{
                retorno += this.ListaTemas.get(i)+"," ;
            } 
        }
        return retorno;
    }
    public Puesto(String unNombre, String unTipo){
        setNombre(unNombre);
        setTipo(unTipo);
    }
}
