/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author Maria Orosco
 */
public class ejercicioboletodeviaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        // Tipos de datos primitivos
        String nombre;
        String origen;
        String destino;
        int edad;
        double precioPasaje;
        double descuento;
        double total;
        char tipoServicio;
        boolean estudiante;

        System.out.println("=== BOLETO DE VIAJE INTERPROVINCIAL ===");

        System.out.print("Nombre del pasajero: ");
        nombre = lector.nextLine();

        System.out.print("Origen: ");
        origen = lector.nextLine();

        System.out.print("Destino: ");
        destino = lector.nextLine();

        System.out.print("Edad: ");
        edad = lector.nextInt();

        System.out.print("Precio del pasaje: ");
        precioPasaje = lector.nextDouble();

        System.out.print("Tipo de servicio (E = Económico / V = VIP): ");
        tipoServicio = lector.next().charAt(0);

        System.out.print("¿Es estudiante? (true/false): ");
        estudiante = lector.nextBoolean();

        // Cálculo de descuento
        descuento = 0;

        if (edad < 18) {
            descuento = precioPasaje * 0.5; // 50% descuento
        } else if (estudiante) {
            descuento = precioPasaje * 0.2; // 20% descuento
        }

        total = precioPasaje - descuento;

        // Impresión del boleto
        System.out.println("\n======= BOLETO =======");
        System.out.println("Pasajero: " + nombre);
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Edad: " + edad);
        System.out.println("Servicio: " + tipoServicio);
        System.out.println("Precio: S/ " + precioPasaje);
        System.out.println("Descuento: S/ " + descuento);
        System.out.println("TOTAL A PAGAR: S/ " + total);
        System.out.println("======================");
    }
}

