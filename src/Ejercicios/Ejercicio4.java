package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int sueldoBruto=1000000;
        int afp, salud, cesantia, liquido, descuentos;

        //Sueldo Bruto
        System.out.println("Sueldo Bruto = "  + sueldoBruto);

        //Descuento AFP
        afp = (sueldoBruto*7)/100;
        System.out.println("Descuento AFP = " + afp + " (7% del sueldo bruto)");

        //Descuento salud (10% del sueldo bruto)
        salud = (sueldoBruto*10)/100;
        System.out.println("Descuento Salud = " + salud + " (10% del sueldo bruto)");

        // Descuento bono cesantía (1% del sueldo bruto)
        cesantia = sueldoBruto/100;
        System.out.println("Descuento Bono Cesantía = " + cesantia + " (1% del sueldo bruto)");

        // Sueldo liquido (sueldo bruto – descuentos)
        descuentos = (afp + salud + cesantia);
        liquido = sueldoBruto - descuentos;
        System.out.println("Sueldo líquido = " + liquido + " (Sueldo bruto - descuentos)");
    }
}
