package ejercicio3;

public class VehiculoElectrico {
    String matricula;
    String modelo;
    private Propietario propietario;
    double bateria;
    double autonomiaMaxima;
    double kmTotales;

    public VehiculoElectrico(String matricula, String modelo, Propietario propietario, double bateria, double autonomiaMaxima, double kmTotales) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.propietario = propietario;
        this.bateria = bateria;
        this.autonomiaMaxima = autonomiaMaxima;
        this.kmTotales = kmTotales;
    }

    public double calcularAutonomia() {
        return (bateria * autonomiaMaxima) / 100;
    }

    public double realizarTrayecto(double kilometros) {
        double autonomiaDispo = calcularAutonomia();
        double recorrido = Math.min(kilometros, autonomiaDispo);
        double bateriaGastada = recorrido * 100 / autonomiaMaxima;
        bateria = Math.max(0, bateria - bateriaGastada);
        kmTotales += recorrido;
        return recorrido;
    }

    public void cargarBateria(double porcentaje) {
        bateria = Math.min(100, bateria + porcentaje);
    }

    public void mostrarInformacion() {
        System.out.println(modelo + " (" + matricula + ")");
        System.out.println("------");
        System.out.println(propietario);
        System.out.println("------");
        System.out.printf("Batería: %.2f%%%n", bateria);
        System.out.printf("Autonomía: %.2f km%n", calcularAutonomia());
        System.out.printf("Km totales: %.2f km%n", kmTotales);
    }
}
