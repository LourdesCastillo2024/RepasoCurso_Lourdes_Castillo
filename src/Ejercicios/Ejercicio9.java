package Ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Crea una lista de 7 números enteros (arreglo de enteros)
        int [] Lista = {700,892,5,100,8,60,20};
        Print_MenorLista(Lista);
    }
    //Función que identifica e imprime el menor de la lista
    public static void Print_MenorLista(int[] List){
        int menor= List[0];

        for (int i=0; i<=List.length-1;i++) {
            if (List[i] < menor){
                menor = List[i];
            }
        }
            System.out.println("El menor de la lista es: " + menor);
    }
}
