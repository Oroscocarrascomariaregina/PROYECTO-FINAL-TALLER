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

    /**
     *
     * @author Maria Orosco
     */
    public static class PC1 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner lector = new Scanner(System.in);
            double pension;
            double promedio;
            double descuento = 0;
            double montoDescuento;
            double bono;
            double total;
            System.out.print("Ingrese la pensi\u00f3n base: ");
            pension = lector.nextDouble();
            System.out.print("Ingrese el promedio ponderado: ");
            promedio = lector.nextDouble();
            System.out.print("\u00bfPagar\u00e1 al contado? (1: S\u00ed / 2: No): ");
            int contado = lector.nextInt();
            if (promedio >= 18 && promedio <= 20) {
                descuento = 0.2;
            } else if (promedio >= 15 && promedio < 18) {
                descuento = 0.1;
            } else if (promedio >= 13 && promedio < 15) {
                descuento = 0.05;
            } else {
                descuento = 0.0;
            }
            montoDescuento = pension * descuento;
            bono = (contado == 1) ? 50 : 0;
            total = pension - montoDescuento - bono;
            System.out.println("\n--- DESGLOSE DE MATR\u00cdCULA ---");
            System.out.printf("Pensi\u00f3n base: S/ %.2f\n", pension);
            System.out.printf("Descuento por promedio: S/ %.2f\n", montoDescuento);
            System.out.printf("Bono por pago al contado: S/ %.2f\n", bono);
            System.out.printf("Monto final a pagar: S/ %.2f\n", total);
        }
    }
}

