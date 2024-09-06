package ejercicios;

public class Inversionnumero {
    public static void main(String[] args) {
        int a = 54321; // Número a invertir
        int resultado = invertirNumero(a); // Llamada al método para invertir el número
        System.out.println("Número original: " + a);
        System.out.println("Número invertido: " + resultado);
    }

    // Método para invertir el número
    public static int invertirNumero(int a) {
        int resultado = 0;
        while (a > 0) {
            resultado = resultado * 10 + (a % 10); // Añadir el último dígito al resultado
            a /= 10; // Eliminar el último dígito del número original
        }
        return resultado;
    }
}
