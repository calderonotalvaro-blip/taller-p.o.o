/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerconstructores;

/**
 *
 * @author estuam
 */
public class Paquete {
    // Atributos
    String codigo;
    String destino;
    double peso;
    boolean asegurado;

    // Constructor principal (4 parámetros)
    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }

    // 1. Constructor que recibe código y destino (delega al constructor de 4 parámetros)
    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false); // Asigna peso = 1.0 y asegurado = false por defecto
    }

    // 2. Constructor que recibe solo el código (delega al constructor de 2 parámetros)
    public Paquete(String codigo) {
        this(codigo, "Por asignar"); // Asigna destino = "Por asignar" por defecto
    }

    // Método para imprimir la información
    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | " + peso + " kg | asegurado: " + asegurado);
    }
}