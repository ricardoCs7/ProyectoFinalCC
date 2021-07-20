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

    Pelicula pelicula;
    public String fecha;
    public int precio;
    public Funcion next;

    public Funcion(Pelicula pelicula, String fecha, int precio) {
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("------------------------");
        System.out.println("Película: " + pelicula.titulo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: $" + precio);
        System.out.println("-----------------------------");

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Funcion getNext() {
        return next;
    }

    public void setNext(Funcion next) {
        this.next = next;
    }

}
