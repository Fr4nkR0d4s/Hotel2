
package hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

/**
 * Esta clase denominada VentanaHabitaciones define una ventana que muestra las
 * diez habitaciones del hotel y su disponibilidad
 *
 * @author ASOC10
 */
public class VentanaHabitaciones extends JFrame implements ActionListener {
    private Container contenedor;/* Un contenedor de elementos gráficos */
// Etiquetas de cada habitación
    private JLabel habitación1, habitación2, habitación3, habitación4, habitación5;
    private JLabel habitación6, habitación7, habitación8, habitación9, habitación10;
// Etiquetas de disponibilidad cada habitación
    private JLabel disponibleHab1, disponibleHab2, disponibleHab3, disponibleHab4, disponibleHab5;
    private JLabel disponibleHab6, disponibleHab7, disponibleHab8, disponibleHab9, disponibleHab10;
    private JLabel habitaciónSeleccionada; /* Etiqueta para indicar la habitación a ocupar */
    private JSpinner campoHabitaciónSeleccionada; /* Selector numérico de habitación a ocupar */
    private SpinnerNumberModel modeloSpinner; /* Modelo de datos del selector */
    private JButton botónAceptar; // Botón aceptar 
    private Hotel hotel; // Objeto Hotel

    /**
     * Constructor de la clase VentanaHabitaciones
     * @param hotel Hotel con habitaciones y huéspedes
     */
    
