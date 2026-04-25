/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc1;
import java. util.Scanner;
/**
 *
 * @author Maria Orosco
 */
public class PC1PROBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double soles, resultado = 0;
        int opcion;
        String moneda = "";

        System.out.print("Ingrese la cantidad en Soles: ");
        soles = lector.nextDouble();

        System.out.println("\nSeleccione la moneda:");
        System.out.println("1. Dólares (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Libras (GBP)");
        System.out.println("4. Pesos Mexicanos (MXN)");

        opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                resultado = soles * 0.27;
                moneda = "USD";
                break;
            case 2:
                resultado = soles * 0.25;
                moneda = "EUR";
                break;
            case 3:
                resultado = soles * 0.21;
                moneda = "GBP";
                break;
            case 4:
                resultado = soles * 4.50;
                moneda = "MXN";
                break;
            default:
                System.out.println("Moneda no disponible");
                return;
        }

        System.out.printf("Resultado: %.2f soles equivalen a %.2f %s\n", soles, resultado, moneda);
    }
}