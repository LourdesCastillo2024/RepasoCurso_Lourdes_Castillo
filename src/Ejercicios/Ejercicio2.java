package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        2)	Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        Si son iguales indicarlo también. Alterna los valores para comprobar que funcione.
         */
        int a = 39;
        int b = 43;
        //a es mayor que b
        if (a>b){
            System.out.println(a + " es mayor que " + b );
        }else if(b>a){ //b es mayor que a
                System.out.println(b + " es mayor que " + a);
            }else{
                System.out.println(a + " es igual a " + b);
            }
        }
    }
