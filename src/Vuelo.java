public class Vuelo {
    String codigo;
    Asiento asiento1;
    Asiento asiento2;
    Asiento asiento3;

    public Vuelo(String codigo, Asiento asiento1, Asiento asiento2, Asiento asiento3) {
        this.codigo = codigo;
        this.asiento1 = asiento1;
        this.asiento2 = asiento2;
        this.asiento3 = asiento3;
    }

    public boolean reservarAsiento(String numeroAsiento) {

        if (numeroAsiento.equals(asiento1.numero)) {
            if (!asiento1.estado) {
                asiento1.estado = true;
                System.out.println("Reserva confirmada para el asiento " + numeroAsiento);
                return true;
            } else {
                System.out.println("Reserva rechazada: el asiento " + numeroAsiento + " está ocupado.");
                return false;
            }
        }

        if (numeroAsiento.equals(asiento2.numero)) {
            if (!asiento2.estado) {
                asiento2.estado = true;
                System.out.println("Reserva confirmada para el asiento " + numeroAsiento);
                return true;
            } else {
                System.out.println("Reserva rechazada: el asiento " + numeroAsiento + " está ocupado.");
                return false;
            }
        }

        if (numeroAsiento.equals(asiento3.numero)) {
            if (!asiento3.estado) {
                asiento3.estado = true;
                System.out.println("Reserva confirmada para el asiento " + numeroAsiento);
                return true;
            } else {
                System.out.println("Reserva rechazada: el asiento " + numeroAsiento + " está ocupado.");
                return false;
            }
        }

        System.out.println("Reserva rechazada: el asiento " + numeroAsiento + " no existe.");
        return false;
    }
}