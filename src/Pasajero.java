public class Pasajero {
    String nombre;
    String dni;

    public Pasajero(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void solicitarReserva(Vuelo vuelo, String numeroAsiento) {
        System.out.println("Pasajero: " + nombre);
        vuelo.reservarAsiento(numeroAsiento);
    }
}
