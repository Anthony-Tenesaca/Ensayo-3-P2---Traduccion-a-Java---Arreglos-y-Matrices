/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[12];
        int ingreso;
        System.out.println("=================================================================");
        System.out.println("BIENVENIDO AL PROGRAMA - EJERCICIO 5");
        System.out.println("Este programa sirve para pedirle 12 numeros positivos. El sistema");
        System.out.println("le sumara a cada numero la posicion en la que se va a guardar.");
        System.out.println("Instruccion: Ingrese solo numeros mayores a cero uno por uno.");
        System.out.println("=================================================================\n");
        
        for (int i = 0; i < 12; i++) {
        
            System.out.print("Ingrese numero positivo " + (i + 1) + ": ");
            ingreso = teclado.nextInt();
            
            
            numeros[i] = ingreso + (i + 1);
        }

        System.out.println("\n--- Arreglo Modificado ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + (i + 1) + ": " + numeros[i]);
        }
    }
}