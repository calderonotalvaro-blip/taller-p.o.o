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
        Paquete p1 = new Paquete("P-001", "Manizales", 6.5, true);

       
        p1.mostrarInformacion("DETALLE DE ENVÍO");

       
        if (p1.esPesado()) {
            System.out.println("AVISO: El paquete requiere manejo especial por exceso de peso (> 5.0 kg).");
        }
    }
}