/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA - EJERCICIO 1");
        System.out.println("Este programa sirve para guardar una lista de datos numericos en la computadora(10 numeros)");
        System.out.println("y luego mostrarlos en la pantalla de forma ordenada.");
        System.out.println("Instruccion: Por favor, escriba los valores uno por uno cuando se le pida.");
        System.out.println("=================================================================\n");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ":" + numeros[i]);
        }
    }
}