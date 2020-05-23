/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.Tarea;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author plupy
 */
public class Controller {
    public DefaultListModel modeloListaNombres = new DefaultListModel();
    public DefaultListModel modeloListaTareas = new DefaultListModel();
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    //constructor
    public Controller() {
    }

    //getters
    public DefaultListModel getModeloListaNombres() {
        return modeloListaNombres;
    }

    public DefaultListModel getModeloListaTareas() {
        return modeloListaTareas;
    }
    
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    //setters
    public void setModeloListaNombres(DefaultListModel modeloListaNombres) {
        this.modeloListaNombres = modeloListaNombres;
    }

    public void setModeloListaTareas(DefaultListModel modeloListaTareas) {
        this.modeloListaTareas = modeloListaTareas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    //******************************************************FrMenuPrincipal***************************************
    //funcion agregar dato a un modelo de lista
    
    public Persona agregarPersona(String nombrePersona){
        modeloListaNombres.addElement(nombrePersona);
        Persona nuevaPersona = new Persona(nombrePersona);
        listaPersonas.add(nuevaPersona);
        return nuevaPersona;
    }
    
    public void eliminarPersona(int index){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente desea eliminar este nombre?");
        if(respuesta == 0){
            listaPersonas.remove(index);  //se elimina la persona del array de personas
            modeloListaNombres.remove(index);
            modeloListaTareas.clear();
        }
    }
    
    public void agregarTarea(int numPersona, String nombreTarea, int precioTarea, String fechaTarea){
        Tarea nuevaTarea = new Tarea(nombreTarea, precioTarea, fechaTarea);
        listaPersonas.get(numPersona).asignarTarea(nuevaTarea);
        listaPersonas.get(numPersona).incrementarDineroAPagar(precioTarea);
        actualizarTareas(numPersona);
    }
    
    public void eliminarTarea(int numPersona, int numTarea){
        listaPersonas.get(numPersona).eliminarTarea(numTarea);
        actualizarTareas(numPersona);
    }
    
    public void abonar(int numPersona, int cantidad){
        listaPersonas.get(numPersona).abonar(cantidad);
    }
    
    public void actualizarTareas(int numPersona){
        modeloListaTareas.clear();
        for(int i=0; i<listaPersonas.get(numPersona).getTareas().size(); i++){
            modeloListaTareas.addElement(listaPersonas.get(numPersona).getTareas().get(i).getNombre());
        }
    }
    
}
