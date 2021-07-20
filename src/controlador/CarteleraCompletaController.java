/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cartelera;
import modelo.Funcion;
import modelo.LinkList;
import vista.VistaBoleta;
import vista.VistaCarteleraCompleta;
import vista.VistaCompra;

/**
 *
 * @author Ricardo
 */
public class CarteleraCompletaController implements ActionListener {

    VistaCarteleraCompleta vcc;
    Cartelera cartelera;
    VistaCompra vCompra;
    Funcion currenFuncion;
    VistaBoleta boleta;

    public static DefaultTableModel tablaCarteleraCompleta;
    CompraController cartController;

    public CarteleraCompletaController(VistaCarteleraCompleta vcc) {
        this.vcc = vcc;
        this.cartelera = InicioController.cartelera;
        llenarTabla();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        String item = String.valueOf(tablaCarteleraCompleta.getValueAt(vcc.tabla.getSelectedRow(), 0));

        if (comando == "salir") {
            vcc.dispose();
        } else if (comando == "seleccionar" && item == null) {
            JOptionPane.showMessageDialog(null, "Favor seleccione una película", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (comando == "seleccionar" && item != null) {
            vCompra = new VistaCompra();
            vCompra.setVisible(true);
            rellenar();
        }
    }

    public void llenarTabla() {

        tablaCarteleraCompleta = (DefaultTableModel) vcc.tabla.getModel();

        Funcion current = InicioController.cartelera.listadoFunciones.getFirst();

        while (current != null) // until end of list,
        {
            String[] f = {String.valueOf(current.getPelicula().titulo),
                String.valueOf(current.fecha.toString()),
                String.valueOf(current.precio)};
            tablaCarteleraCompleta.addRow(f); //AGREGA LOS DATOS DE LA FUNCION A LA TABLA
            current = current.next;
        }
    }

    public void rellenar() {
        String item = String.valueOf(tablaCarteleraCompleta.getValueAt(vcc.tabla.getSelectedRow(), 0));
        Funcion f = cartelera.listadoFunciones.find(item);

        String t = f.getPelicula().titulo;
        String c = f.getPelicula().categoria;
        String s = f.getPelicula().sinopsis;
        String d = String.valueOf(f.getPelicula().duracion);
        String fecha = f.fecha;
        String p = String.valueOf(f.precio);

        vCompra.getJlTitulo().setText(t);
        vCompra.getJlCategoria().setText(c);
        vCompra.getJlFecha().setText(fecha);
        vCompra.getJlDuracion().setText(d);
        vCompra.getJtSinopsis().setText(s);
        vCompra.getJlPrecio().setText(p);
    }

    public VistaCarteleraCompleta getVcc() {
        return vcc;
    }

    public void setVcc(VistaCarteleraCompleta vcc) {
        this.vcc = vcc;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public VistaCompra getvCompra() {
        return vCompra;
    }

    public void setvCompra(VistaCompra vCompra) {
        this.vCompra = vCompra;
    }

    public static DefaultTableModel getTablaCarteleraCompleta() {
        return tablaCarteleraCompleta;
    }

    public static void setTablaCarteleraCompleta(DefaultTableModel tablaCarteleraCompleta) {
        CarteleraCompletaController.tablaCarteleraCompleta = tablaCarteleraCompleta;
    }

    public CompraController getCartController() {
        return cartController;
    }

    public void setCartController(CompraController cartController) {
        this.cartController = cartController;
    }

}
