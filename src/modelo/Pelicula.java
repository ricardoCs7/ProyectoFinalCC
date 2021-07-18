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
    public String categoria;
    public String sinopsis;
    public int duracion;
    public Pelicula next;
    public Pelicula previous;

    public Pelicula(String titulo, String categoria, String sinopsis, int duracion) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.sinopsis = sinopsis;
        this.duracion = duracion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
