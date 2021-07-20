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
import modelo.Funcion;
import modelo.LinkList;
import modelo.Pelicula;
import vista.VistaAddFuncion;

/**
 *
 * @author Ricardo
 */
public class addFuncionController implements ActionListener {

    VistaAddFuncion vaf;
    public StockPeliculas stockPeliculas;
    public Cartelera cartelera;

    public addFuncionController(VistaAddFuncion vaf) {
        this.vaf = vaf;
        this.stockPeliculas = InicioController.stockPeliculas;
        this.cartelera = InicioController.cartelera;
        llenarComboBox();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        String fecha = vaf.getTfFecha().getText();
        String precio = vaf.getTfPrecio().getText();
        String titulo = (String) vaf.getJcPeliculas().getSelectedItem();

        if (comando == "cancelar") {
            vaf.dispose();

        } else if (comando == "crear" && fecha.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        } else {

            Pelicula p = stockPeliculas.getListadoPeliculas().find(titulo);

            int pre = Integer.parseInt(precio);
            cartelera.getListadoFunciones().insertFirst(p, fecha, pre);
            cartelera.getListadoFunciones().displayList();
            JOptionPane.showMessageDialog(vaf, "Se ha guardado la película exitosamente");
            limpiar();

        }

    }

    public void llenarComboBox() {
        Pelicula current = stockPeliculas.listadoPeliculas.getFirst();     //Recorre la lista de peliculas
        while (current != null) // until end of list,
        {
            vaf.getJcPeliculas().addItem(current.titulo);// La pelicula es insertada en en comboBox 
            current = current.next; //pasa a la siguiente pelicula
        }

    }
    
    
    public void limpiar(){
        vaf.getTfFecha().setText("");
        vaf.getTfPrecio().setText("");
    }
}
