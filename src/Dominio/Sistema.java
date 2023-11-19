

package Dominio;

import java.util.ArrayList;
import Dominio.Postulante;

public class Sistema {
    
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Puesto> listaPuestos;
    
    
    public Sistema(){
        listaPostulantes = new ArrayList<>();
        listaTematicas = new ArrayList<>();
        listaEvaluadores = new ArrayList<>();
        listaPuestos = new ArrayList<>();   
    }
    
    
    public ArrayList<Postulante> getListaPostulantes(){
        return listaPostulantes;
    }
    
    public ArrayList<Tematica> getListaTematicas(){
        return listaTematicas;
    }
    
    public ArrayList<Evaluador> getListaEvaluadores(){
        return listaEvaluadores;
    }
    
    public ArrayList<Puesto> getListaPuestos(){
        return listaPuestos;
    }
    
    public Postulante getUltimoPostulante(){
        return listaPostulantes.get(listaPostulantes.size() - 1);
    }
    
    
    
    public void addPostulante(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unMail, String unLinkedin, String unTipo )throws Exception {
  
        for(Postulante recorrido:listaPostulantes){
            if(recorrido.getCedula() == unaCedula){
                throw new Exception("Error: Un postulante con esta Cédula ya fue ingresado");
            }
           
        }
        Postulante nuevoPostulante = new Postulante(unNombre,unaCedula,unaDireccion,unTelefono,unMail,unLinkedin,unTipo);
        listaPostulantes.add(nuevoPostulante);
    }
    
    public boolean hayTemas(){
        boolean retorno = false;
        if(!this.listaTematicas.isEmpty()){
            retorno = true;
        }
        return retorno;
    }
    
    public void addTematica(String unNombre, String unaDescripcion) throws Exception {
    
        for(Tematica recorrido:listaTematicas){
            if(recorrido.getNombre().equals(unNombre)){
                throw new Exception("Error: Esta temática ya fue ingresada");
            }
        }
        Tematica posibleTema = new Tematica(unNombre,unaDescripcion);
        listaTematicas.add(posibleTema);
    }
    
    public void removePostulante(Postulante post){
        listaPostulantes.remove(post);
    }
    
    public void removePostulanteString(String post){
        String[] partes = post.split("\\(|\\)");
        Postulante postulanteBorrar = null;
        int Ced = Integer.parseInt(partes[1]);
        for(Postulante recorrido:listaPostulantes){
            if(recorrido.getCedula() == Ced){
                postulanteBorrar = recorrido;
            }
        }
        listaPostulantes.remove(postulanteBorrar);
    }
    
    public void addEvaluador(String unNombre, int unaCedula, String unaDireccion, int unIngreso ) throws Exception {
        for(Evaluador recorrido:listaEvaluadores){
            if(recorrido.getCedula() == unaCedula){
                throw new Exception("Error: Un evaluadro con esta cédula ya fue ingresado");
            }
           
        }
        Evaluador nuevoEvaluador = new Evaluador(unNombre,unaCedula,unaDireccion,unIngreso);
        listaEvaluadores.add(nuevoEvaluador);
    }
    
    public void addPuesto(String unNombre, String unTipo){
        boolean Agrego = true;
        for(Puesto recorrido:listaPuestos){
            if(recorrido.getNombre().equals(unNombre)){
                Agrego = false;
            }
        }
        if(Agrego){
            Puesto nuevoPuesto = new Puesto(unNombre,unTipo);
            listaPuestos.add(nuevoPuesto);
        }
    }
    
    public void postulantesValidos(Puesto unPuesto, int unNivel){
        String[] temas = unPuesto.getTema().split(",");
        ArrayList<Postulante> listaPostulantesValidos = new ArrayList<Postulante>();
        for(Postulante recorrido:this.listaPostulantes){
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
                listaPostulantesValidos.add(recorrido);
            }
        }
    }
}

