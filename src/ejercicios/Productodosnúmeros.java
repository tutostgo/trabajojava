package ejercicios;

public class Productodosnúmeros {
// Método principal
    public static void main(String[] args) {
        // Definir dos números
        int a = 7;
        int b = 8;

        // Llamar al método que saca producto
        int resultado = multiplicar(a, b);

        // Imprimir
        System.out.println("Producto es " + a + " y " + b + " es " + resultado);
    }

    // Método que multiplica el producto
    public static int multiplicar(int c, int d) {
        return c * d;
    }
}
