/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc1;
import java.util.Scanner;
/**
 *
 * @author Maria Orosco
 */
public class PROBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        double pension, promedio, descuento = 0, montoDescuento, bono, total;

        System.out.print("Ingrese la pensión base: ");
        pension = lector.nextDouble();

        System.out.print("Ingrese el promedio ponderado: ");
        promedio = lector.nextDouble();

        System.out.print("¿Pagará al contado? (1: Sí / 2: No): ");
        int contado = lector.nextInt();

        if (promedio >= 18 && promedio <= 20) {
            descuento = 0.20;
        } else if (promedio >= 15 && promedio < 18) {
            descuento = 0.10;
        } else if (promedio >= 13 && promedio < 15) {
            descuento = 0.05;
        } else {
            descuento = 0.0;
        }

        montoDescuento = pension * descuento;

        bono = (contado == 1) ? 50 : 0;

        total = pension - montoDescuento - bono;

        System.out.println("\n--- DESGLOSE DE MATRÍCULA ---");
        System.out.printf("Pensión base: S/ %.2f\n", pension);
        System.out.printf("Descuento por promedio: S/ %.2f\n", montoDescuento);
        System.out.printf("Bono por pago al contado: S/ %.2f\n", bono);
        System.out.printf("Monto final a pagar: S/ %.2f\n", total);
    }
}
 