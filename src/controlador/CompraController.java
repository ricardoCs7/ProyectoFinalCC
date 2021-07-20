/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import vista.VistaBoleta;
import vista.VistaCarteleraCompleta;
import vista.VistaCompra;

/**
 *
 * @author Ricardo
 */
public class CompraController implements ActionListener {

    public VistaBoleta vb;
    public VistaCompra vc;
    public VistaCarteleraCompleta vCartComp;
    public static DefaultTableModel tabla;
    CarteleraCompletaController ccc;

    public CompraController(VistaCompra vc) {
        this.vc = vc;

//       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando == "comprar") {
            vb = new VistaBoleta();
            vb.setVisible(true);

        }
        if (comando == "cancelar") {
            vc.dispose();
        }
    }

}
