/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaBoleta;
import vista.VistaCompra;

/**
 *
 * @author Ricardo
 */
public class BoletaController implements ActionListener {

    VistaCompra vc;
    VistaBoleta bv;

    public BoletaController(VistaCompra vc, VistaBoleta bv) {
        this.vc = vc;
        this.bv = bv;
       
    }



    public void rellenar() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
