/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
   

    public CarteleraController(VistaCartelera vc) {
        this.vCart = vCart;
        this.cartelera = InicioController.cartelera;
        this.vCliente = vCliente;
    }

    public void llenarTabla() {

        DefaultTableModel tabla = (DefaultTableModel) vCart.getTabla().getModel();
      

        Funcion current = cartelera.listadoFunciones.find("");
        while (current != null) // until end of list,
        {
            String[] f = {String.valueOf(current.getPelicula().titulo),
                String.valueOf(current.fecha.toString()),
                String.valueOf(current.precio)};
            tabla.addRow(f);
            // SE VA RELLENANDO LA TABLA CON LAS FUNCIONES EXISTENTES
            current = current.next; //PASA A LA SIGUIENTE FUNCION
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando == "comprar") {
            
            vCompra = new VistaCompra();
            vCompra.setVisible(true);

        }
        if (comando == "cancelar") {
            vCart.dispose();

        }
    }

}
