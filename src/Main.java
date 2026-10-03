public class Main {
    public static void main(String[] args) {

        Asiento asiento1 = new Asiento("1", "Economica", false);
        Asiento asiento2 = new Asiento("2", "Economica", false);
        Asiento asiento3 = new Asiento("3", "Primera", false);

        Vuelo vuelo = new Vuelo("AR123", asiento1, asiento2, asiento3);

        Pasajero pasajero = new Pasajero("Alex", "5156132165");
        pasajero.solicitarReserva(vuelo, "2");
    }
}