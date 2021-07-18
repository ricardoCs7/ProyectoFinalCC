/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.StockPeliculas;
import modelo.Funcion;
import modelo.Pelicula;
import vista.VistaAddFuncion;

/**
 *
 * @author Ricardo
 */
public class addFuncionController implements ActionListener {

    VistaAddFuncion vaf;
    public StockPeliculas cartelera;

    public addFuncionController(VistaAddFuncion vaf) {
        this.vaf = vaf;
        this.cartelera = InicioController.cartelera;
        llenarComboBox();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando == "crear") {

            String fecha = vaf.getTfFecha().getText();
            int precio = Integer.parseInt(vaf.getTfPrecio().getText());
            String titulo = (String) vaf.getJcPeliculas().getSelectedItem();

            Pelicula p = cartelera.getListadoPeliculas().find(titulo);

            Funcion f = new Funcion(p, fecha, precio); //CAMBIARLO SEGUN SE HARA NODO, LINKLIST O ETC (COMO POR EJEM PELICULA QUE ESTA HECHO COM
                                                               //DOUBLYLINKEDLIST CON UN INSERTFIST()

        }

    }

    public void llenarComboBox() {
        Pelicula current = cartelera.listadoPeliculas.getFirst();     //Recorre la lista de peliculas
        while (current != null) // until end of list,
        {
            vaf.getJcPeliculas().addItem(current.titulo);// La pelicula es insertada en en comboBox 
            current = current.next; //pasa a la siguiente pelicula
        }

    }
}
