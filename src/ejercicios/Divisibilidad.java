package ejercicios;

public class Divisibilidad {
    public static void main(String[] args) {
        int numero = 45; // Número a verificar

        // Verificar divisibilidad e imprimir resultados directamente
        System.out.println("El número " + numero + " es divisible por 2: " + (numero % 2 == 0));
        System.out.println("El número " + numero + " es divisible por 3: " + (numero % 3 == 0));
        System.out.println("El número " + numero + " es divisible por 5: " + (numero % 5 == 0));
    }
}
