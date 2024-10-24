package programa;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {

        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        double promedioVentas;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese las ventas para la matriz de 3x3:");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese Venta : ");
                ventas[i][j] = lectura.nextInt();
                totalVentas += ventas[i][j];
            }
        }

        promedioVentas = (double) totalVentas / (ventas.length * ventas[0].length);

        System.out.println("\nTotal de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}
