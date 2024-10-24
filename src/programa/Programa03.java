

package programa;

import java.util.Scanner;
public class Programa03 {
 
 public static void main (String [] args){
     
     int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;
        int filaMayor = 0, columnaMayor = 0;
        int filaMenor = 0, columnaMenor = 0;

     Scanner lectura = new Scanner (System.in);
           
        System.out.println("Ingrese las ventas para la matriz de 4x4:");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese Venta [" + i + "][" + j + "]: ");
                ventas[i][j] = lectura.nextInt();
             
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }

                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }
        
        System.out.println("\nMatriz de Ventas:");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }
       
        System.out.println("\nVenta mayor: " + ventaMayor + " en la posicion [" + filaMayor + "][" + columnaMayor + "]");
        System.out.println("Venta menor: " + ventaMenor + " en la posicion [" + filaMenor + "][" + columnaMenor + "]");
 }   
    
}
