package ejercicios;

public class NumArmstrong {
    public static void main(String[] args) {
        int numero = 153; // Número a verificar
        int suma = 0;
        int temp = numero;
        int numeroDeDigitos = (int) Math.log10(numero) + 1; // Número de dígitos

        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, numeroDeDigitos);
            temp /= 10;
        }

        // Verificar si el número es Armstrong
        if (suma == numero) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }
    }
}
