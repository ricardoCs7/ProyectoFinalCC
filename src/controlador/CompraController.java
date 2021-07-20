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
import static javax.management.Query.value;
import javax.swing.table.DefaultTableModel;
import modelo.Funcion;
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
    public static DefaultTableModel tablaCarteleraCompleta;
    CarteleraCompletaController ccc;
    CarteleraCompletaController CartComp;
    VistaCarteleraCompleta vcc;

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
            rellenarBoleta();
        }
        if (comando == "cancelar") {
            vc.dispose();
        }
    }

    public void rellenarBoleta() {

        int n = (Integer) vc.getSpinnerCant().getValue();
        String p = vc.getJlPrecio().getText();
        int precio = Integer.parseInt(p);
        String titulo = vc.getJlTitulo().getText();
        String t = vc.getJlTitulo().getText();
        String h = vc.getJlFecha().getText();
        int total = n * precio;
        String total2 = String.valueOf(total);
        String asientos= String.valueOf(vc.getSpinnerCant().getValue());
        vb.getJlPelicula().setText(t);
        vb.getJlTotal().setText(total2);
        vb.getJlHorario().setText(vc.getJlFecha().getText());
        vb.getJlAsientos().setText(asientos);
    }

}
