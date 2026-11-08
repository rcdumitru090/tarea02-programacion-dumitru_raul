package ejercicio2;

import java.util.Scanner;

public class CalculadoraDeportiva {
    public static double calcularVelocidad(double distancia, double tiempo) {
        return distancia / tiempo; // Velocidad = distancia / tiempo
    }

    public static void convertirMinutos(int minutosTotales) {
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;

        System.out.printf("Tiempo: %d h %d min%n", horas, minutos);
    }

    public static double calcularCalorias(double peso, double tiempo, double factor) {
        return peso * tiempo * factor;        
    }

    public static void mostrarResultado(double velocidad) {
        System.out.println(velocidad >= 20 ? "Velocidad alta" : "Velocidad moderada");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);
        System.out.println("CALCULADORA DEPORTIVA");

        System.out.print("Nombre del deportista: ");
        String nombreDeportista = sc.nextLine();

        System.out.print("Distancia (km): ");
        double distanciaKm = sc.nextDouble();

        System.out.print("Tiempo (minutos): ");
        int tiempoMinutos = sc.nextInt();

        System.out.print("Peso (KG): ");
        double peso = sc.nextDouble();

        double tiempoHoras = tiempoMinutos / 60.0;

        double factor = 8.0;
        double velocidad = calcularVelocidad(distanciaKm, tiempoHoras);
        double calorias = calcularCalorias(peso, tiempoHoras, factor);

        System.out.println();
        System.out.println("RESULTADOS");
        convertirMinutos(tiempoMinutos);
        System.out.printf("Velocidad media: %.2f km/h%n", velocidad);
        mostrarResultado(velocidad);
        System.out.printf("Calorías consumidas: %.2f kcal%n", calorias);

        sc.close();
    }
}
