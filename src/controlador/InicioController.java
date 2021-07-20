/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cartelera;
import modelo.Pelicula;
import modelo.StockPeliculas;
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
    public static StockPeliculas stockPeliculas;
    public static Cartelera cartelera;

    public InicioController(VistaInicio vi, VistaAdmin va) {
        this.vi = vi;
        this.va = va;
        this.stockPeliculas = new StockPeliculas();
        this.cartelera = new Cartelera();

        stockPeliculas.getListadoPeliculas().insertFirst("Rápido y Furioso 9", "Acción", "FAMILIA", 5900);
        stockPeliculas.getListadoPeliculas().insertFirst("Black Widow", "Acción", "Una peligrosa conspiración, relacionada con su pasado, persigue a "
                + "Natasha Romanoff, también conocida como Viuda Negra. La agente tendrá que lidiar con las consecuencias de haber sido espía, así "
                + "como con las relaciones rotas, para sobrevivir.", 200);
        Pelicula p = stockPeliculas.getListadoPeliculas().find("Rápido y Furioso 9");
        Pelicula p2 = stockPeliculas.getListadoPeliculas().find("Black Widow");

        cartelera.getListadoFunciones().insertFirst(p, "21/07/2021", 3990);
        cartelera.getListadoFunciones().insertFirst(p2, "22/07/2021", 4990);

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
