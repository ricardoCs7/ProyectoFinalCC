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
public class Cartelera {

    public static DoublyLinkedList listadoCartelera;

    public Cartelera() {
        
        this.listadoCartelera = new DoublyLinkedList();
    }

    public static DoublyLinkedList getListadoCartelera() {
        return listadoCartelera;
    }

    public static void setListadoCartelera(DoublyLinkedList listadoCartelera) {
        Cartelera.listadoCartelera = listadoCartelera;
    }

   
    

}
