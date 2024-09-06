package ejercicios;

public class SumaNpares {
    public static void main(String[] args) {
        int suma = 0;

        // Sumar solo los números pares en el rango
        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }

        // Mostrar el resultado
        System.out.printf("La suma de todos los números pares entre 1 y 100 es %d%n", suma);
    }
}
