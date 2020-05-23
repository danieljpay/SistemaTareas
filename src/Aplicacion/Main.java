package Aplicacion;

import Controlador.Controller;
import Vista.FrMenuPrincipal;

/**
 *
 * @author plupy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controlador = new Controller();
        FrMenuPrincipal menu = new FrMenuPrincipal(controlador);
        menu.setVisible(true);
    }
    
}
