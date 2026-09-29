/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerconstructores;

/**
 *
 * @author estuam
 */

public class Envio {

    public static void main(String[] args) {
        
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");

        
        p3.actualizarPeso(2.5);

        
        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();

        
        System.out.println("Total del envío: " + total);
    }
}