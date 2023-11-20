
package Dominio;
import Interfaz.VentanaInicio;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaInicio vent = new VentanaInicio(sistema);
        vent.setVisible(true);
    }     
}