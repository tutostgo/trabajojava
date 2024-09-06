package ejercicios;

public class Raizcuadradasinlibreria {
    public static void main(String[] args) {
        int numero = 49; // Número del cual calcular la raíz cuadrada
        double resultado = calcularRaizCuadrada(numero);
        System.out.printf("La raíz cuadrada de %d es cerca de %.5f%n", numero, resultado);
    }

    // Método para calcular la raíz cuadrada usando una aprox. simple
    public static double calcularRaizCuadrada(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }

        double estimacion = numero; // Vinicial para la estimación
        double tolerancia = 0.00001; // Tolerancia para precisión de resultado

        // Método de aproximación simplificado
        while (Math.abs(estimacion * estimacion - numero) > tolerancia) {
            estimacion = (estimacion + numero / estimacion) / 2;
        }

        return estimacion;
    }
}
