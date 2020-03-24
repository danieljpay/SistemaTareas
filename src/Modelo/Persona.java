/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author plupy
 */
public class Persona {
    private String nombre;
    private int dineroAPagar;
    private ArrayList<Tarea> tareas;

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        dineroAPagar = 0;
        tareas=null;
    }

    //métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDineroAPagar(int dineroAPagar) {
        this.dineroAPagar = dineroAPagar;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    
    //métodos get
    public String getNombre() {
        return nombre;
    }

    public int getDineroAPagar() {
        return dineroAPagar;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
    
    
    //asignarTarea
    public void asignarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    
    //eliminarTarea
    public void eliminarTarea(int indiceTarea){
        tareas.remove(indiceTarea);
    }
    
    public void incrementarDineroAPagar(int cantidad){
        dineroAPagar += cantidad;
    }
    
    //abonar
    public void abonar(int cantidad){
        int dineroRestante;
        dineroRestante = getDineroAPagar() - cantidad;
        setDineroAPagar(dineroRestante);
    }
}
