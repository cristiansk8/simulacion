/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
             }

/**
 *
 * @author tito
 */
public class cliente {
    String nombre;
    int horaLlegada;
    int tienpoAtencion;
    String esatdo;

    public String getEsatdo() {
        return esatdo;
    }

    public void setEsatdo(String esatdo) {
        this.esatdo = esatdo;
    }

    public int getTienpoAtencion() {
        return tienpoAtencion;
    }

    public void setTienpoAtencion(int tienpoArencion) {
        this.tienpoAtencion = tienpoArencion;
    }

    public cliente(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public cliente(String nombre, int horaLlegada) {
        this.nombre = nombre;
        this.horaLlegada = horaLlegada;
    }
    
}