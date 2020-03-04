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
    private ArrayList tareas = new ArrayList();

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDineroAPagar(int dineroAPagar) {
        this.dineroAPagar = dineroAPagar;
    }

    public void setTareas(ArrayList tareas) {
        this.tareas = tareas;
    }
    
    
    //métodos get
    public String getNombre() {
        return nombre;
    }

    public int getDineroAPagar() {
        return dineroAPagar;
    }

    public ArrayList getTareas() {
        return tareas;
    }
    
    
    //asignarTarea
    public void asignarTarea(Tarea tarea){
        tareas.add(tarea.getNombre());
    }
    
    //eliminarTarea
    public void eliminarTarea(Tarea tarea){
        tareas.remove(tarea);
    }
    
    //abonar
    public void abonar(int cantidad){
        int dineroRestante;
        dineroRestante = getDineroAPagar() - cantidad;
        setDineroAPagar(dineroRestante);
    }
}
