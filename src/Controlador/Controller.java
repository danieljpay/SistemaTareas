/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.Tarea;
import java.util.ArrayList;

/**
 *
 * @author plupy
 */
public class Controller {
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public Controller() {
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    //********************FrMenuPrincipal*****************
    public Persona agregarPersona(String nombrePersona){
        Persona nuevaPersona = new Persona(nombrePersona);
        listaPersonas.add(nuevaPersona);
        return nuevaPersona;
    }
    
    public void agregarTarea(int numPersona, String nombreTarea, int precioTarea, String fechaTarea){
        Tarea nuevaTarea = new Tarea(nombreTarea, precioTarea, fechaTarea);
        listaPersonas.get(numPersona).asignarTarea(nuevaTarea);
        listaPersonas.get(numPersona).incrementarDineroAPagar(precioTarea);
    }
    
    public void eliminarTarea(int numPersona, int numTarea){
        listaPersonas.get(numPersona).eliminarTarea(numTarea);
    }
    
    public void abonar(int numPersona, int cantidad){
        listaPersonas.get(numPersona).abonar(cantidad);
    }
}
