package ejercicios;

public class Maximotresnumeros {
    // Método principal
    public static void main(String[] args) {
        // Definiendo los números
        int a = 5;
        int b = 12;
        int c = 9;

        // Analisis de cuál de los números es el mayor
        int mayor = a; // Se parte con que 'a' es el mayor

        if (b > mayor) {
            mayor = b; // Se actualiza a mayor si es 'b'
        }

        if (c > mayor) {
            mayor = c; // Se actualiza a mayor si es 'c'
        }

        // Imprimir el resultado
        System.out.println("Este si es el mayor: " + mayor);
    }

}
