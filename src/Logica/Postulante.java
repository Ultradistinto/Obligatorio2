
package Logica;

public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;
    private String tipoTrabajo;
    
    
    
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
    
    public Postulante(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unMail, String unLinkedin, String unTipo ){
        setNombre(unNombre);
        setCedula(unaCedula);
        setDireccion(unaDireccion);
        setTelefono(unTelefono);
        setMail(unMail);
        setLinkedin(unLinkedin);
        setTipoTrabajo(unTipo);
    }
    
    
    
    
    
}
