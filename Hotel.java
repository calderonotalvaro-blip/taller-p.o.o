/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerconstructores;

/**
 *
 * @author estuam
 */
public class Hotel {

    public static void main(String[] args) {
       
        Habitacion h1 = new Habitacion(101, "Sencilla");                           
        Habitacion h2 = new Habitacion(102, "Doble", 180000.0, false);             
        Habitacion h3 = new Habitacion(201, "Suite Presidencial", 300000.0, false); 

    
        h1.ocupar();

      
        System.out.println("=== ESTADO DE LAS HABITACIONES ===");
        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        System.out.println("\n=== CÁLCULO DE ESTADÍA (Habitación 101 - 3 noches) ===");
        
        
        double costoNormal = h1.calcularEstadia(3);
        System.out.println("Costo sin descuento: $" + costoNormal);

       
        double costoConDescuento = h1.calcularEstadia(3, 10.0);
        System.out.println("Costo con 10% de descuento: $" + costoConDescuento);
    }
}
