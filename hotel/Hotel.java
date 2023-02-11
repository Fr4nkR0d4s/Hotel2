
package hotel;

/**
 *
 * @author ASOC10
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Hotel {

        /* Atributo que establece el conjunto de habitaciones del hotel*/
        public static Vector<Habitación> listaHabitaciones;
        /*
         * Constructor de la clase Hotel
         */
        public Hotel() {
            listaHabitaciones = new Vector<Habitación>(); /* Crea el vector de habitaciones */
             /* Crea cada habitación con un número de habitación, disponibilidad inicial y precio por día */
        Habitación habitación1 = new Habitación(1, true, 1200);
            Habitación habitación2 = new Habitación(2, true, 1200);
            Habitación habitación3 = new Habitación(3, true, 1200);
            Habitación habitación4 = new Habitación(4, true, 1200);
            Habitación habitación5 = new Habitación(5, true, 1200);
            Habitación habitación6 = new Habitación(6, true, 1600);
            Habitación habitación7 = new Habitación(7, true, 1600);
            Habitación habitación8 = new Habitación(8, true, 1600);
            Habitación habitación9 = new Habitación(9, true, 1600);
            Habitación habitación10 = new Habitación(10, true, 1600); 
/* Se agrega cada habitación al vector de habitaciones del hotel */
                    listaHabitaciones.add(habitación1); 
                    listaHabitaciones.add(habitación2); 
                    listaHabitaciones.add(habitación3); 
                    listaHabitaciones.add(habitación4); 
                    listaHabitaciones.add(habitación5); 
                    listaHabitaciones.add(habitación6); 
                    listaHabitaciones.add(habitación7); 
                    listaHabitaciones.add(habitación8); 
                    listaHabitaciones.add(habitación9); 
                    listaHabitaciones.add(habitación10);
        }

        /**
         * Método que dado un número de habitación, busca la fecha de ingreso de
         * un huésped a dicha habitación
         *
         * @param número Número de habitación a buscar
         * @return Fecha de ingreso a la habitación
         */
        public String buscarFechaIngresoHabitación(int número) {
            for (int i = 0; i < listaHabitaciones.size(); i++) {/* Recorre el vector de habitaciones */
                /* Obtiene un elemento del vector */
                Habitación habitación = (Habitación) listaHabitaciones.elementAt(i);
                if (habitación.getNúmeroHabitación() == número) {/* Si el número buscado es encontrado */
                    /* Se obtiene la fecha de ingreso */
                    Date fecha = habitación.getHuésped().getFechaIngreso();
                    /* Se le da formato a la fecha de ingreso */
                    DateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
            return formatoFecha.format(fecha);
                    /* Devuelve la fecha de ingreso */
                }
            }
            return""; /* En caso de no encontrar la habitación */
}
/**
*	Método que dado un número de habitación, devuelve si la habitación está ocupada o no
*	@param número Número de habitación a buscar
*	@return Valor booleano con la disponibilidad de la habitación
*	buscada
*/
        public boolean buscarHabitaciónOcupada(int número) {
            for (int i = 0; i < listaHabitaciones.size(); i++) {
                /* Recorre el vector de habitaciones */
// Obtiene un elemento del vector
                Habitación habitación = (Habitación) listaHabitaciones.elementAt(i);
                if (habitación.getNúmeroHabitación() == número
                        && !habitación.getDisponible()) {
// Si la habitación está disponible return true;
                }
            }
            return false; // Si la habitación no está disponible
        }
    }

