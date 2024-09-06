package ejercicios;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 7.0; // Radio del círculo
        double area = Math.PI * radio * radio; // Cálculo del área usando librería

        System.out.printf("Entonces el área del círculo con radio %.2f es %.2f%n", radio, area);
    }
}
