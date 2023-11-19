package Dominio;

import java.util.ArrayList;


public class Puesto {
    private String nombre;
    private String tipo;
    private ArrayList<Tematica> listaTemas;
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTipo(String unTipo){
        this.tipo = unTipo;
    }
    public void setListaTemas(ArrayList<Tematica> unaLista){
        listaTemas = unaLista;
    }
    public ArrayList<Tematica> getListaTemas(){
        return this.listaTemas;
    }

    public void addTema(Tematica unTema){
        this.listaTemas.add(unTema);
    }
    
    public String obtenerTemas(){
        String retorno = "";
        for(int i = 0; i<this.listaTemas.size(); i++){
            if((i-1)==this.listaTemas.size()){
                retorno += this.listaTemas.get(i);
            }
            else{
                retorno += this.listaTemas.get(i)+"," ;
            } 
        }
        return retorno;
    }

    public Puesto(String unNombre, String unTipo, ArrayList<Tematica> unaLista){
        setNombre(unNombre);
        setTipo(unTipo);
        setListaTemas(unaLista);
    }
    
    
    
    public boolean temaDeInteres(Tematica unTema){
        boolean retorno = false; 
        for (Tematica recorrido : this.listaTemas){
            if(unTema.equals(recorrido)){
                retorno = true;
            }
        }
        return retorno;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }

}

