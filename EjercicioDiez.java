/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class EjercicioDiez{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matrizOriginal = new int[3][5];
        int[][] matrizModificada = new int[3][5];

        
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA DE MODIFICACION DE MATRICES (3x5)");
        System.out.println("Instruccion: Ingrese 15 numeros enteros uno por uno.");
        System.out.println("El sistema sumara automaticamente (Fila * Columna) a cada numero.");
        System.out.println("=================================================================\n");
        System.out.println("--- Llenado de Matriz 3x5 ---");
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Fila " + (f + 1) + ", Columna " + (c + 1) + ": ");
                matrizOriginal[f][c] = teclado.nextInt();
                
                
                int filaVisual = f + 1;
                int columnaVisual = c + 1;
                matrizModificada[f][c] = matrizOriginal[f][c] + (filaVisual * columnaVisual);
            }
        }

        
        System.out.println("\n--- Matriz Original Ingresada ---");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matrizOriginal[f][c]);
                if (c < 4) {
                    System.out.print("\t| ");
                }
            }
            System.out.println("\n");
        }

        
        System.out.println("--- Matriz Resultante (Con la formula aplicada) ---");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matrizModificada[f][c]);
                if (c < 4) {
                    System.out.print("\t| ");
                }
            }
            System.out.println("\n");
        }
    }
}