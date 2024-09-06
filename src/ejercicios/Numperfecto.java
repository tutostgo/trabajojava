package ejercicios;

public class Numperfecto {
    public static void main(String[] args) {
        int numero = 28; // Número a verificar

        // Calcular la suma de los divisores
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si el número es perfecto
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}
