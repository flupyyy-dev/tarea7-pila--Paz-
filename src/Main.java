public class Main {
    public static void main(String[] args) {
        BitacoraStack bitacora = new BitacoraStack();

        // Una pila es adecuada porque el evento más reciente debe revisarse primero.
        // Eso coincide con el comportamiento LIFO: último en entrar, primero en salir.
        // Con una lista normal accediendo por índice se rompería la lógica natural del sistema.
        // Además, sería más fácil consultar o borrar elementos que no están en la cima.

        try {
            bitacora.registrar("Motor de estribor encendido");
            bitacora.registrar("Velocidad warp alcanzada");
            bitacora.registrar("Señal de comunicación estable");
            bitacora.registrar("Anomalía detectada en sector 7");
            bitacora.registrar("Escudos al 40%");
            bitacora.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

            System.out.println("=== BITÁCORA DE EVENTOS USS Algoritmo ===\n");

            System.out.println("Último evento registrado:");
            String ultimoEvento = bitacora.consultarUltimo();
            System.out.println(ultimoEvento + "\n");

            if (ultimoEvento.contains("ERROR")) {
                System.out.println("Protocolo de revisión activado.");
                System.out.println("Eliminando los últimos 3 eventos registrados:\n");

                for (int i = 0; i < 3; i++) {
                    String eliminado = bitacora.eliminarUltimo();
                    System.out.println("Evento removido: " + eliminado);
                }
                System.out.println();
            }

            System.out.println("Estado actual de la bitácora:");
            System.out.println("Total de eventos restantes: " + bitacora.totalEventos());

            if (!bitacora.estaVacia()) {
                System.out.println("Evento actual en la cima: " + bitacora.consultarUltimo());
            } else {
                System.out.println("La bitácora quedó vacía.");
            }

        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Error del sistema: " + e.getMessage());
        }
    }
}

// Una pila es la estructura correcta porque permite acceder primero
// al último evento registrado. Esto es importante en sistemas de bitácora
// donde lo más reciente es lo más relevante. Si se usara una lista normal,
// se perdería esta lógica y el sistema sería menos eficiente.