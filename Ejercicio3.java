/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA - EJERCICIO 3");
        System.out.println("Este programa sirve para pedirle una lista de numeros enteros");
        System.out.println("y contar de forma automatica cuantos de ellos son pares y cuantos impares.");
        System.out.println("Instruccion: Por favor, escriba los valores uno por uno cuando se le pida.");
        System.out.println("=================================================================\n");
        for (int i = 0; i < 15; i++) {
            
            System.out.print("Ingrese numero entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 0; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i; 
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i; 
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        
        System.out.println("Posicion donde se encuentra el mayor: " + (posMayor + 1));
        System.out.println("Posicion donde se encuentra el menor: " + (posMenor + 1));
    }
}