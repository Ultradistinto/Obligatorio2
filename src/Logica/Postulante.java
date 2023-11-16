
package Logica;

import java.util.ArrayList;

public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;
    private String tipoTrabajo;
    private ArrayList<String> habilidades;
    private ArrayList<Entrevistas> listaEntrevistas;
    
    
    
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
    
    public boolean esValido(String unaHabilidad, int unNivel){
        boolean retorno = false;
        for(String recorrido:habilidades){
            String[] partes = recorrido.split(",");
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
    }
    
    public void addHablidades(String unNombre, int unNivel){
        boolean contiene = false;
        for(String recorrido:habilidades){
            String[] partes = recorrido.split(",");
            if(partes[0].equals(unNombre)){
                //tirar ventana error
                contiene = true;
            }
        }
        if(!contiene){
            habilidades.add(unNombre+","+unNivel);
        }
    }
    
    public void removeHablidad(String unNombre, int unNivel){
       String habilidad = unNombre + "," + unNivel;
       habilidades.remove(habilidad);
    }
    
    public void addEntrev(Evaluador unEvaluador, int unPuntaje, String unComentario){
        Entrevistas nuevaEntrev = new Entrevistas(unEvaluador, unPuntaje, unComentario);
        this.listaEntrevistas.add(nuevaEntrev);
    }
    
    
    
    
}
