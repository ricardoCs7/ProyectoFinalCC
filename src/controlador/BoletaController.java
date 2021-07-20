/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.CarteleraCompletaController.tablaCarteleraCompleta;
import static controlador.InicioController.cartelera;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Funcion;
import vista.VistaBoleta;
import vista.VistaCompra;

/**
 *
 * @author Ricardo
 */
public class BoletaController implements ActionListener {

    VistaCompra vc;
    VistaBoleta vb;
    

    public BoletaController(VistaBoleta bv) {

        this.vb = bv;

    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
