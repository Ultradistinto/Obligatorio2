
package Dominio;
import Interfaz.VentanaMenu;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaMenu vent = new VentanaMenu(sistema);
        vent.setVisible(true);
    }     
}