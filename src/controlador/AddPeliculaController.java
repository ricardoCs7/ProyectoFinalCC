/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.StockPeliculas;
import vista.VistaAddPelicula;

/**
 *
 * @author Ricardo
 */
public class AddPeliculaController implements ActionListener {

    VistaAddPelicula vap;
    public StockPeliculas stockPeliculas;

    public AddPeliculaController(VistaAddPelicula vap) {
        this.vap = vap;
        stockPeliculas = InicioController.stockPeliculas; //OBTIENE LAS PELICULAS QUE HAY EN LA CARTELERA
        stockPeliculas.getListadoPeliculas().displayForward();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        String titulo = vap.getTfTitulo().getText();
        String categoria = vap.getTfCategoria().getText();
        String sinopsis = vap.getTaSinopsis().getText();
        String duracion = vap.getTfDuracion().getText();

        if (comando == "limpiar") {
            limpiar();
        } else if (comando == "cancelar") {
            vap.dispose();

        } else if (comando == "agregar" && titulo.isEmpty() || categoria.isEmpty() || sinopsis.isEmpty() || duracion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
//            int d = Integer.parseInt(duracion);
//            stockPeliculas.getLista().insertFirst(titulo, categoria, sinopsis, d);
            JOptionPane.showMessageDialog(vap, "Se ha guardado la película exitosamente");
            int d = Integer.parseInt(duracion);
            stockPeliculas.getListadoPeliculas().insertFirst(titulo, categoria, sinopsis, d);
            limpiar();
            stockPeliculas.getListadoPeliculas().displayForward();
        }

    }

    public void limpiar() {
        vap.getTfTitulo().setText("");
        vap.getTaSinopsis().setText("");
        vap.getTfCategoria().setText("");
        vap.getTfDuracion().setText("");
    }

}
