# ✈️ Simulación de Reserva de Vuelos (POO en Java)

Este proyecto es una aplicación en Java que modela el proceso de reserva de asientos dentro de un vuelo comercial. Demuestra cómo validar la disponibilidad de un recurso, cambiar el estado interno de los objetos y gestionar la interacción entre pasajeros, vuelos y asientos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El sistema está organizado en 4 clases principales:

*   **`Asiento`**: Representa una plaza dentro del avión.
    *   **Atributos:** `numero` (identificador), `clase` ("Economica", "Primera") y `estado` (`false` para disponible, `true` para ocupado).
*   **`Vuelo`**: Administra el código de vuelo y contiene las referencias de los asientos.
    *   **Atributos:** `codigo` y la composición de 3 instancias de `Asiento` (`asiento1`, `asiento2`, `asiento3`).
    *   **Métodos:** `reservarAsiento(String numeroAsiento)`, busca el asiento solicitado por su número, verifica si está disponible, cambia su estado a ocupado y retorna `true` o `false` según el resultado.
*   **`Pasajero`**: Modela al cliente que solicita el servicio.
    *   **Atributos:** `nombre` y `dni`.
    *   **Métodos:** `solicitarReserva(Vuelo vuelo, String numeroAsiento)`, sirve como nexo para enviar la petición de reserva al vuelo correspondiente.
*   **`Main`**: Instancia los objetos, vincula los asientos al vuelo y simula la solicitud de reserva por parte de un pasajero.

---

## ⚙️ Flujo de Operación y Validaciones

El método `reservarAsiento` evalúa las siguientes reglas de negocio antes de confirmar una reserva:

1. **Búsqueda por Identificador:** Compara el `numeroAsiento` ingresado con los asientos registrados en el vuelo usando `equals()`.
2. **Verificación de Estado:**
   * **Disponible (`estado == false`):** Se muta `estado` a `true`, se muestra la confirmación por consola y se retorna `true`.
   * **Ocupado (`estado == true`):** Se notifica el rechazo por estar ocupado y se retorna `false`.
3. **Asiento Inexistente:** Si el código no coincide con ningún asiento del vuelo, informa que el asiento no existe y retorna `false`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida:

```text
Pasajero: Alex
Reserva confirmada para el asiento 2
