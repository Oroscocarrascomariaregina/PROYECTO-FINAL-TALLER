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
public class PC1PROBLEMA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int h, m, s;

        System.out.print("Ingrese horas: ");
        h = lector.nextInt();

        System.out.print("Ingrese minutos: ");
        m = lector.nextInt();

        System.out.print("Ingrese segundos: ");
        s = lector.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Error: Hora inválida");
            return;
        }

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.printf("Hora siguiente: %02d:%02d:%02d\n", h, m, s);
    }
}