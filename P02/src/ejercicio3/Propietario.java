package ejercicio3;

public class Propietario {
    private String nombre;
    private String dni;
    private String correo;
    
    public Propietario(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nDNI: %s%nCorreo: %s", nombre, dni, correo);
    }

}
