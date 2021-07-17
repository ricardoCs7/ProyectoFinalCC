/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cartelera;
import vista.VistaAdmin;
import vista.VistaCliente;
import vista.VistaInicio;

/**
 *
 * @author Ricardo
 */
public class InicioController implements ActionListener {

    public VistaInicio vi;
    public VistaAdmin va;
    public VistaCliente vc;
    public static Cartelera cartelera;

    public InicioController(VistaInicio vi, VistaAdmin va) {
        this.vi = vi;
        this.va = va;
        this.cartelera = new Cartelera();
        
        
        cartelera.getListadoCartelera().insertFirst("pelicula 1");
        cartelera.getListadoCartelera().insertFirst("pelicula 2");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando == "admin") {
            va = new VistaAdmin();
            va.setVisible(true);
        }
        if (comando == "cliente") {
            vc = new VistaCliente();
            vc.setVisible(true);
            
        }

    }

}
