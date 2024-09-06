package ejercicios;

public class Conteodigitosnum {
    public static void main(String[] args) {
        int numero = 987654; // Número para contar dígitos
        int cantidadDeDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDeDigitos + " dígitos.");
    }

    // Método para contar dígitos de un núm
    public static int contarDigitos(int numero) {
        if (numero == 0) return 1; // El número 0 tiene 1 dígito

        int cantidad = 0;
        while (numero > 0) {
            cantidad++;
            numero /= 10; // Elimina el último dígito
        }

        return cantidad;
    }
}
