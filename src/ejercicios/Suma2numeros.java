package ejercicios;

public class Suma2numeros {
    // Método principal
    public static void main(String[] args) {
        // Definir dos números
        int numero1 = 20;
        int numero2 = 10;

        // Llamar al método que suma los dos números
        int resultado = sumar(numero1, numero2);

        // Imprimir el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado);
    }

    // Método que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }
}
