
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Postulante extends Observable implements Serializable{
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;
    private String tipoTrabajo;
    private ArrayList<String> habilidades;
    private ArrayList<Entrevista> listaEntrevistas;
    

    
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
    
    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    public void setMail(String unMail){
        this.mail = unMail;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public void setLinkedin(String unLinkedin){
        this.linkedin = unLinkedin;
    }
    
    public String getLinkedin(){
        return this.linkedin;
    }
    
    public void setTipoTrabajo(String unTipo){
        this.tipoTrabajo = unTipo;
    }
    
    public String getTipoTrabajo(){
        return this.tipoTrabajo;
    }
    
    public ArrayList<String> getHabilidades(){
        return this.habilidades;
    }
    
    public ArrayList<Entrevista> getEntrevistas(){
        return this.listaEntrevistas;
    }
    
    public boolean esValido(String unaHabilidad, int unNivel){
        boolean retorno = false;

        for(String recorrido:habilidades){
            String[] partes = recorrido.split("\\(|\\)");
            if( partes[0].equals(unaHabilidad) && Integer.parseInt(partes[1])>=unNivel){
                //tirar ventana error
                retorno = true;
            }
        }
        return retorno;
    }
    
    public Postulante(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unMail, String unLinkedin, String unTipo ){
        setNombre(unNombre);
        setCedula(unaCedula);
        setDireccion(unaDireccion);
        setTelefono(unTelefono);
        setMail(unMail);
        setLinkedin(unLinkedin);
        setTipoTrabajo(unTipo);
        habilidades = new ArrayList<>();
        listaEntrevistas = new ArrayList<>();
    }
    
    public void addHablidades(String unNombre, int unNivel){
        boolean flag = false;
        for (int i = 0; i < habilidades.size(); i++) {
            String[] partes = habilidades.get(i).split("\\(|\\)");
            if (partes[0].equals(unNombre)) {
                habilidades.set(i, unNombre + "(" + unNivel + ")");
                flag = true;
                setChanged();
                notifyObservers();
            }
        }

        if(!flag){
            habilidades.add(unNombre+ "(" + unNivel + ")");
            setChanged();
            notifyObservers();
        }
    }
    
    public void removeHablidad(String habilidad){
       habilidades.remove(habilidad);
       setChanged();
       notifyObservers();
    }
    
    public void addEntrev(Evaluador unEvaluador, int unPuntaje, String unComentario, int unNumero){
        Entrevista nuevaEntrev = new Entrevista(unEvaluador, unPuntaje, unComentario, unNumero);
        this.listaEntrevistas.add(nuevaEntrev);
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString(){
        return this.nombre + "(" + this.cedula + ")";
    }
    
    public ArrayList<Entrevista> funcBuscador(String texto){
        ArrayList<Entrevista> retorno = new ArrayList<Entrevista>();
        for(Entrevista recorrido : this.listaEntrevistas){
            if(recorrido.entrevistasValidas(texto)){
                retorno.add(recorrido);
            }
        }
        return retorno;
    }
    
    public boolean validTema(Tematica tema){
        boolean retorno = false;
        for (String recorrido: this.habilidades){
            String[] partes = recorrido.split("\\(|\\)");
            if(Integer.parseInt(partes[1]) >= 5  && tema.getNombre().equals(partes[0])){
                retorno = true;
            }
        }
        return retorno;
    }
    public boolean tieneEntre(){
        boolean retorno = true; 
        if(this.listaEntrevistas.size()<=0){
            retorno = false;
        }
        return retorno;
    }
    public int ultEntPun(){
        int retorno = this.listaEntrevistas.get((listaEntrevistas.size()-1)).getPuntaje() ;
        return retorno;
    }
}
