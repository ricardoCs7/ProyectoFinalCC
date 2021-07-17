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
import vista.VistaAddPelicula;

/**
 *
 * @author Ricardo
 */
public class AddPeliculaController implements ActionListener {

    VistaAddPelicula vap;
    public Cartelera cartelera;

    public AddPeliculaController(VistaAddPelicula vap) {
        this.vap = vap;
        cartelera = InicioController.cartelera; //OBTIENE LAS PELICULAS QUE HAY EN LA CARTELERA
        cartelera.getListadoCartelera().displayForward();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        String titulo = vap.getTfTitulo().getText();

        if (comando == "limpiar") {
            limpiar();
        } else if (comando == "cancelar") {
            vap.dispose();

        } else if (comando == "agregar" && titulo.isEmpty()) {// || categoria.isEmpty() || sinopsis.isEmpty() || duracion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
//            int d = Integer.parseInt(duracion);
//            cartelera.getLista().insertFirst(titulo, categoria, sinopsis, d);
            JOptionPane.showMessageDialog(vap, "Se ha guardado la película exitosamente");
            cartelera.getListadoCartelera().insertFirst(titulo);
            limpiar();
            cartelera.getListadoCartelera().displayForward();
        }

    }

    public void limpiar() {
        vap.getTfTitulo().setText("");
    }

}
