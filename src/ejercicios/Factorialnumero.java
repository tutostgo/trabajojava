package ejercicios;

public class Factorialnumero {
    // Método principal
    public static void main(String[] args) {
        // Definición de variable
        int a = 6;

        // Calcular y muestra de factorial
        System.out.println("El factorial de " + a + " es " + factorial(a));
    }

    // Método para calcular el factorial
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
