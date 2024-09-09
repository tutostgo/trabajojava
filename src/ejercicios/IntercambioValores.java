package ejercicios;

public class IntercambioValores {
    public static void main(String[] args) {
        // Inicializamos las variables
        int a = 5;
        int b = 10;

        // Revisar los valores antes del intercambio
        System.out.println("Antes del intercambio los valores son:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Se intercambian los valores sin usar una variable auxiliar
        a = a + b; // a ahora es 15 (5 + 10)
        b = a - b; // b ahora es 5 (15 - 10)
        a = a - b; // a ahora es 10 (15 - 5)

        // se imprimen y muestran los valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
