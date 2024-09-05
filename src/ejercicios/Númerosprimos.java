package ejercicios;

public class Númerosprimos {
    // Método principal
    public static void main(String[] args) {
        // número
        int a = 29;

        // Llamar al método para validar si el número es primo
        if (esPrimo(a)) {
            System.out.println(a + " este si es un número primo.");
        } else {
            System.out.println(a + " este no es un número primo.");
        }
    }

    // Método que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // Validar división desde 2 hasta la raíz
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por algún número, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, es primo
    }

}
