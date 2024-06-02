package Ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
       int suma = 0;

        //Llamar a la funcion que suma
        Suma_Enteros(suma);
    }

    //Función que suma los 100 primeros números positivos
    public static int Suma_Enteros(int sumas) {
        for (int i = 0; i <= 100; i++) {
            sumas = sumas + i;
        }
        //Llamar a la función que imprime la suma y pasar la suma como un paranetro entero
        Print_Suma(sumas);
        return 0;
    }

    //Función que imprime la suma
    public static void Print_Suma(int sumas) {
        System.out.println("La suma de los 100 primeros números es: " + sumas);
    }
}