package ejercicios;

public class Sumarmultnumrango {
    public static void main(String[] args) {
        int a = 3; // Num con múltiplos que quiero sumar
        int rangoMaximo = 50; // Límite superior

        // Sumar múltiplos de 'a' en el rango de 1 a 'rangoMaximo'
        int suma = 0;
        for (int i = a; i <= rangoMaximo; i += a) {
            suma += i;
        }

        System.out.println("La suma de todos los múltiplos de " + a + " en el rango de 1 a " + rangoMaximo + " es: " + suma);
    }
}
