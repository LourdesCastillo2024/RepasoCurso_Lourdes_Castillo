package Ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
       int i;

       /* Crea un bucle FOR que inicie en 0 y llegue a 1000 con la condición de que si llega a 250
       debe salir del bucle, el incremento debe ser de 10 en 10 y se debe imprimir el resultado del conteo y
       además un mensaje que ha salido del bucle. */
        for(i=0; i<=1000; i=i+10){
           if (i==250) {
               break;
           }
        }
        System.out.println("El resultado del conteo es: "+ i);
        System.out.println(" ");
        System.out.println("--//-- Ha salido del bucle --//--");
    }
}