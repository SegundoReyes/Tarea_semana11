
package programa;

import java.util.Scanner;
public class Programa01 {
    public static void main ( String [] args){
        
         double[][] ventas = new double[4][4];
        double totalVentas = 0;
        
        Scanner lectura = new Scanner ( System.in);
        System.out.println("Introduce 16 valores de ventas para llenar la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("ingrese venta : ");
                ventas[i][j] = lectura.nextDouble();
                totalVentas += ventas[i][j]; 
            }
        }

        System.out.println("\nTotal de las ventas: " + totalVentas);
    }
}
