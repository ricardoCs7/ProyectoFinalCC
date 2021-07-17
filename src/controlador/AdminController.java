/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cartelera;
import modelo.DoublyLinkedList;
import vista.VistaAddFuncion;
import vista.VistaAddPelicula;
import vista.VistaAdmin;

/**
 *
 * @author Ricardo
 */
public class AdminController implements ActionListener {

    public VistaAdmin va;
    public VistaAddFuncion vf;
    public Cartelera cartelera;
    public VistaAddPelicula vp;

    public AdminController(VistaAdmin va) {
        this.va = va;
        cartelera = InicioController.cartelera; //OBTIENE LAS PELICULAS QUE HAY EN LA CARTELERA
        System.out.println("abriendo Ventana Admin");
        cartelera.getListadoCartelera().displayForward();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando=="funcion") {
            vf = new VistaAddFuncion();
            vf.setVisible(true);
            vf.setLocationRelativeTo(null);
        }
        
        if (comando == "agregar") {
            vp = new VistaAddPelicula();
            vp.setVisible(true);
            vp.setLocationRelativeTo(null);

//          
        }
        if (comando == "renovar") {
            cartelera.getListadoCartelera().deleteLast();
            System.out.println("Se ha eliminado la última película");
        }

        cartelera.getListadoCartelera().displayForward();//IMPRIME PARA VER SI ES CORRECTA
    }

}