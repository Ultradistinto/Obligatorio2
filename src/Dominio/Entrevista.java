package Dominio;


public class Entrevista { 
    Evaluador evaluador;
    int puntaje;
    String comentarios;
    int numero;
    
    public void setEvaluador(Evaluador unEvaluador){
        this.evaluador = unEvaluador;
    }
    
    public void setPuntaje(int unPuntaje){
        this.puntaje = unPuntaje;
    }
    
    public int getPuntaje(){
        return this.puntaje ;
    }
    
    public void setComent(String unComentario){
        this.comentarios = unComentario;
    }
    
    public void setNumero(int unNumero){
        this.numero = unNumero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getComentarios(){
        return this.comentarios;
    }
    
    public String getComentarioColoreado(String unTexto){
        String retornado = "<html>";
        String[] retorno = this.comentarios.split(unTexto);
        for(int i = 0; i < retorno.length; i++){
            retornado += retorno[i];
            retornado += "<font color='red'>";
            retornado += unTexto;
            retornado += "</font>";
        }
        retornado+="</html>";
        
        return retornado;
    }
    
    public Evaluador getEvaluador(){
        return this.evaluador;
    }
    
    public Entrevista(Evaluador unEvaluador, int unPuntaje, String unComentario,int unNumero){
        setEvaluador(unEvaluador);
        setPuntaje(unPuntaje);
        setComent(unComentario);
        setNumero(unNumero);
    }
    
    public boolean entrevistasValidas(String texto){
        boolean retorno = false; 
        if (this.comentarios.contains(texto)){
            retorno = true;
        }
        return retorno;
    }
}
