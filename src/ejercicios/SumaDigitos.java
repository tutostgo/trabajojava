package ejercicios;

public class SumaDigitos {
    public static void main(String[] args) {
        int a = 5678;
        int suma = 0;
        while (a > 0) {
            suma += a % 10;
            a /= 10;
        }
        System.out.println(suma);
    }
}
