package Dominio;


public class Entrevista { 
    Evaluador evaluador;
    Postulante postulante;
    int puntaje;
    String comentarios;
    int numero;
    
    public void setEvaluador(Evaluador unEvaluador){
        this.evaluador = unEvaluador;
    }
    
    public void setPuntaje(int unPuntaje){
        this.puntaje = unPuntaje;
    }
    
    public void setComent(String unComentario){
        this.comentarios = unComentario;
    }
    public void setPostulante(Postulante unPostulante){
        this.postulante = unPostulante;
    }
    
    public void setNumero(int unNumero){
        this.numero = unNumero;
    }
    
    public Entrevista(Evaluador unEvaluador, int unPuntaje, String unComentario,int unNumero){
        setEvaluador(unEvaluador);
        setPuntaje(unPuntaje);
        setComent(unComentario);
    }
    
     public boolean entrevistasValidas(String texto){
        boolean retorno = false; 
        if (this.comentarios.contains(texto)){
            retorno = true;
        }
        return retorno;
    }
}
