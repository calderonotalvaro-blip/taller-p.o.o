/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerconstructores;

/**
 *
 * @author estuam
 */
public class Habitacion {

    
    private int numero;
    private String tipo;
    private double precioNoche;
    private boolean ocupada;

   
    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }

    
    public Habitacion(int numero, String tipo) {
        this(numero, tipo, 120000.0, false);
    }

    
    public void ocupar() {
        this.ocupada = true;
    }

    
    public boolean estaDisponible() {
        return !this.ocupada;
    }

  
    public double calcularEstadia(int noches) {
        return noches * this.precioNoche;
    }

   
    public double calcularEstadia(int noches, double descuento) {
        double costoSinDescuento = calcularEstadia(noches);
        double valorDescuento = costoSinDescuento * (descuento / 100.0);
        return costoSinDescuento - valorDescuento;
    }

    
    public void mostrarInformacion() {
        String estado = ocupada ? "Ocupada" : "Disponible";
        System.out.println("Habitación " + numero + " (" + tipo + ") | $" 
                           + precioNoche + " por noche | Estado: " + estado);
    }
}