    public VentanaHabitaciones(Hotel hotel) {
        this.hotel = hotel;
        inicio();
        setTitle("Habitaciones"); /* Establece el título de la ventana */
        setSize(760,260); /* Establece el tamaño de la ventana */
        setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
        setResizable(false);/* Establece que el tamaño de la ventana no puede cambiar */
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane();
        /* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null);
        /* Establece que el contenedor no tiene un layout */
        Habitación habitación;
/* Establece las etiquetas de la habitación 1 y su disponibilidad */
        habitación1 = new JLabel();
        habitación1.setText("Habitación 1");
/* Establece la posición de la etiqueta de la habitación 1 */
        habitación1.setBounds(20, 30, 130, 23);

        disponibleHab1 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 1 */
        disponibleHab1.setBounds(20, 50, 100, 23);
// Obtiene la habitación 1 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(0);
        if (!habitación.getDisponible()) {/* Determina si la habitación 1 está disponible o no */ 
            disponibleHab1.setText("No disponible");
        }
// Establece las etiquetas de la habitación 2 y su disponibilidad 
        habitación2 = new JLabel();
        habitación2.setText("Habitación 2");
// Establece la posición de la etiqueta de la habitación 2 
        habitación2.setBounds(160, 30, 130, 23); 
        disponibleHab2 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 2 */
        disponibleHab2.setBounds(160, 50, 100, 23);
// Obtiene la habitación 2 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(1);
        if (!habitación.getDisponible()) { /* Determina si la habitación 2 está disponible o no */ 
            disponibleHab2.setText("No disponible");
}
// Establece las etiquetas de la habitación 3 y su disponibilidad 
        habitación3 = new JLabel();
        habitación3.setText("Habitación 3");
// Establece la posición de la etiqueta de la habitación 3 
        habitación3.setBounds(300, 30, 130, 23); 
        disponibleHab3 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 3 */
        disponibleHab3.setBounds(300, 50, 100, 23);
// Obtiene la habitación 3 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(2);
        if (!habitación.getDisponible()) {/* Determina si la habitación 3 está disponible o no */ 
            disponibleHab3.setText("No disponible");
}


// Establece las etiquetas de la habitación 4 y su disponibilidad 
        habitación4 = new JLabel();
        habitación4.setText("Habitación 4");
// Establece la posición de la etiqueta de la habitación 4 
        habitación4.setBounds(440, 30, 130, 23); 
        disponibleHab4 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 4 */
disponibleHab4.setBounds(440, 50, 100, 23);
// Obtiene la habitación 4 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(3);
        if (!habitación.getDisponible()) {/* Determina si la habitación 4 está disponible o no */ 
            disponibleHab4.setText("No disponible");
}
// Establece las etiquetas de la habitación 5 y su disponibilidad 
        habitación5 = new JLabel();
// Establece la posición de la etiqueta de la habitación 5 
        habitación5.setText("Habitación 5");
        habitación5.setBounds(580, 30, 135, 23);
        disponibleHab5 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 5 */
disponibleHab5.setBounds(580, 50, 100, 23);
// Obtiene la habitación 5 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(4);
        if (!habitación.getDisponible()) {
            /* Determina si la habitación 5 está disponible o no */ 
            disponibleHab5.setText("No disponible");
}
// Establece las etiquetas de la habitación 6 y su disponibilidad 
        habitación6 = new JLabel();
        habitación6.setText("Habitación 6");
// Establece la posición de la etiqueta de la habitación 6 
        habitación6.setBounds(20, 120, 130, 23); 
        disponibleHab6 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 6 */
        disponibleHab6.setBounds(20, 140, 100, 23);
// Obtiene la habitación 6 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(5);

        if (!habitación.getDisponible()) {
            /* Determina si la habitación 6 está disponible o no */
            disponibleHab6.setText("No disponible");
}
// Establece las etiquetas de la habitación 7 y su disponibilidad 
        habitación7 = new JLabel();
        habitación7.setText("Habitación 7");
// Establece la posición de la etiqueta de la habitación 7 
        habitación7.setBounds(160, 120, 130, 23); 
        disponibleHab7 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 7 */
disponibleHab7.setBounds(160, 140, 100, 23);
// Obtiene la habitación 7 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(6);
        if (!habitación.getDisponible()) {/* Determina si la habitación 7 está disponible o no */ 
            disponibleHab7.setText("No disponible");
}
// Establece las etiquetas de la habitación 8 y su disponibilidad 
        habitación8 = new JLabel();
        habitación8.setText("Habitación 8");
// Establece la posición de la etiqueta de la habitación 8 
        habitación8.setBounds(300, 120, 130, 23); 
        disponibleHab8 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 8 */
disponibleHab8.setBounds(300, 140, 100, 23);
// Obtiene la habitación 8 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(7);
        if (!habitación.getDisponible()) {/* Determina si la habitación 8 está disponible o no */ 
            disponibleHab8.setText("No disponible");
}
// Establece las etiquetas de la habitación 9 y su disponibilidad 
        habitación9 = new JLabel();
        habitación9.setText("Habitación 9");
// Establece la posición de la etiqueta de la habitación 9 
        habitación9.setBounds(440, 120, 130, 23); 
        disponibleHab9 = new JLabel("Disponible");

/* Establece la posición de la etiqueta de la disponibilidad de la habitación 9 */
disponibleHab9.setBounds(440, 140, 100, 23);
// Obtiene la habitación 9 de la lista de habitaciones
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(8);
        if (!habitación.getDisponible()) {/* Determina si la habitación 9 está disponible o no */ 
            disponibleHab9.setText("No disponible");
}
// Establece las etiquetas de la habitación 10 y su disponibilidad 
        habitación10 = new JLabel();
        habitación10.setText("Habitación 10");
// Establece la posición de la etiqueta de la habitación 10 
        habitación10.setBounds(580, 120, 135, 23); 
        disponibleHab10 = new JLabel("Disponible");
/* Establece la posición de la etiqueta de la disponibilidad de la habitación 10 */
        disponibleHab10.setBounds(580, 140, 100, 23);
// Obtiene la habitación 10 de la lista de habitaciones 
        habitación = (Habitación) hotel.listaHabitaciones.elementAt(9);
        if (!habitación.getDisponible()) {
            /* Determina si la habitación 10 está disponible o no */
            disponibleHab10.setText("No disponible");
        }
// Establece la etiquetas de la habitación a reservar 
        habitaciónSeleccionada = new JLabel(); 
        habitaciónSeleccionada.setText("Habitación a reservar:");
// Establece la posición de la etiqueta de la habitación a reservar 
        habitaciónSeleccionada.setBounds(250, 180, 135, 23); 
        campoHabitaciónSeleccionada = new JSpinner(); /* Crea un selector numérico */
modeloSpinner = new SpinnerNumberModel();
        /* Crea un modelo numérico para el selector */
// Define valores mínimo, máximo y actual del modelo numérico 
        modeloSpinner.setMinimum(1); 
        modeloSpinner.setMaximum(10);
        modeloSpinner.setValue(1);
// Asocia el modelo numérico al spinner 
        campoHabitaciónSeleccionada.setModel(modeloSpinner);
// Establece la posición del selector numérico
        campoHabitaciónSeleccionada.setBounds(380, 180, 40, 23); 
// Establece el botón aceptar // 
        botónAceptar = new JButton("Aceptar");
        botónAceptar.setBounds(500, 180, 100, 23); /* Establece la posición del botón aceptar*/
        
    /* Se agregan los componentes gráficos al contenedor de la ventana */
    contenedor.add (habitación1);
    contenedor.add (disponibleHab1);
    contenedor.add (habitación2);
    contenedor.add (disponibleHab2);
    contenedor.add (habitación3);
    contenedor.add (disponibleHab3);
    contenedor.add (habitación4);
    contenedor.add (disponibleHab4);
    contenedor.add (habitación5);
    contenedor.add (disponibleHab5);
    contenedor.add (habitación6);
    contenedor.add (disponibleHab6);
    contenedor.add (habitación7);
    contenedor.add (disponibleHab7);
    contenedor.add (habitación8);
    contenedor.add (disponibleHab8);
    contenedor.add (habitación9);
    contenedor.add (disponibleHab9);
    contenedor.add (habitación10);
    contenedor.add (disponibleHab10);
    contenedor.add (habitaciónSeleccionada);
    contenedor.add (campoHabitaciónSeleccionada);
    contenedor.add (botónAceptar);

    /* Agrega al botón un ActionListener para que gestione eventos del botón */
    botónAceptar.addActionListener (this);
    } 
    /*Método que gestiona los eventos generados en la ventana principal*/ 
            
    @Override
    public void actionPerformed(ActionEvent evento){

        if (evento.getSource() == botónAceptar) { /* Se pulsa el botón Aceptar */
/* Se obtiene la habitación seleccionada */
            int habitación = (int) campoHabitaciónSeleccionada.getValue();
            if (!hotel.buscarHabitaciónOcupada(habitación)) { /* Si la habitación no está ocupada */
// Se registra ingreso en la habitación 
                VentanaIngreso ventanaIngreso = new
                VentanaIngreso(hotel, habitación);
                setVisible(false);/* La ventana con el listado de habitaciones se cierra */ 
                ventanaIngreso.setVisible(true);
                /* La ventana de ingreso
del húesped se hace visible */
            } else {
                /* Si la habitación está ocupada se genera un cuadro de diálogo informando la situación */ 
                JOptionPane.showMessageDialog(this,"La habitación está ocupada","Mensaje", JOptionPane.INFORMATION_MESSAGE,null);
}
}
}}

