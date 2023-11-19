package Dominio;


public class Entrevista { 
    Evaluador evaluador;
    Postulante postulante;
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
    public void setPostulante(Postulante unPostulante){
        this.postulante = unPostulante;
    }
    
    public Entrevista(Evaluador unEvaluador, int unPuntaje, String unComentario, Postulante unPostulante){
        setEvaluador(unEvaluador);
        setPuntaje(unPuntaje);
        setComent(unComentario);
        setPostulante(unPostulante);
    }
    
     public boolean entrevistasValidas(String texto){
        boolean retorno = false; 
        if (this.comentarios.contains(texto)){
            retorno = true;
        }
        return retorno;
    }
}
