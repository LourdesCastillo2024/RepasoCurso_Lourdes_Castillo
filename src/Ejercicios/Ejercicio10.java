package Ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Crea una lista de 7 números enteros (arreglo de enteros)
        int[] Lista = {700, 892, 5, 100, 8, 60, 20};
        //Llama a la función que calcula el promedio de la lista
        Print_PromedioLista(Lista);
    }

        //Función que calcula el promedio de la lista y la imprime
        public static void Print_PromedioLista(int[] List){
            int suma = 0;
            int longitud = List.length;
            int promedio;
            for (int i=0; i<=longitud-1;i++) {
                suma = suma + List[i];
                }
            promedio = suma/longitud;
            System.out.println("El promedio de la lista es: " + promedio);
        }
    }
