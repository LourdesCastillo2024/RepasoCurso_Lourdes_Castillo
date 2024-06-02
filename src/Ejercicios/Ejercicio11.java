package Ejercicios;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] serie = new int[10];
        //esa manera de inicializar el arreglo la conseguí en una ayuda y decidí dejarla

        //Llana a la función para calcular los 10 primeros términos de la sucesión de Fibonacci
        Sucesion(serie);
    }

    //Genera los 10 primeros términos de la sucesión de Fibonacci (0,1,1,2,3,5,8,13,21,34)
    public static void Sucesion(int[] fibonacci) {
        int n = 10; //longitud hasta 10
        int i; //índice
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        for (i = 3; i <= n-1; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("Los 10 primeros términos de la lista de Fibonacci son: " + Arrays.toString(fibonacci));
        //Esa manera de imprimir la lista me la dijo la ayuda y decidí dejarla, pero aún no la entiendo
    }
}
