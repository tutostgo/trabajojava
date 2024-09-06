package ejercicios;

public class PalindromoN {
    public static void main(String[] args) {
        int numero = 1221; // Número a verificar
        // Verificar si el número es palíndromo y lo imprime
        System.out.println("Número: " + numero);
        System.out.println("¿Es palíndromo? " + (esPalindromo(numero) ? "Sí" : "No"));
    }

    // Método para validar  número como palíndromo
    public static boolean esPalindromo(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        // Inversión del número
        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            numero /= 10;
        }

        // Comparar número original con número invertido
        return numeroOriginal == numeroInvertido;
    }
}
