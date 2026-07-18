/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA DE DIAGONAL PRINCIPAL (4x4)");
        System.out.println("Instruccion: Ingrese 16 numeros enteros uno por uno.");
        System.out.println("El sistema aislara y sumara unicamente la diagonal de la tabla.");
        System.out.println("=================================================================\n");
        System.out.println("--- Llenado de Matriz 4x4 ---");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Fila " + (f + 1) + ", Columna " + (c + 1) + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }

        
        System.out.println("\n--- Matriz Impresa ---");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[f][c]);
                
                if (c < 3) {
                    System.out.print("\t| ");
                }
            }
            System.out.println("\n"); 
        }

        
        System.out.println("--- Elementos de la Diagonal Principal ---");
        for (int f = 0; f < 4; f++) {
            System.out.print(matriz[f][f] + " ");
            sumaDiagonal += matriz[f][f];
        }

        
        System.out.println("\n\n--- Resultados ---");
        System.out.println("La suma de la diagonal principal: " + sumaDiagonal);
    }
}