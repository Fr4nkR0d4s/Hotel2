
package hotel;

 /*
 * @author ASOC10
 */
public class Principal {

    /**
     * Método main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal; // Define la ventana principal 
        Hotel hotel = new Hotel(); // Crea un objeto Hotel 
        miVentanaPrincipal = new VentanaPrincipal(hotel);/* Crea la ventana principal */
        miVentanaPrincipal.setVisible(true);/* Establece la ventana como visible */
    }
}
