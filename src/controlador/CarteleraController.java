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
import modelo.Cartelera;
import modelo.Funcion;
import vista.VistaCartelera;
import vista.VistaCliente;
import vista.VistaCompra;

/**
 *
 * @author Ricardo
 */
public class CarteleraController implements ActionListener {

    VistaCartelera vCart;
    VistaCompra vCompra;
    Cartelera cartelera;
    VistaCliente vCliente;
    public static DefaultTableModel tablaCartelera;

    public CarteleraController(VistaCartelera vc) {
        this.vCart = vCart;
        this.cartelera = InicioController.cartelera;
        this.vCliente = vCliente;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando == "seleccionar") {
            vCompra = new VistaCompra();
            vCompra.setVisible(true);
            rellenarVistaCompra();
        }
    }

      public void rellenarVistaCompra() {
        
        String item = String.valueOf(tablaCartelera.getValueAt(VistaCartelera.tabla.getSelectedRow(), 0));
          
          System.out.println(item);  
          
    }
      
}
