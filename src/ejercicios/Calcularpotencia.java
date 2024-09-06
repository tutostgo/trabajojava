package ejercicios;

public class Calcularpotencia {
    public static void main(String[] args) {
        int base = 2;    // Número base
        int exponente = 8; // Potencia

        // Calcular la potencia usando librería Math.pow
        double resultado = Math.pow(base, exponente);

        // Mostrar el resultado
        System.out.printf("%d es el elevado a la potencia de: %d y es %.0f%n", base, exponente, resultado);
    }
}
