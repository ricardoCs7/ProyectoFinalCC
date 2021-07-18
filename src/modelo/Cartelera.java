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

    public static LinkList listadoFunciones;

    public Cartelera() {
        listadoFunciones = new LinkList();
    }

    public static void setListadoFunciones(LinkList listadoFunciones) {
        Cartelera.listadoFunciones = listadoFunciones;
    }

    public static LinkList getListadoFunciones() {
        return listadoFunciones;
    }

}
