/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ricardo
 */
public class Boleta {
    
    public Funcion funcion;
    public int nroAsientos;
    public int total;

    public Boleta(Funcion funcion, int nroAsientos) {
        this.funcion = funcion;
        this.nroAsientos = nroAsientos;
        this.total= funcion.precio*nroAsientos;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getNroAsientos() {
        return nroAsientos;
    }

    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
    
    

    
    
    
    
}
