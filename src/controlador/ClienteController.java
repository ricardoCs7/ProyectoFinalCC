/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.StockPeliculas;
import modelo.Pelicula;
import vista.VistaCliente;

/**
 *
 * @author Ricardo
 */
public class ClienteController implements ActionListener {

    VistaCliente vc;
    public StockPeliculas cartelera;

    public ClienteController(VistaCliente vc) {
        this.vc = vc;
        this.cartelera = InicioController.stockPeliculas;

        llenarComboBox();

        System.out.println("abriendo Ventana Cliente");
        cartelera.getListadoPeliculas().displayForward();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
                
        String comando  = e.getActionCommand();
        String tituloSeleccionado = (String) vc.getJcPeliculas().getSelectedItem(); //se toma el titulo seleccionado de la lista del jComboBox
        
        
        if (comando == "buscar") {
            
            while (!cartelera.getListadoPeliculas().isEmpty() ) {            
            System.out.println(tituloSeleccionado);
        }
            
        }
    }

    public void llenarComboBox() {

        Pelicula current = cartelera.getListadoPeliculas().getFirst();     //Recorre la lista de peliculas
        while (current != null) // until end of list,
        {
            vc.getJcPeliculas().addItem(current.getTitulo());// La pelicula es insertada en en comboBox 
            current = current.next; //pasa a la siguiente pelicula
        }

    }

}
