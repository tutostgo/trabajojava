package ejercicios;

public class ValidaCuadradoPerfecto {
    public static void main(String[] args) {
        int numero = 64;
        System.out.println(numero + " es un cuadrado perfecto: " + esCuadradoPerfecto(numero));
    }

    // Método para verificar número como cuadrado perfecto
    private static boolean esCuadradoPerfecto(int numero) {
        int raiz = (int) Math.sqrt(numero); // Calcular la raíz cuadrada en forma directa
        return raiz * raiz == numero; // Calcular el cuadrado de la raíz con el número
    }
}
