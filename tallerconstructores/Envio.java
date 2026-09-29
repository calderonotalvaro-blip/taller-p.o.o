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
        Paquete paquete1 =  new Paquete();
        
        System.out.println(paquete1.codigo);
        System.out.println(paquete1.destino);
        System.out.println(paquete1.peso);
        System.out.println(paquete1.asegurado); 
    }
}
