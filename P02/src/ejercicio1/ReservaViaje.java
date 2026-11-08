package ejercicio1;

public class ReservaViaje {
    public static void main(String[] args) {
        // String porque son cadenas de texto, int al ser números enteros, double al ser números decimales y boolean al ser verdadero o falso
        String nombreCompleto = "Laura Martinez";
        String codigoReserva = "TR2026A45";
        int edadPasajero = 24;
        double distanciaKm = 320;
        double precioBillete = 48;
        int numeroMaletas = 2;
        boolean hayDescuento = true;
        // Descuento del 15%. Es decir, paga solo el 85% del precio original. Por eso multiplicamos por 0.85.
        double precioFinal = hayDescuento ? precioBillete * 0.85 : precioBillete;
        double precioPorKilometro = precioFinal / distanciaKm;

        System.out.println("Nombre del pasajero: " + nombreCompleto);
        System.out.println("Código de reserva: " + codigoReserva);
        System.out.println("Edad del pasajero: " + edadPasajero);
        System.out.printf("Distancia: %.2f km%n", distanciaKm);
        System.out.println("Número de maletas: " + numeroMaletas);
        System.out.printf("Precio original: %.2f €%n", precioBillete);
        System.out.println(hayDescuento ? "Descuento aplicado" : "Sin descuento");
        System.out.printf("Precio final: %.2f €%n", precioFinal);
        System.out.printf("Coste por kilómetro: %.2f €/km%n", precioPorKilometro);
    }
    

    

}
