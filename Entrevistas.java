/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Santi
 */
public class Entrevistas { 
    Evaluador evaluador;
    int puntaje;
    String comentarios;
    
    public void setEvaluador(Evaluador unEvaluador){
        this.evaluador = unEvaluador;
    }
    
    public void setPuntaje(int unPuntaje){
        this.puntaje = unPuntaje;
    }
    
    public void setComent(String unComentario){
        this.comentarios = unComentario;
    }
    
    public Entrevistas(Evaluador unEvaluador, int unPuntaje, String unComentario){
        setEvaluador(unEvaluador);
        setPuntaje(unPuntaje);
        setComent(unComentario);
    }
}
