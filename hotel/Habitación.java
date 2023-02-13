private class Habitación

package hotel;

/**
 * Esta clase denominada Habitación define una habitación de un hotel a ser
 * ocupada y desocupada por un huésped.
 *
 * @author ASOC10
 */
public class Habitación {

    private int númeroHabitación;
    /* Atributo que indica el número de la habitación */
    private boolean disponible;
    /* Atributo que indica la disponibilidad de la habitación */
    private double precioDía;
    /* Atributo que indica el precio por día de la habitación */

    private Huésped huésped;

    /* Atributo que indica el huésped que ocupa la habitación */
    /**
     * Constructor de la clase Habitación
     * @param númeroHabitación Parámetro que define el número de la habitación
     * @param disponible Parámetro que define la disponibilidad de la habitación
     * @param precioDía Parámetro que define el precio por día de la habitación
     */
    public Habitación(int númeroHabitación, boolean disponible, double precioDía) {
        this.númeroHabitación = númeroHabitación;
        this.disponible = disponible;
        this.precioDía = precioDía;
    }

    /*
     * Método que obtiene el número de habitación
     * @return El número de habitación
     */
    public int getNúmeroHabitación() {
        return númeroHabitación;
    }

    /*
     * Método que obtiene la disponibilidad de la habitación
     * @return La disponibilidad de la habitación
     */
    public boolean getDisponible() {
        return disponible;
    }

    /*
     * Método que obtiene el precio por día de la habitación
     * @return El precio por día de la habitación
     */
    public double getPrecioDía() {
        return precioDía;
    }

    /*
     * Método que obtiene el huésped de la habitación
     * @return El huésped de la habitación
     */
    public Huésped getHuésped() {
        return huésped;
    }

    /*
     * Método que establece el huésped de la habitación
     * @param Parámetro que define el huésped de la habitación
     */
    public void setHuésped(Huésped huésped) {
        this.huésped = huésped;
    }

    /*
     * Método que establece la disponibilidad de la habitación
     * @param Parámetro que define la disponibilidad de la habitación
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}


Printf "Hola Mundo"