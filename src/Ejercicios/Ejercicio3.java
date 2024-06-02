package Ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        int nota = 1;
        boolean valor;

        if (nota == 7) {
            System.out.println("Felicitaciones, aprobado con nota 7");
        } else if ((nota >= 4) && (nota < 7)) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}