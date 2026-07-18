/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int mayor, menor;

        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA DE BUSQUEDA DE EXTREMOS (5x5)");
        System.out.println("Instruccion: Ingrese 25 numeros enteros uno por uno.");
        System.out.println("El sistema analizara la tabla para hallar el numero mas alto y el mas bajo.");
        System.out.println("=================================================================\n");
        System.out.println("--- Llenado de Matriz 5x5 ---");
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Fila " + (f + 1) + ", Columna " + (c + 1) + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }

        
        System.out.println("\n--- Matriz Impresa ---");
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c]);
                
                if (c < 4) {
                    System.out.print("\t| ");
                }
            }
            System.out.println("\n"); 
        }

        
        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[f][c] > mayor) {
                    mayor = matriz[f][c];
                }
                if (matriz[f][c] < menor) {
                    menor = matriz[f][c];
                }
            }
        }

       
        System.out.println("--- Resultados ---");
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}