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
public class Pelicula {

    public String titulo;
    public Pelicula next;
    public Pelicula previous;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void mostrarDatos(){
        System.out.println("Título: "+titulo);
    }

    public Pelicula getNext() {
        return next;
    }

    public void setNext(Pelicula next) {
        this.next = next;
    }

    public Pelicula getPrevious() {
        return previous;
    }

    public void setPrevious(Pelicula previous) {
        this.previous = previous;
    }
    
    

}
