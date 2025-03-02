

package Dominio;

import Lectura.ArchivoGrabacion;
import java.io.File;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


import javax.swing.JOptionPane;
public class Sistema extends Observable implements Serializable{ 
    
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Puesto> listaPuestos;
    private int contadorEntrevistas;
    
    
    public Sistema(){
        listaPostulantes = new ArrayList<>();
        listaTematicas = new ArrayList<>();
        listaEvaluadores = new ArrayList<>();
        listaPuestos = new ArrayList<>(); 
        contadorEntrevistas = 1;
          
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
    
    public int getContador(){
        return contadorEntrevistas;
    }
    
    public void aumentoContador(){
        contadorEntrevistas++;
    }
    
    public void addPostulante(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unMail, String unLinkedin, String unTipo )throws Exception {
  
        for(Postulante recorrido:listaPostulantes){
            if(recorrido.getCedula() == unaCedula){
                throw new Exception("Error: Un postulante con esta Cédula ya fue ingresado");
            }
           
        }
        Postulante nuevoPostulante = new Postulante(unNombre,unaCedula,unaDireccion,unTelefono,unMail,unLinkedin,unTipo);
        listaPostulantes.add(nuevoPostulante);
        setChanged();
        notifyObservers();
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
            if(recorrido.getNombre().toLowerCase().equals(unNombre.toLowerCase())){
                throw new Exception("Error: Esta temática ya fue ingresada");
            }
        }
        Tematica posibleTema = new Tematica(unNombre,unaDescripcion);
        listaTematicas.add(posibleTema);
        setChanged();
        notifyObservers();
    }
    
    public void removePostulante(Postulante post){
        listaPostulantes.remove(post);
        setChanged();
        notifyObservers();
    }
    
    
    public void addEvaluador(String unNombre, int unaCedula, String unaDireccion, int unIngreso ) throws Exception {
        for(Evaluador recorrido:listaEvaluadores){
            if(recorrido.getCedula() == unaCedula){
                throw new Exception("Error: Un evaluador con esta cédula ya fue ingresado");
            }
           
        }
        Evaluador nuevoEvaluador = new Evaluador(unNombre,unaCedula,unaDireccion,unIngreso);
        listaEvaluadores.add(nuevoEvaluador);
        setChanged();
        notifyObservers();
    }
    
    public void addPuesto(String unNombre, String unTipo, ArrayList<Tematica> unaLista) throws Exception{
        boolean Agrego = true;
        for(Puesto recorrido:listaPuestos){
            if(recorrido.getNombre().equals(unNombre)){
                throw new Exception("Error: Un puesto con este nombre ya fue ingresado");
            }
        }
        if(Agrego){
            Puesto nuevoPuesto = new Puesto(unNombre,unTipo, unaLista);
            listaPuestos.add(nuevoPuesto);
            setChanged();
            notifyObservers();
        }
    }
    
    public ArrayList<Postulante> postulantesValidos(Puesto unPuesto, int unNivel){
        ArrayList<Tematica> temas = unPuesto.getListaTemas();
        ArrayList<Postulante> listaPostulantesValidos = new ArrayList<Postulante>();
        for(Postulante recorrido:this.listaPostulantes){
            boolean[] valido = new boolean[temas.size()];
            boolean valTotal = true;
            for(int i = 0; i < temas.size(); i++){
                valido[i]=recorrido.esValido(temas.get(i).toString(),unNivel);
            }                                                                                                                                                                                                                                                                                                               
            for(boolean val:valido){
                if(!val && valTotal){
                    valTotal = false;
                }
            }
            if(valTotal && recorrido.tieneEntre()){
                listaPostulantesValidos.add(recorrido);
                setChanged();
                notifyObservers();
            }
        }
        Collections.sort(listaPostulantesValidos, new Comparator<Postulante>() {
            @Override
            public int compare(Postulante o1, Postulante o2) {
               return new Integer(o1.ultEntPun()).compareTo(new Integer(o2.ultEntPun()));
            }
        });
        return listaPostulantesValidos;
    }
    
    public int postulantePorTema(Tematica unTema){
        int cant = 0;
        for(Postulante recorrido : this.listaPostulantes){
            if(recorrido.validTema(unTema)){
                cant++;
            }
        }
        return cant;
    }
    public int puestoPorTema(Tematica unTema){
        int cant = 0;
        for(Puesto recorrido : this.listaPuestos){
            if(recorrido.temaDeInteres(unTema)){
                cant++;
            }
        }
        return cant;
    }
    
    public void exportArch(ArrayList<Postulante> unaLista, Puesto unPuesto){
        ArchivoGrabacion aExportar = new ArchivoGrabacion("Consulta.txt");
        aExportar.grabarLinea(unPuesto.getNombre());
        for(Postulante recorrido:unaLista){
            aExportar.grabarLinea("Nombre: "+recorrido.getNombre()+" Cedula: "+recorrido.getCedula()+" Mail: "+recorrido.getMail());
        }
        aExportar.cerrar();
    }
   
    public ArrayList<Postulante> ordenarPost(){
        ArrayList<Postulante> listaPostulantesOrdenados = this.listaPostulantes ;
        Collections.sort(listaPostulantesOrdenados, new Comparator<Postulante>() {
            @Override
            public int compare(Postulante o1, Postulante o2) {
               return new Integer(o2.getCedula()).compareTo(new Integer(o1.getCedula()));
            }
        });
        return listaPostulantesOrdenados;
    }
    
    public ArrayList<Entrevista> busqueda(Postulante unPostulante, String unText){
        return unPostulante.funcBuscador(unText);
    }
}

