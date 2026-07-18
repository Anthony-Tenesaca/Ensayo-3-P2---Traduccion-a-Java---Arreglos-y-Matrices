/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];
        
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA DE VISUALIZACION DE MATRICES (3x4)");
        System.out.println("Instruccion: Ingrese 12 numeros enteros uno por uno.");
        System.out.println("El sistema organizara sus datos y los mostrara en una tabla.");
        System.out.println("=================================================================\n");
        System.out.println("--- Llenado de Matriz 3x4 ---");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                
                System.out.print("Fila " + (f + 1) + ", Columna " + (c + 1) + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }

        System.out.println("\n--- Matriz Impresa ---");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[f][c]);
                if (c < 3) {
                    System.out.print("\t| ");
                }
            }
            System.out.println("\n"); 
        }
    }
}