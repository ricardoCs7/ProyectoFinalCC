/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cartelera;
import modelo.StockPeliculas;
import modelo.DoublyLinkedList;
import modelo.LinkList;
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
    public StockPeliculas stockPeliculas;
    public VistaAddPelicula vp;
    public Cartelera cartelera;

    public AdminController(VistaAdmin va) {
        this.va = va;
        stockPeliculas = InicioController.stockPeliculas; //OBTIENE LAS PELICULAS QUE HAY EN LA CARTELERA
        System.out.println("abriendo Ventana Admin");
        stockPeliculas.getListadoPeliculas().displayForward(); //MUESTRA POR CONSOLA SOLO PARA VER EL DETRAS DEL CODIGO

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando == "funcion") {
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

            int opcion = JOptionPane.showConfirmDialog(va, "¿Se eliminará la ultima película, está Seguro ?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            switch (opcion) {
                case 1:  //opcion "NO"
                    break;
                case 0: //OPCION "SI"
                    stockPeliculas.getListadoPeliculas().deleteLast();
                    System.out.println("Se ha eliminado la última película");
                     JOptionPane.showMessageDialog(va, "Se ha eliminado la última película exitosamente");
            }

        }

        stockPeliculas.getListadoPeliculas().displayForward();//IMPRIME PARA VER SI ES CORRECTA
    }

}
