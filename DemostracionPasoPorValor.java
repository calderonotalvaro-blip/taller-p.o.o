/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerconstructores;

/**
 *
 * @author estuam
 */
public class DemostracionPasoPorValor {

    
    public static void modificarValor(double numero) {
        numero = numero + 50.0; 
        System.out.println("Valor dentro del método: " + numero);
    }

    public static void main(String[] args) {
        double valorOriginal = 100.0;

        System.out.println("Valor antes de llamar al método: " + valorOriginal);

        
        modificarValor(valorOriginal);

       
        System.out.println("Valor después de llamar al método: " + valorOriginal);
    }
}
