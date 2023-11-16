/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import Logica.Postulante;
/**
 *
 * @author Santi
 */
public class Sistema {
    
    private ArrayList<Postulante> ListaPostulantes;
    private ArrayList<Tematica> ListaTematica;
    private ArrayList<Evaluador> ListaEvaluadores;
    private ArrayList<Puesto> ListaPuestos;
    
    public void addPostulante(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unMail, String unLinkedin, String unTipo ){
        boolean Agrego = true ;
        for(Postulante recorrido:ListaPostulantes){
            if(recorrido.getCedula() == unaCedula){
                Agrego = false;
            }
        }
        if(Agrego){
            Postulante nuevoPostulante = new Postulante(unNombre,unaCedula,unaDireccion,unTelefono,unMail,unLinkedin,unTipo);
            ListaPostulantes.add(nuevoPostulante);
        }
    }
    
    public void addTematica(String unNombre, String unaDescripcion){
        boolean Agrego = true ;
        for(Tematica recorrido:ListaTematica){
            if(recorrido.getNombre().equals(unNombre)){
                Agrego = false;
            }
        }
        if(Agrego){
            Tematica posibleTema = new Tematica(unNombre,unaDescripcion);
            ListaTematica.add(posibleTema);
        }
    }
    
    public void removePostulante(Postulante post){
        ListaPostulantes.remove(post);
    }
    
    public void addEvaluador(String unNombre, int unaCedula, String unaDireccion, int unIngreso ){
        boolean Agrego = true ;
        for(Evaluador recorrido:ListaEvaluadores){
            if(recorrido.getCedula() == unaCedula){
                Agrego = false;
            }
        }
        if(Agrego){
            Evaluador nuevoEvaluador = new Evaluador(unNombre,unaCedula,unaDireccion,unIngreso);
            ListaEvaluadores.add(nuevoEvaluador);
        }
    }
    
    public void addPuesto(String unNombre, String unTipo){
        boolean Agrego = true;
        for(Puesto recorrido:ListaPuestos){
            if(recorrido.getNombre().equals(unNombre)){
                Agrego = false;
            }
        }
        if(Agrego){
            Puesto nuevoPuesto = new Puesto(unNombre,unTipo);
            ListaPuestos.add(nuevoPuesto);
        }
    }
    
    public void postulantesValidos(Puesto unPuesto, int unNivel){
        String[] temas = unPuesto.getTema().split(",");
        ArrayList<Postulante> ListaPostulantesValidos = new ArrayList<Postulante>();
        for(Postulante recorrido:this.ListaPostulantes){
            boolean[] valido = new boolean[temas.length];
            boolean valTotal = true;
            for(int i = 0; i < temas.length; i++){
                valido[i]=recorrido.esValido(temas[i],unNivel);
            }
            for(boolean val:valido){
                if(!val && valTotal){
                    valTotal = false;
                }
            }
            if(valTotal){
                ListaPostulantesValidos.add(recorrido);
            }
        }
    }
}
