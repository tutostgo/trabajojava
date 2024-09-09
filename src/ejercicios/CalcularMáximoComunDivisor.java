package ejercicios;

public class CalcularMáximoComunDivisor {
    public static void main(String[] args) {
        // Inicializar números
        int a = 48;
        int b = 18;

        // Calculamos el MCD usando el algoritmo de Euclides de forma compacta
        int mcd = calcularMCD(a, b);

        // Imprimimos el resultado
        System.out.println("El MCD de " + a + " y " + b + " es " + mcd);
    }

    // Método para calcular el Max Comun Divisor usando el algoritmo de Euclides
    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            a = a % b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}
