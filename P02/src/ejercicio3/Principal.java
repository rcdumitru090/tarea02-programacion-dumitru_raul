package ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        Propietario p1 = new Propietario("Ana Garcia", "12345678A", "ana@correo.com");
        VehiculoElectrico v1 = new VehiculoElectrico("1234ABC", "Renault ArkanaE", p1, 80, 300, 0);

        System.out.print("Nombre completo: ");
        String nombre2 = sc.nextLine();
        System.out.print("DNI: ");
        String dni2 = sc.nextLine();
        System.out.print("Correo electronico: ");
        String correo2 = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula2 = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo2 = sc.nextLine();
        
        System.out.print("Batería (0-100): ");
        double bateria2 = sc.nextDouble();
        System.out.print("Autonomía máxima (km): ");
        double autonomia2 = sc.nextDouble();
        System.out.print("Kilómetros totales: ");
        double km2 = sc.nextDouble();

        Propietario p2 = new Propietario(nombre2, dni2, correo2);
        VehiculoElectrico v2 = new VehiculoElectrico(matricula2, modelo2, p2, bateria2, autonomia2, km2);

        System.out.println("{------}");
        v1.mostrarInformacion();
        System.out.println("{------}");
        v2.mostrarInformacion();
        System.out.println("{------}");

        System.out.println();
        System.out.print("Km del trayecto del v1: ");
        double trayecto1 = sc.nextDouble();
        double recorrido1 = v1.realizarTrayecto(trayecto1);

        System.out.println();
        System.out.print("Km del trayecto del v2: ");
        double trayecto2 = sc.nextDouble();
        double recorrido2 = v2.realizarTrayecto(trayecto2);

        System.out.println();
        System.out.printf("Distancia recorrida por el vehículo 1: %.2f km%n", recorrido1);
        System.out.printf("Distancia recorrida por el vehículo 2: %.2f km%n", recorrido2);

        System.out.println();
        System.out.print("Porcentaje de carga del vehículo 1: ");
        double carga1 = sc.nextDouble();
        v1.cargarBateria(carga1);

        System.out.println();
        System.out.print("Porcentaje de carga del vehículo 2: ");
        double carga2 = sc.nextDouble();
        v1.cargarBateria(carga2);

        System.out.println();
        System.out.println("INFORMACIÓN FINAL");
        v1.mostrarInformacion();
        v2.mostrarInformacion();

        sc.close();
    }
}
