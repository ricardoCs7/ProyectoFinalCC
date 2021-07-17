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
public class Funcion {
    public String fecha;
    public int nroEntradas;
    public int precio;

    public Funcion(String fecha, int nroEntradas, int precio) {
        this.fecha = fecha;
        this.nroEntradas = nroEntradas;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNroEntradas() {
        return nroEntradas;
    }

    public void setNroEntradas(int nroEntradas) {
        this.nroEntradas = nroEntradas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
