
package programa;

import java.util.Scanner;
public class Programa02 {
    public static void main (String [] args){
        
      Scanner lectura = new Scanner (System.in);
      
       int filas = 4;
        int columnas = 4;
        int[][] compras = new int[filas][columnas];

       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la compra : ");
                compras[i][j] = lectura.nextInt();
            }
        }

        int total = 0;
        int numCompras = filas * columnas;

       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                total += compras[i][j];
            }
        }
      
        double promedio = (double) total / numCompras;

        System.out.println("Total de las compras: " + total);
        System.out.println("Promedio de las compras: " + promedio);
    }
}
