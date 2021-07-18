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
public class StockPeliculas {

    public static DoublyLinkedList listadoPeliculas;

    public StockPeliculas() {
        
        this.listadoPeliculas = new DoublyLinkedList();
    }

    public static DoublyLinkedList getListadoPeliculas() {
        return listadoPeliculas;
    }

    public static void setListadoPeliculas(DoublyLinkedList listadoPeliculas) {
        StockPeliculas.listadoPeliculas = listadoPeliculas;
    }

   
    

}
