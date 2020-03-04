/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author plupy
 */
public class Tarea {
    private String nombre;
    private int costo;
    private String fechaLimite;

    //constructor
    public Tarea(String nombre, int costo, String fechaLimite) {
        this.nombre = nombre;
        this.costo = costo;
        this.fechaLimite = fechaLimite;
    }

    //métodos get
    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    //métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
}
