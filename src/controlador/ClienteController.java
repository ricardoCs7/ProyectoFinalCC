/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import modelo.Cartelera;
import modelo.Funcion;
import modelo.StockPeliculas;
import modelo.Pelicula;
import vista.VistaCartelera;
import vista.VistaCarteleraCompleta;
import vista.VistaCliente;

/**
 *
 * @author Ricardo
 */
public class ClienteController implements ActionListener {

    public VistaCliente vc;
    public VistaCartelera vCart;
    public VistaCarteleraCompleta vCComp;
    public StockPeliculas stockPeliculas;
    public Cartelera cartelera;

    public ClienteController(VistaCliente vc) {
        this.vc = vc;
        this.stockPeliculas = InicioController.stockPeliculas;
        this.cartelera = InicioController.cartelera;

        llenarComboBox();

        System.out.println("abriendo Ventana Cliente");
        cartelera.getListadoFunciones().displayList();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        if (comando == "completa") {
            vCComp = new VistaCarteleraCompleta();
            vCComp.setVisible(true);

        }
        if (comando == "buscar") {

        }
    }

    public void llenarComboBox() {

        Pelicula current = stockPeliculas.getListadoPeliculas().getFirst();     //Recorre la lista de peliculas
        while (current != null) // until end of list,
        {
            vc.getJcPeliculas().addItem(current.getTitulo());// La pelicula es insertada en en comboBox 
            current = current.next; //pasa a la siguiente pelicula
        }

    }

}
