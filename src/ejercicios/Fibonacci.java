package ejercicios;

public class Fibonacci {
    // Método principal
    public static void main(String[] args) {
        // Definir el número de términos en la secuencia de Fibonacci
        int N = 10;

        // Inicializar los primeros dos números
        int a = 0, b = 1;

        // Impresión de los primeros números
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            int siguiente = a + b;
            System.out.print(siguiente + " ");
            a = b;
            b = siguiente;
        }
    }
}
